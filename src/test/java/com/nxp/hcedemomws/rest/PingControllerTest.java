package com.nxp.hcedemomws.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

import com.nxp.hcedemomws.util.Utils;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:application.properties")
public class PingControllerTest {
  
  @MockBean
  Utils utils;

  @Autowired
  PingController pingController;

  private MockMvc mockMvc;

  @Before
  public void setUp() {
    this.mockMvc = MockMvcBuilders.standaloneSetup(this.pingController).build();
  }
  
  @Test
  public void testPingWithSuccess() throws Exception{
    String accessToken = "test-token";
    Mockito.when(utils.fetchAccessToken(Mockito.any())).thenReturn(accessToken);
    ResultActions result = this.mockMvc.perform(get("/ping")).andExpect(status().isOk());
    Assert.assertEquals(200, result.andReturn().getResponse().getStatus());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("accessToken:test-token"));
  }
  
  @Test
  public void testPingWithNullToken() throws Exception{
    String accessToken = null;
    Mockito.when(utils.fetchAccessToken(Mockito.any())).thenReturn(accessToken);
    ResultActions result = this.mockMvc.perform(get("/ping")).andExpect(status().isOk());
    Assert.assertEquals(200, result.andReturn().getResponse().getStatus());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("#Error occuring during Ping API invocation"));
  }
  
  @Test
  public void testPingWithException() throws Exception{
    Mockito.when(utils.fetchAccessToken(Mockito.any())).thenThrow(RestClientException.class);
    ResultActions result = this.mockMvc.perform(get("/ping")).andExpect(status().isOk());
    Assert.assertEquals(200, result.andReturn().getResponse().getStatus());
    Assert.assertTrue(result.andReturn().getResponse().getContentAsString().contains("Ping returns,"));
  }

}
