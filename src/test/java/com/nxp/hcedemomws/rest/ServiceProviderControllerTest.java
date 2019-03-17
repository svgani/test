package com.nxp.hcedemomws.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestClientException;

import com.nxp.hcedemomws.dto.GetServiceProvidersResponse;
import com.nxp.hcedemomws.dto.GetWidgetsResponse;
import com.nxp.hcedemomws.dto.ResponseContext;
import com.nxp.hcedemomws.dto.ServiceProviderDetails;
import com.nxp.hcedemomws.dto.WidgetDetails;
import com.nxp.hcedemomws.util.Utils;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application.properties")
public class ServiceProviderControllerTest {

  @MockBean
  Utils utils;

  @Autowired
  ServiceProviderController serviceProviderController;

  private MockMvc mockMvc;

  @Before
  public void setUp() {
    this.mockMvc = MockMvcBuilders.standaloneSetup(this.serviceProviderController).build();
  }

  @Test
  public void testServiceProviders() throws Exception {
    GetServiceProvidersResponse response = new GetServiceProvidersResponse();
    ServiceProviderDetails serviceProviderDetails = new ServiceProviderDetails();

    ResponseContext responseContext = new ResponseContext();
    responseContext.setResponseCode("00");
    responseContext.setResponseMessage("success");

    serviceProviderDetails.setServiceProviderID("NAME_CRTM");
    List<ServiceProviderDetails> serviceProviderDetailsList = new ArrayList<ServiceProviderDetails>();
    serviceProviderDetailsList.add(serviceProviderDetails);
    response.setSpList(serviceProviderDetailsList);
    response.setResponseContext(responseContext);

    Mockito.when(utils.postRequest(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(response);
    ResultActions result = this.mockMvc.perform(get("/wallets/WP0000001/serviceproviders")).andExpect(status().isOk());
    Assert.assertEquals(200, result.andReturn().getResponse().getStatus());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("success"));
  }

  @Test
  public void testServiceProvidersWithException() throws Exception {
    GetServiceProvidersResponse response = new GetServiceProvidersResponse();
    ServiceProviderDetails serviceProviderDetails = new ServiceProviderDetails();

    ResponseContext responseContext = new ResponseContext();
    responseContext.setResponseCode("00");
    responseContext.setResponseMessage("success");

    serviceProviderDetails.setServiceProviderID("NAME_CRTM");
    List<ServiceProviderDetails> serviceProviderDetailsList = new ArrayList<ServiceProviderDetails>();
    serviceProviderDetailsList.add(serviceProviderDetails);
    response.setSpList(serviceProviderDetailsList);
    response.setResponseContext(responseContext);

    Mockito.when(utils.postRequest(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenThrow(RestClientException.class);
    ResultActions result = this.mockMvc.perform(get("/wallets/WP0000001/serviceproviders")).andExpect(status().isOk());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("failed"));
  }

  @Test
  public void testWidgets() throws Exception {
    WidgetDetails widgetDetails = new WidgetDetails();
    widgetDetails.setServiceProviderID("NAME_CRTM");
    List<WidgetDetails> widgetDetailList = new ArrayList<WidgetDetails>();
    widgetDetailList.add(widgetDetails);

    ResponseContext responseContext = new ResponseContext();
    responseContext.setResponseCode("00");
    responseContext.setResponseMessage("success");

    GetWidgetsResponse getWidgetsResponse = new GetWidgetsResponse();
    getWidgetsResponse.setResponseContext(responseContext);
    getWidgetsResponse.setWidgetList(widgetDetailList);

    Mockito.when(utils.postRequest(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(getWidgetsResponse);
    ResultActions result = this.mockMvc.perform(get("/wallets/1111/serviceproviders/NAME_CRTM/widgets")).andExpect(status().isOk());
    Assert.assertEquals(200, result.andReturn().getResponse().getStatus());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("success"));
  }

  @Test
  public void testWidgetsWithException() throws Exception {
    WidgetDetails widgetDetails = new WidgetDetails();
    widgetDetails.setServiceProviderID("NAME_CRTM");
    List<WidgetDetails> widgetDetailList = new ArrayList<WidgetDetails>();
    widgetDetailList.add(widgetDetails);

    ResponseContext responseContext = new ResponseContext();
    responseContext.setResponseCode("00");
    responseContext.setResponseMessage("success");

    GetWidgetsResponse getWidgetsResponse = new GetWidgetsResponse();
    getWidgetsResponse.setResponseContext(responseContext);
    getWidgetsResponse.setWidgetList(widgetDetailList);

    Mockito.when(utils.postRequest(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenThrow(RestClientException.class);
    ResultActions result = this.mockMvc.perform(get("/wallets/1111/serviceproviders/NAME_CRTM/widgets")).andExpect(status().isOk());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("failed"));
  }

}
