package com.nxp.hcedemomws.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;

import com.nxp.hcedemomws.dto.GenerateProductIDResponse;
import com.nxp.hcedemomws.dto.InitPurchaseOrderResponse;
import com.nxp.hcedemomws.dto.TicketReferenceDataV1;
import com.nxp.hcedemomws.service.CRTMService;
import com.nxp.hcedemomws.service.impl.CRTMServiceImpl;
import com.nxp.hcedemomws.util.Utils;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application.properties")
public class TicketPurchaseControllerTest {

  @Autowired
  TicketPurchaseController ticketPurchaseController;

  @Autowired
  ConfigBean configBean;

  @Mock
  CRTMService crtmService;

  @MockBean
  Utils utils;

  @MockBean
  RestTemplate restTemplate;

  @Autowired
  CRTMServiceImpl crtmServiceImpl;

  private MockMvc mockMvc;
  
  @MockBean
  com.nxp.hcedemomws.dto.ResponseContext responseContext;

  @Before
  public void setUp() {
    this.mockMvc = MockMvcBuilders.standaloneSetup(this.ticketPurchaseController).build();
  }

  @Test
  public void testconfirmPurchaseV1() throws Exception {
    Mockito.when(utils.buildRestTemplateFactory(true)).thenReturn(restTemplate);
    InitPurchaseOrderResponse response = new InitPurchaseOrderResponse();
    response.setResponseCode("00");
    response.setResponseMsg("Success");
    response.setM2gReference("Test-12345");
    ResponseEntity<InitPurchaseOrderResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    Mockito.when(crtmService.processInitPurchaseOrder(Mockito.any())).thenReturn(response);
    Mockito.when(restTemplate.postForEntity(Mockito.anyString(), Mockito.anyObject(), Mockito.any(Class.class))).thenReturn(responseEntity);
    ResultActions result = this.mockMvc.perform(get("/confirmpurchase/v1/wallets/MJWUPORNCL/serviceproviders/NAME_CRTM/widgets/0420040100")).andExpect(status().isOk());
    Assert.assertEquals(200, result.andReturn().getResponse().getStatus());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("success"));
  }
  
  @Test
  public void testconfirmPurchaseV1ServiceNotAvailable() throws Exception {
    Mockito.when(utils.buildRestTemplateFactory(true)).thenReturn(restTemplate);
    InitPurchaseOrderResponse response = new InitPurchaseOrderResponse();
    response.setResponseCode("99");
    ResponseEntity<InitPurchaseOrderResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    Mockito.when(crtmService.processInitPurchaseOrder(Mockito.any())).thenReturn(response);
    Mockito.when(restTemplate.postForEntity(Mockito.anyString(), Mockito.anyObject(), Mockito.any(Class.class))).thenReturn(responseEntity);
    ResultActions result = this.mockMvc.perform(get("/confirmpurchase/v1/wallets/MJWUPORNCL/serviceproviders/NAME_CRTM/widgets/0420040100")).andExpect(status().isOk());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("failed"));
  }
  
  @Test
  public void testconfirmPurchaseV1SpDown() throws Exception {
    responseContext = new com.nxp.hcedemomws.dto.ResponseContext();
    responseContext.setRequestId("123");
    responseContext.setResponseMessage("SUCCESS");
    TicketReferenceDataV1 trReferenceDataV1 = new TicketReferenceDataV1();
    trReferenceDataV1.setIntentURL("URL");
    trReferenceDataV1.setM2gReference("123");
    trReferenceDataV1.setSpProductReference("111");
    List<TicketReferenceDataV1> references = new ArrayList<>();
    references.add(trReferenceDataV1);
    GenerateProductIDResponse generateProductIDResponse = new GenerateProductIDResponse();
    generateProductIDResponse.setResponseContext(responseContext);
    generateProductIDResponse.setReferences(references);
    Mockito.when(utils.postRequestWithAbsoluteURL(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(generateProductIDResponse);
    ResultActions result = this.mockMvc.perform(get("/confirmpurchase/v1/wallets/MJWUPORNCL/serviceproviders/CRTM/widgets/0420040100")).andExpect(status().isOk());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("SUCCESS"));
  }
  
  @Test
  public void testconfirmPurchaseV1SpFailure() throws Exception {
    ResultActions result = this.mockMvc.perform(get("/confirmpurchase/v1/wallets/MJWUPORNCL/serviceproviders/CRTM/widgets/0420040100")).andExpect(status().isOk());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("failed"));
  }
}
