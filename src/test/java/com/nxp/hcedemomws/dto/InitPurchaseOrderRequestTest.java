package com.nxp.hcedemomws.dto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InitPurchaseOrderRequestTest {

  @InjectMocks
  InitPurchaseOrderRequest initPurchaseOrderRequest;
  
  @Test
  public void testInitPurchaseOrderRequestEntity() {
    initPurchaseOrderRequest.setDeviceId("123");
    initPurchaseOrderRequest.setGoogleAccountId("accountmail");
    initPurchaseOrderRequest.setProduct("123");
    Assert.assertEquals("123", initPurchaseOrderRequest.getDeviceId());
    Assert.assertEquals("accountmail", initPurchaseOrderRequest.getGoogleAccountId());
    Assert.assertEquals("123", initPurchaseOrderRequest.getProduct());
  }
}
