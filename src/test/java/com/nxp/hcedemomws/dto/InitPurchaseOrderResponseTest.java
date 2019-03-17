package com.nxp.hcedemomws.dto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InitPurchaseOrderResponseTest {

  @InjectMocks
  InitPurchaseOrderResponse initPurchaseOrderResponse;
  
  @Test
  public void testInitPurchaseOrderResponseEntity() {
    initPurchaseOrderResponse.setIntentURL("URL");
    initPurchaseOrderResponse.setM2gReference("123-123-123");
    initPurchaseOrderResponse.setResponseCode("00");
    initPurchaseOrderResponse.setResponseMsg("Success");
    Assert.assertEquals("URL", initPurchaseOrderResponse.getIntentURL());
    Assert.assertEquals("123-123-123", initPurchaseOrderResponse.getM2gReference());
    Assert.assertEquals("00", initPurchaseOrderResponse.getResponseCode());
    Assert.assertEquals("Success", initPurchaseOrderResponse.getResponseMsg());
  }
}
