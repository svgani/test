/**
 * 
 */
package com.nxp.hcedemomws.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.apache.http.Header;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nxp.hcedemomws.dto.AckTicketPurchaseResponse;
import com.nxp.hcedemomws.dto.AcknowledgeTransitBundleRequest;
import com.nxp.hcedemomws.dto.AcknowledgeTransitBundleResponse;
import com.nxp.hcedemomws.dto.BaseResponse;
import com.nxp.hcedemomws.dto.DCResponse;
import com.nxp.hcedemomws.dto.DeviceData;
import com.nxp.hcedemomws.dto.DigitizationContext;
import com.nxp.hcedemomws.dto.DigitizeCardRequest;
import com.nxp.hcedemomws.dto.DigitizeCardResponse;
import com.nxp.hcedemomws.dto.DigitizeTicketRequest;
import com.nxp.hcedemomws.dto.DigitizeTicketResponse;
import com.nxp.hcedemomws.dto.GenerateProductIDRequest;
import com.nxp.hcedemomws.dto.GenerateProductIDResponse;
import com.nxp.hcedemomws.dto.GenerateTicketIDRequest;
import com.nxp.hcedemomws.dto.InitPurchaseOrderRequest;
import com.nxp.hcedemomws.dto.InitPurchaseOrderResponse;
import com.nxp.hcedemomws.dto.OemResponse;
import com.nxp.hcedemomws.dto.Products;
import com.nxp.hcedemomws.dto.RequestContext;
import com.nxp.hcedemomws.dto.RequestContextV1;
import com.nxp.hcedemomws.dto.RiskData;
import com.nxp.hcedemomws.dto.Ticket;
import com.nxp.hcedemomws.dto.TicketPurchaseResponse;
import com.nxp.hcedemomws.dto.TransitBundle;
import com.nxp.hcedemomws.dto.UCRequest;
import com.nxp.hcedemomws.dto.UTRequest;
import com.nxp.hcedemomws.dto.UndigitizeCardRequest;
import com.nxp.hcedemomws.dto.UndigitizeTicketRequest;
import com.nxp.hcedemomws.dto.UndigitizeTicketResponse;
import com.nxp.hcedemomws.service.CRTMService;
import com.nxp.hcedemomws.util.Utils;
import com.nxp.hcedemomws.dto.GenerateTicketIDResponse;
import com.nxp.hcedemomws.util.JsonUtil;
import com.nxp.hcedemomws.util.MIFARECommonUtils;

/**
 * @author nxa30710
 *
 */

@RestController
@RequestMapping(value = "/")
public class TicketPurchaseController {

  @Autowired
  public ConfigBean configBean;
  
  @Autowired
  CRTMService crtmService;
  
  @Autowired
  Utils utils;

  public static Logger LOG = LoggerFactory.getLogger(TicketPurchaseController.class);

  @RequestMapping(value = "confirmpurchase/wallets/{walletId}/serviceproviders/{spId}/widgets/{widgetId}", params = {
    "tosUrl"}, method = RequestMethod.GET)
  public TicketPurchaseResponse confirmPurchase(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "spId") String spId, @PathVariable(value = "widgetId") String widgetId,
    @RequestParam(value = "tosUrl") String tosUrl) {
    LOG.info("####################Received tosURL:" + tosUrl);
    TicketPurchaseResponse ticketPurchaseResponse = null;
    String ticketId = "";
    String result = "success";
    String status = "success";
    try {
      GenerateTicketIDRequest request = new GenerateTicketIDRequest();
      RequestContext requestContext = new RequestContext();
      requestContext.setCorrelationId("" + System.currentTimeMillis());
      requestContext.setRequesterId(spId);
      requestContext.setRequestId("" + System.currentTimeMillis());
      requestContext.setTimeZone("GMT-8:00");
      request.setRequestContext(requestContext);
      Ticket ticket = new Ticket();
      List<Ticket> tickets = new ArrayList<>();
      tickets.add(ticket);
      // String s = String.format("%x", (int) (Math.random() * 100));
      // s = s.length() != 1 ? s : "0" + s;
      // ticket.setTicketId("d4e016be6f9c440b981249fde210c6bf");
      // ticketId = "d4e016be6f9c440b981249fde210c6" + s;
      // ticket.setTicketId(ticketId);
      ticketId = MIFARECommonUtils.getHexString(MIFARECommonUtils.getRandomBytes(16));
      ticket.setTicketId(ticketId);
         LOG.info("#Generated Ticket Id:" + ticket.getTicketId());
      request.setTickets(tickets);
      request.setEmailID("smith@testdomain.com");
      Header[] headers = new Header[] {
        new BasicHeader("content-type", ContentType.APPLICATION_JSON.getMimeType())};
      // GenerateTicketIDResponse response = mifareClient.invokePost(request, GenerateTicketIDResponse.class,
      // headers);
      GenerateTicketIDResponse response = utils.postRequestWithAbsoluteURL(request, configBean, configBean.getMifareServiceBaseUrl() + configBean.getGENERATE_PRODUCT_REFERENCE(),
        GenerateTicketIDResponse.class);
      result = JsonUtil.toJSON(response);
      ticketPurchaseResponse = TicketPurchaseResponse.builder().status(status).ticketId(ticketId)
        .digitalTicketId(response.getTicketReferences().get(0).getTicketReference()).build();
    } catch (Exception e) {
      LOG.info("#Error occurred during confirm purchase:" + e);
      result = "failed";
      ticketPurchaseResponse = TicketPurchaseResponse.builder().status(result).build();
    }
    return ticketPurchaseResponse;
  }

  @RequestMapping(value = "digitizeticket/wallets/{walletId}/serviceproviders/{spId}/widgets/{widgetId}/tickets/{ticketId}", method = RequestMethod.GET)
  public TicketPurchaseResponse digitizeTicket(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "spId") String spId, @PathVariable(value = "widgetId") String widgetId,
    @PathVariable(value = "ticketId") String ticketId) {
    TicketPurchaseResponse ticketPurchaseResponse = null;
    String result = "success";
    String status = "success";
    try {
      LOG.info("#Digitization starts here ...");
      DigitizeCardRequest digitizeCardRequest = new DigitizeCardRequest();
      RequestContext requestContext = new RequestContext();
      requestContext.setCorrelationId("" + System.currentTimeMillis());
      requestContext.setRequesterId(spId);
      requestContext.setRequestId("" + System.currentTimeMillis());
      requestContext.setTimeZone("GMT-8:00");
      digitizeCardRequest.setRequestContext(requestContext);
      // requestContext.setRequesterId("784JBRFIWX");
      requestContext.setRequesterId(walletId);
      digitizeCardRequest.setRequestContext(requestContext);
      DigitizationContext digitizationContext = new DigitizationContext();
      // digitizationContext.setWalletId("784JBRFIWX");
      digitizationContext.setWalletId(walletId);
      digitizeCardRequest.setDigitizationContext(digitizationContext);
      DeviceData dd = new DeviceData();
      dd.setModel("n8");
      dd.setDeviceId("1111111");
      dd.setManufacturer("nokia");
      dd.setNickname("n8");
      dd.setPhoneNumber("");
      dd.setBrand("nokia8");
      digitizeCardRequest.setDeviceData(dd);
      digitizeCardRequest.setTransitAgencyId(spId);
      // DigitizeCardResponse digitizeCardResponse = PTOHttpClientUtils.postRequest(digitizeCardRequest,
      // buildMifareServiceOAuth2Config(), MIFARE_DIGITIZE_CARD_URL, DigitizeCardResponse.class);
      DigitizeCardResponse digitizeCardResponse = utils.postRequest(digitizeCardRequest,
        configBean, configBean.getMIFARE_DIGITIZE_CARD_URL(), DigitizeCardResponse.class);
      if (digitizeCardResponse.getResponseContext().getResponseMessage().equalsIgnoreCase("Success")) {
        DigitizeTicketRequest digitizeTicketRequest = new DigitizeTicketRequest();
        digitizeTicketRequest.setRequestContext(requestContext);
        digitizeTicketRequest.setDigitizationContext(digitizationContext);
        digitizeTicketRequest.setTicketId(ticketId);
        digitizeTicketRequest.setDigitalCardId(digitizeCardResponse.getDigitalCardId());
        digitizeTicketRequest.setTransitBundle(digitizeCardResponse.getTransitBundle());
        RiskData riskData = new RiskData();
        riskData.setClientType("ANDROID_PAY");
        riskData.setLatitudeNoDecimals("111111111111111111111111111");
        riskData.setLongitudeNoDecimals("111111111111111111111111111");
        riskData.setIpAddress("111111111111111111111111111111");
        riskData.setRiskAlgorithmVersion("1.0");
        riskData.setDeviceScore(1);
        riskData.setAccountScore(2);
        riskData.setWalletAccountTenureWeeks(1);
        riskData.setGaiaAccountTenureWeeks(1);
        riskData.setOsVersion("6");
        riskData.setNetworkOperator("");
        riskData.setNetworkType("CELLULAR");
        riskData.setDeviceTimezone("1");
        digitizeTicketRequest.setRiskData(riskData);
        DigitizeTicketResponse digitizeTicketResponse = utils.postRequest(digitizeTicketRequest, configBean,
          configBean.getMIFARE_DIGITIZE_TICKET_URL(), DigitizeTicketResponse.class);
        result = JsonUtil.toJSON(digitizeCardResponse);
        if (digitizeTicketResponse.getResponseContext().getResponseMessage().equalsIgnoreCase("success")) {
          // TODO Acknowledge digital ticket.
          AcknowledgeTransitBundleRequest acknowledgeTransitBundleRequest = new AcknowledgeTransitBundleRequest();
          requestContext = new RequestContext();
          requestContext.setCorrelationId("" + System.currentTimeMillis());
          requestContext.setRequesterId(walletId);
          requestContext.setRequestId("" + System.currentTimeMillis());
          requestContext.setTimeZone("GMT-8:00");
          acknowledgeTransitBundleRequest.setRequestContext(requestContext);
          digitizationContext = new DigitizationContext();
          digitizationContext.setWalletId(walletId);
          acknowledgeTransitBundleRequest.setDigitizationContext(digitizationContext);
          acknowledgeTransitBundleRequest.setDigitalCardId(digitizeCardResponse.getDigitalCardId());
          acknowledgeTransitBundleRequest
            .setTransitBundleId(digitizeTicketResponse.getTransitBundle().getBundleId());
          AcknowledgeTransitBundleResponse acknowledgeTransitBundleResponse = utils.postRequest(
            acknowledgeTransitBundleRequest, configBean,
            configBean.getMIFARE_DIGITIZE_TICKET_ACK_URL(), AcknowledgeTransitBundleResponse.class);
          if (acknowledgeTransitBundleResponse.getResponseContext().getResponseMessage()
            .equalsIgnoreCase("success")) {
            LOG.info("#Effected digital ticket id:"
              + acknowledgeTransitBundleResponse.getAffectedDigitalTicketId());
            ticketPurchaseResponse = TicketPurchaseResponse.builder().status("success")
              .digitalCardId(digitizeCardResponse.getDigitalCardId())
              .digitalTicketId(acknowledgeTransitBundleResponse.getAffectedDigitalTicketId())
              .transitBundle(digitizeTicketResponse.getTransitBundle()).build();
          } else {
            ticketPurchaseResponse = TicketPurchaseResponse.builder().status("failed")
              .digitalTicketId(digitizeTicketResponse.getDigitalTicketId())
              .transitBundle(digitizeTicketResponse.getTransitBundle()).build();
            return ticketPurchaseResponse;
          }
          // end of acknowledge bundle
          result = JsonUtil.toJSON(digitizeTicketResponse);
          ticketPurchaseResponse = TicketPurchaseResponse.builder().status(status)
            .digitalCardId(digitizeCardResponse.getDigitalCardId())
            .digitalTicketId(acknowledgeTransitBundleResponse.getAffectedDigitalTicketId())
            .transitBundle(digitizeTicketResponse.getTransitBundle()).build();
        } else {
          result = JsonUtil.toJSON(digitizeTicketResponse);
          ticketPurchaseResponse = TicketPurchaseResponse.builder().status("failed")
            .digitalCardId(digitizeCardResponse.getDigitalCardId()).digitalTicketId(ticketId)
            .transitBundle(digitizeTicketResponse.getTransitBundle()).build();
        }
      }
    } catch (Exception e) {
      LOG.info("#Error occurred during confirm purchase:" + e);
      result = "failed";
      ticketPurchaseResponse = TicketPurchaseResponse.builder().status(result).build();
    }
    LOG.info("#Ticket Purchase Response:" + ticketPurchaseResponse);
    return ticketPurchaseResponse;
  }

  @RequestMapping(value = "ticketpurchase/wallets/{walletId}/serviceproviders/{spId}/widgets/{widgetId}", method = RequestMethod.GET)
  public TicketPurchaseResponse ticketPurchase(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "spId") String spId, @PathVariable(value = "widgetId") String widgetId) {
    TicketPurchaseResponse ticketPurchaseResponse = null;
    String result = "success";
    try {
      // PingResponse pr = PTOHttpClientUtils.postRequest(request,
      // buildMifareServiceOAuth2Config(),
      // MONORAIL_BASE_URI+MONORAIL_GENERATE_TICKET_REFERENCE_URI,
      // PingResponse.class);
      /*
       * MIFAREHttpClient mifareClient = new MIFAREHttpClient(MONORAIL_BASE_URI,
       * MONORAIL_GENERATE_TICKET_REFERENCE_URI);
       */
      // MIFAREHttpClient mifareClient = new MIFAREHttpClient.Builder().serviceURL(MONORAIL_BASE_URI)
      // .apiURL(MONORAIL_GENERATE_TICKET_REFERENCE_URI).build();
      GenerateTicketIDRequest request = new GenerateTicketIDRequest();
      RequestContext requestContext = new RequestContext();
      requestContext.setCorrelationId("" + System.currentTimeMillis());
      requestContext.setRequesterId(spId);
      requestContext.setRequestId("" + System.currentTimeMillis());
      requestContext.setTimeZone("GMT-8:00");
      request.setRequestContext(requestContext);
      Ticket ticket = new Ticket();
      List<Ticket> tickets = new ArrayList<>();
      tickets.add(ticket);
      ticket.setTicketId("d4e016be6f9c440b981249fde210c6bf");
      request.setTickets(tickets);
      request.setEmailID("smith@testdomain.com");
      Header[] headers = new Header[] {
        new BasicHeader("content-type", ContentType.APPLICATION_JSON.getMimeType())};
      // GenerateTicketIDResponse response = mifareClient.invokePost(request, GenerateTicketIDResponse.class,
      // headers);
      GenerateTicketIDResponse response = utils.postRequestWithAbsoluteURL(request, configBean,
        configBean.getMONORAIL_BASE_URI() + configBean.getMONORAIL_GENERATE_TICKET_REFERENCE_URI(), GenerateTicketIDResponse.class);
      // (request, GenerateTicketIDResponse.class,
      // headers);
      result = JsonUtil.toJSON(response);
      if (response.getResponseContext().getResponseMessage().equals("SUCCESS")) {
        // Digitization starts here ...
        LOG.info("#Digitization starts here ...");
        DigitizeCardRequest digitizeCardRequest = new DigitizeCardRequest();
        // requestContext.setRequesterId("784JBRFIWX");
        requestContext.setRequesterId(walletId);
        digitizeCardRequest.setRequestContext(requestContext);
        DigitizationContext digitizationContext = new DigitizationContext();
        // digitizationContext.setWalletId("784JBRFIWX");
        digitizationContext.setWalletId(walletId);
        digitizeCardRequest.setDigitizationContext(digitizationContext);
        DeviceData dd = new DeviceData();
        dd.setModel("n8");
        dd.setDeviceId("1111111");
        dd.setManufacturer("nokia");
        dd.setNickname("n8");
        dd.setPhoneNumber("");
        dd.setBrand("nokia8");
        digitizeCardRequest.setDeviceData(dd);
        digitizeCardRequest.setTransitAgencyId(spId);
        // DigitizeCardResponse digitizeCardResponse = PTOHttpClientUtils.postRequest(digitizeCardRequest,
        // buildMifareServiceOAuth2Config(), MIFARE_DIGITIZE_CARD_URL, DigitizeCardResponse.class);
        DigitizeCardResponse digitizeCardResponse = utils.postRequest(digitizeCardRequest, configBean, configBean.getMIFARE_DIGITIZE_CARD_URL(), DigitizeCardResponse.class);
        if (digitizeCardResponse.getResponseContext().getResponseMessage().equalsIgnoreCase("Success")) {
          DigitizeTicketRequest digitizeTicketRequest = new DigitizeTicketRequest();
          digitizeTicketRequest.setRequestContext(requestContext);
          digitizeTicketRequest.setDigitizationContext(digitizationContext);
          digitizeTicketRequest.setTicketId(response.getTicketReferences().get(0).getTicketReference());
          digitizeTicketRequest.setDigitalCardId(digitizeCardResponse.getDigitalCardId());
          digitizeTicketRequest.setTransitBundle(digitizeCardResponse.getTransitBundle());
          RiskData riskData = new RiskData();
          riskData.setClientType("ANDROID_PAY");
          riskData.setLatitudeNoDecimals("111111111111111111111111111");
          riskData.setLongitudeNoDecimals("111111111111111111111111111");
          riskData.setIpAddress("111111111111111111111111111111");
          riskData.setRiskAlgorithmVersion("1.0");
          riskData.setDeviceScore(1);
          riskData.setAccountScore(2);
          riskData.setWalletAccountTenureWeeks(1);
          riskData.setGaiaAccountTenureWeeks(1);
          riskData.setOsVersion("6");
          riskData.setNetworkOperator("");
          riskData.setNetworkType("CELLULAR");
          riskData.setDeviceTimezone("1");
          digitizeTicketRequest.setRiskData(riskData);
          // DigitizeTicketResponse digitizeTicketResponse = PTOHttpClientUtils.postRequest(
          // digitizeTicketRequest, buildMifareServiceOAuth2Config(), MIFARE_DIGITIZE_TICKET_URL,
          // DigitizeTicketResponse.class);
          DigitizeTicketResponse digitizeTicketResponse = utils.postRequest(
            digitizeTicketRequest, configBean, configBean.getMIFARE_DIGITIZE_TICKET_URL(),
            DigitizeTicketResponse.class);
          result = JsonUtil.toJSON(digitizeCardResponse);
          ticketPurchaseResponse = TicketPurchaseResponse.builder().status("success")
            .digitalTicketId(digitizeTicketResponse.getDigitalTicketId())
            .transitBundle(digitizeTicketResponse.getTransitBundle()).build();
        }
      }
      LOG.info("#Got Response:" + result);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      LOG.info("#Error occurred during mifare service call" + e);
      result = "failed";
      ticketPurchaseResponse = TicketPurchaseResponse.builder().status("failed").build();
    }
    return ticketPurchaseResponse;
  }

  @RequestMapping(value = "ackdigitizeticket/wallets/{walletId}/digitalcards/{digitalCardId}/transitbundles/{transitBundleId}", method = RequestMethod.GET)
  public AckTicketPurchaseResponse ackTicketPurchase(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "digitalCardId") String digitalCardId,
    @PathVariable(value = "transitBundleId") String transitBundleId) {
    String result = "success";
    AckTicketPurchaseResponse ackTicketPurchaseResponse = null;
    try {
      AcknowledgeTransitBundleRequest acknowledgeTransitBundleRequest = new AcknowledgeTransitBundleRequest();
      RequestContext requestContext = new RequestContext();
      requestContext.setCorrelationId("" + System.currentTimeMillis());
      requestContext.setRequesterId(walletId);
      requestContext.setRequestId("" + System.currentTimeMillis());
      requestContext.setTimeZone("GMT-8:00");
      acknowledgeTransitBundleRequest.setRequestContext(requestContext);
      DigitizationContext digitizationContext = new DigitizationContext();
      digitizationContext.setWalletId(walletId);
      acknowledgeTransitBundleRequest.setDigitizationContext(digitizationContext);
      acknowledgeTransitBundleRequest.setDigitalCardId(digitalCardId);
      acknowledgeTransitBundleRequest.setTransitBundleId(transitBundleId);
      // AcknowledgeTransitBundleResponse acknowledgeTransitBundleResponse = PTOHttpClientUtils.postRequest(
      // acknowledgeTransitBundleRequest, buildMifareServiceOAuth2Config(), MIFARE_DIGITIZE_TICKET_ACK_URL,
      // AcknowledgeTransitBundleResponse.class);
      AcknowledgeTransitBundleResponse acknowledgeTransitBundleResponse = utils.postRequest(
        acknowledgeTransitBundleRequest, configBean, configBean.getMIFARE_DIGITIZE_TICKET_ACK_URL(),
        AcknowledgeTransitBundleResponse.class);
      ackTicketPurchaseResponse = AckTicketPurchaseResponse.builder().status("success")
        .affectedDigitalTicketId(acknowledgeTransitBundleResponse.getAffectedDigitalTicketId()).build();
      result = JsonUtil.toJSON(acknowledgeTransitBundleResponse);
    } catch (Exception e) {
      LOG.info("#Error occurred during " + e);
      result = "failed";
      ackTicketPurchaseResponse = AckTicketPurchaseResponse.builder().status("failed").build();
    }
    return ackTicketPurchaseResponse;
  }

  @RequestMapping(value = "digitizecard/wallets/{walletId}/serviceproviders/{spId}", method = RequestMethod.GET)
  public DCResponse digitizeCard(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "spId") String spId) {
    String result = "success";
    DCResponse dcResponse = new DCResponse();
    DigitizeCardRequest digitizeCardRequest = new DigitizeCardRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId("" + System.currentTimeMillis());
    requestContext.setRequesterId(walletId);
    requestContext.setRequestId("" + System.currentTimeMillis());
    requestContext.setTimeZone("GMT-8:00");
    digitizeCardRequest.setRequestContext(requestContext);
    DigitizationContext digitizationContext = new DigitizationContext();
    digitizationContext.setWalletId(walletId);
    digitizeCardRequest.setDigitizationContext(digitizationContext);
    DeviceData dd = new DeviceData();
    dd.setModel("n8");
    dd.setDeviceId("1111111");
    dd.setManufacturer("nokia");
    dd.setNickname("n8");
    dd.setPhoneNumber("");
    dd.setBrand("nokia8");
    digitizeCardRequest.setDeviceData(dd);
    digitizeCardRequest.setTransitAgencyId(spId);
    try {
      // DigitizeCardResponse digitizeCardResponse = PTOHttpClientUtils.postRequest(digitizeCardRequest,
      // buildMifareServiceOAuth2Config(), MIFARE_DIGITIZE_CARD_URL, DigitizeCardResponse.class);
      DigitizeCardResponse digitizeCardResponse = utils.postRequest(digitizeCardRequest,
        configBean, configBean.getMIFARE_DIGITIZE_CARD_URL(), DigitizeCardResponse.class);
      result = JsonUtil.toJSON(digitizeCardResponse);
      dcResponse.setStatus("success");
      dcResponse.setDigitalCardId(digitizeCardResponse.getDigitalCardId());
      dcResponse.setTransitBundle(digitizeCardResponse.getTransitBundle());
    } catch (Exception e) {
      LOG.info("#Error occurred during digitize card api call" + e);
      result = "failed";
      dcResponse.setStatus("failed");
    }
    return dcResponse;
  }

  @RequestMapping(value = "undigitizecard/wallets/{walletId}/serviceproviders/{spId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse unDigitizeCard(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "spId") String spId, @RequestBody UCRequest ucRequest) {
    String result = "";
    String status = "";
    UndigitizeCardRequest undigitizeCardRequest = new UndigitizeCardRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId("" + System.currentTimeMillis());
    requestContext.setRequesterId(walletId);
    requestContext.setRequestId("" + System.currentTimeMillis());
    requestContext.setTimeZone("GMT-8:00");
    undigitizeCardRequest.setRequestContext(requestContext);
    DigitizationContext digitizationContext = new DigitizationContext();
    digitizationContext.setWalletId(walletId);
    undigitizeCardRequest.setDigitizationContext(digitizationContext);
    undigitizeCardRequest.setCardUndigitizationReason(ucRequest.getCardUndigitizationReason());
    undigitizeCardRequest.setDigitalCardId(ucRequest.getDigitalCardId());
    undigitizeCardRequest.setDigitizedCardStatus(ucRequest.getDigitizedCardStatus());
    undigitizeCardRequest.setTransitBundle(ucRequest.getTransitBundle());
    try {
      // OemResponse oemResponse = PTOHttpClientUtils.postRequest(undigitizeCardRequest,
      // buildMifareServiceOAuth2Config(), MIFARE_UNDIGITIZE_CARD_URL, OemResponse.class);
      OemResponse oemResponse = utils.postRequest(undigitizeCardRequest,
        configBean, configBean.getMIFARE_UNDIGITIZE_CARD_URL(), OemResponse.class);
      result = JsonUtil.toJSON(oemResponse);
      status = "success";
    } catch (Exception e) {
      LOG.info("#Error occurred during digitize card api call" + e);
      status = "failed";
    }
    return BaseResponse.builder().status(status).result(result).build();
  }

  @RequestMapping(value = "undigitizeticket/wallets/{walletId}/serviceproviders/{spId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse unDigitizeTicket(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "spId") String spId, @RequestBody UTRequest utRequest) {
    String result = "";
    String status = "";
    UndigitizeTicketRequest undigitizeTicketRequest = new UndigitizeTicketRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId("" + System.currentTimeMillis());
    requestContext.setRequesterId(walletId);
    requestContext.setRequestId("" + System.currentTimeMillis());
    requestContext.setTimeZone("GMT-8:00");
    undigitizeTicketRequest.setRequestContext(requestContext);
    DigitizationContext digitizationContext = new DigitizationContext();
    digitizationContext.setWalletId(walletId);
    undigitizeTicketRequest.setDigitizationContext(digitizationContext);
    undigitizeTicketRequest.setDigitalCardId(utRequest.getDigitalCardId());
    undigitizeTicketRequest.setTransitBundle(utRequest.getTransitBundle());
    undigitizeTicketRequest.setTicketUndigitizationReason(utRequest.getTicketUndigitizationReason());
    undigitizeTicketRequest.setDigitalTicketId(utRequest.getDigitalTicketId());
    try {
      // UndigitizeTicketResponse undigitizeTicketResponse = PTOHttpClientUtils.postRequest(undigitizeTicketRequest,
      // buildMifareServiceOAuth2Config(), MIFARE_UNDIGITIZE_TICKET_URL, UndigitizeTicketResponse.class);
      UndigitizeTicketResponse undigitizeTicketResponse = utils.postRequest(undigitizeTicketRequest,
        configBean, configBean.getMIFARE_UNDIGITIZE_TICKET_URL(), UndigitizeTicketResponse.class);
      result = JsonUtil.toJSON(undigitizeTicketResponse);
      status = "success";
    } catch (Exception e) {
      LOG.info("#Error occurred during digitize ticket api call" + e);
      status = "failed";
    }
    return BaseResponse.builder().status(status).result(result).build();
  }

  @RequestMapping(value = "removedigitizedticket/wallets/{walletId}/digitalcards/{digitalCardId}/tickets/{ticketId}/reason/{reason}", method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse removeDigitizedTicket(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "digitalCardId") String digitalCardId,
    @PathVariable(value = "ticketId") String digitalTicketId, @PathVariable(value = "reason") String reason,
    @RequestBody TransitBundle transitBundle) {
    String result = "";
    String status = "";
    UndigitizeTicketRequest undigitizeTicketRequest = new UndigitizeTicketRequest();
    RequestContext requestContext = new RequestContext();
    requestContext.setCorrelationId("" + System.currentTimeMillis());
    requestContext.setRequesterId(walletId);
    requestContext.setRequestId("" + System.currentTimeMillis());
    requestContext.setTimeZone("GMT-8:00");
    undigitizeTicketRequest.setRequestContext(requestContext);
    DigitizationContext digitizationContext = new DigitizationContext();
    digitizationContext.setWalletId(walletId);
    undigitizeTicketRequest.setDigitizationContext(digitizationContext);
    undigitizeTicketRequest.setDigitalCardId(digitalCardId);
    undigitizeTicketRequest.setDigitalTicketId(digitalTicketId);
    undigitizeTicketRequest.setTicketUndigitizationReason(reason);
    undigitizeTicketRequest.setTransitBundle(transitBundle);
    // undigitizeTicketRequest.setDigitalTicketId(digitalTicketId);
    try {
      // UndigitizeTicketResponse undigitizeTicketResponse = PTOHttpClientUtils.postRequest(undigitizeTicketRequest,
      // buildMifareServiceOAuth2Config(), MIFARE_UNDIGITIZE_TICKET_URL, UndigitizeTicketResponse.class);
      UndigitizeTicketResponse undigitizeTicketResponse = utils.postRequest(undigitizeTicketRequest,
        configBean, configBean.getMIFARE_UNDIGITIZE_TICKET_URL(), UndigitizeTicketResponse.class);
      result = JsonUtil.toJSON(undigitizeTicketResponse);
      status = "success";
    } catch (Exception e) {
      LOG.info("#Error occurred during digitize ticket api call" + e);
      status = "failed";
    }
    BaseResponse baseResponse = BaseResponse.builder().status(status).result(result).build();
   LOG.info("#Remove undigitzed card:" + baseResponse.toString());
    return baseResponse;
    // return status;
  }

  /* confirmPurchaseV1 is written for CRTM Demo */
  @RequestMapping(value = "confirmpurchase/v1/wallets/{walletId}/serviceproviders/{spId}/widgets/{widgetId}", method = RequestMethod.GET)
  public TicketPurchaseResponse confirmPurchaseV1(@PathVariable(value = "walletId") String walletId,
    @PathVariable(value = "spId") String spId, @PathVariable(value = "widgetId") String widgetId) {
    LOG.info("########confirmPurchaseV1 started");
    TicketPurchaseResponse ticketPurchaseResponse = null;
    String result = "Success";
    String productRef;
    GenerateProductIDResponse generateProductIDResponse;
    String status = "success";
    try {
      /* MIFAREHttpClient mifareClient = new MIFAREHttpClient(DIGITIZE_BASE_URI, GENERATE_PRODUCT_REFERENCE); */
      // MIFAREHttpClient mifareClient = new MIFAREHttpClient.Builder().serviceURL(DIGITIZE_BASE_URI)
      // .apiURL(GENERATE_PRODUCT_REFERENCE).build();
      GenerateProductIDRequest request = new GenerateProductIDRequest();
      RequestContextV1 requestContext = new RequestContextV1();
      requestContext.setServiceProviderId(spId);
      String idRequest = "" + System.currentTimeMillis();
      requestContext.setCorrelationId(idRequest);
      requestContext.setRequestId(idRequest);
      request.setRequestContext(requestContext);
      Products products = new Products();
      products.setProductTypeId(widgetId);
      productRef = UUID.randomUUID().toString();
      products.setSpProductReference(productRef);
      request.setProductOrders(new ArrayList<>(Arrays.asList(products)));
      
      /** calling seglan service InitPurchaseOrder API if serviceProviderId is NAME_CRTM */
      if (spId.equals(configBean.getCrtmServiceProviderId())) {
        InitPurchaseOrderRequest InitPurchaseOrderRequest = new InitPurchaseOrderRequest();
        InitPurchaseOrderRequest.setDeviceId("1234");
        InitPurchaseOrderRequest.setGoogleAccountId("gsrini@gmail.com");
        InitPurchaseOrderRequest.setProduct(widgetId);
        InitPurchaseOrderResponse initPurchaseOrderResponse = crtmService.processInitPurchaseOrder(InitPurchaseOrderRequest);
        if (!initPurchaseOrderResponse.getResponseCode().equals("00")) {
          status = "failed";
          result = "failed";
        }
        ticketPurchaseResponse = TicketPurchaseResponse.builder().status(status).ticketId(productRef)
          .digitalTicketId(initPurchaseOrderResponse.getM2gReference()).build();
      } else {
        Header[] headers = new Header[] {
          new BasicHeader("content-type", ContentType.APPLICATION_JSON.getMimeType())};
        // generateProductIDResponse = mifareClient.invokePost(request, GenerateProductIDResponse.class, headers);
        generateProductIDResponse = utils.postRequestWithAbsoluteURL1(request, configBean, configBean.getDIGITIZE_BASE_URI() + configBean.getGENERATE_PRODUCT_REFERENCE(),
          GenerateProductIDResponse.class);
        ticketPurchaseResponse = TicketPurchaseResponse.builder()
          .status(generateProductIDResponse.getResponseContext().getResponseMessage()).ticketId(productRef)
          .digitalTicketId(generateProductIDResponse.getReferences().get(0).getM2gReference()).build();
        result = JsonUtil.toJSON(generateProductIDResponse);
      }
      LOG.info("########confirmPurchaseV1 result:" + result);
    } catch (Exception e) {
      LOG.info("#Error occurred during confirm purchase:" + e);
      result = "failed";
      LOG.info("########confirmPurchaseV1 result:" + result);
      ticketPurchaseResponse = TicketPurchaseResponse.builder().status(result).build();
    }
    return ticketPurchaseResponse;
  }

}
