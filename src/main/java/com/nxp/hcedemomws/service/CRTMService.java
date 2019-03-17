package com.nxp.hcedemomws.service;

import com.nxp.hcedemomws.dto.InitPurchaseOrderRequest;
import com.nxp.hcedemomws.dto.InitPurchaseOrderResponse;

public interface CRTMService {
  
  public InitPurchaseOrderResponse processInitPurchaseOrder(InitPurchaseOrderRequest InitPurchaseOrderRequest) throws Exception;

}
