package com.nxp.hcedemomws.util;


/**
 * @author NXP
 *
 */
public class Constants {
	
  public static final String REQ_PARAM_ACCESS_TOKEN = "access_token";
  public static final String IS_AUTHENTICATED_FULLY = "IS_AUTHENTICATED_FULLY";
  public static final String IS_AUTHENTICATED_REMEMBERED = "IS_AUTHENTICATED_REMEMBERED";
  public static final String IS_AUTHENTICATED_ANONYMOUSLY = "IS_AUTHENTICATED_ANONYMOUSLY";
  public static final String ORDER_PREFIX = "GRORD";
  public static final Long SCHEDULED_DATE=2017l;
  public static final String ORIGINAL_CHANNEL="CHANNEL";
  public static final String IP_ADDRESS="168.122.122";
  public static final String USER_AGENT="AGENT";
  public static final String TXN_REFERENCE_NUMBER="111";
  public static final String GENDER="MALE";
  public static final String USER_ACTIVE_STATUS = "Active";
  public static final String WALLET_ENC_KEY="WALLET_KEY";
  public static final String DEVICE_IMEI="1111111";
  public static final String OS_FAMILY="os_faimly";
  public static final String OEM_MODE="OEM";
  public static final String ADMIN_USER_ID="ADMIN";
  public static final String REQUEST_ID="111";
  public static final String ERROR_CODE="404";
  public static final String ERROR_MESSAGE="ERROR";
  public static final Integer TOTAL_NO_OF_ROWS=111;
  public static final Integer CURRENT_BALANCE=111;
  public static final Integer ZERO = 0;
  public static final String ADMIN_STATUS = "Success";
  public static final String EMAIL_TOKEN_FORGOT_PW = "FORGOT_PASSWORD";
  public static final String EMAIL_TOKEN_SET_NEW_PW = "SET_NEW_PASSWORD";
  public static final String CW_CUSTOMER_UPDATE_BY = "CUSTOMER";
  public static final String EMPTY = "EMPTY";
  public static final String PENDING = "Pending";
  public static final String DELIMIT_PASS = "@M@";
  public static final int LAST_PW_REPEAT = 3;
  public static final String CHAR_SET_UTF8 = "UTF-8";
  public static final Long SYSTEM_ADMIN_CREATED_BY_ID = 0L;
  public static final String CONTENT_TYPE = "Content-Type";
  public static final String CONTENT_LENGTH = "Content-Length";
  public static final Integer QUERY_TIMEOUT = 99999999;
  public static final String REGEX_EMAIL_VALIDATION =
      "^[a-zA-Z0-9:_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
  public static final String REGEX_PHONE_VALIDATION = "^([0-9]+\\s)*[0-9]+\\d+(-\\d+)*$";
  public static final String REGEX_CONTACT_PERSON_VALIDATION = "^[a-zA-Z0-9-\\_\\' ]*$";
  public static final String REGEX_NAME_VALIDATION = "^[a-zA-Z0-9-\\_ ]*$";
  public static final String REGEX_ID_VALIDATION = "^[a-zA-Z0-9_]*$";
  public static final String WEB = "Web";
  public static final Long ONE_LONG = 1l;
  public static final String ONE = "1";
  public static final String PERCENT_DELIMITER = "%";
  public static final String FAILED = "FAILED";
  public static final Integer HTTP_STATUS_SUCCESS = 200;
  public static final Integer HTTP_STATUS_100 = 100;
  public static final double MILI_SECONDS = 1000.0;
  public static final Integer COOKIE_MAX_AGE_EXPIRY_15_60 = 15 * 60;
  public static final Integer SESSION_TIME_OUT = 60000;
  public static final Integer COOKIE_MAX_AGE_EXPIRY_20_60 = 20 * 60;
  public static final Integer BODY_LENGTH_60 = 60;
  public static final Integer BODY_LENGTH_30 = 30;
  public static final Integer SESSION_ATTRIBUTE_VAL_7 = 7;
  public static final Integer FOUR = 4;
  public static final Integer WRONG_PASSWORD_COUNT = 5;
  public static final Long ZERO_LONG = 0l;
  public static final String SP_CONSTANTS = "SP";
  public static final String SP_CODE = "100";
  public static final String SSP_CONSTANTS = "SSP";
  public static final Integer TEN = 10;
  public static final Integer TWELVE = 12;
  public static final Integer FOURTEEN = 14;
  public static final String FORGOT_PASS_WORD = "Forgot Password";
  public static final int DISP_PAGE_SIZE = 10;
  public static final Integer DISP_PAGESIZE = 10;
  public static final String CREATE_AUDIT_EVENT = "Create";
  public static final String EDIT_AUDIT_EVENT = "Edit";
  public static final String INJECTED = "INJECTED";
  public static final String NOT_INJECTED = "NOT_INJECTED";
  public static final String INJECTED_CHECKED = "INJECTED_CHECKED";
  public static final String CATEGORY = "category";
  public static final String STATUS = "Active";
  public static final String TYPE = "type";
  public static final String FIELD_PARAM_NAME="2.0";
  public static final String FIELD_TYPE="2.0";
  public static final String FIELD_VALUE="2.0";
  public static final String URL="https://www.nxp.com/";
  public static final String LANGUAGE_SUPPORT="en";
  public static final byte[] ADD_WIDGET_IMAGE=new byte[0];
  public static final byte[] USER_WIDGET_IMAGE=new byte[0];
  public static final String SERVICE_ENABLED="enable";
  public static final String THUMBNAIL_STRING="THUMBNAIL_STRING";
  public static final Long ID = 100l;
  public static final String ACCESS_TOKEN = "access_token";
  public static final String REFRESH_TOKEN = "refresh_token";
  public static final String TOKEN_TYPE = "token_type";
  public static final String STATUS_TERMINATED = "Terminated";
  public static final String LOCKED = "Locked";
  public static final String UNLOCKED = "UnLocked";
  public static final int PAGE_INDEX = 1;
  public static final Integer PAGEINDEX = 1;
  public static final String EVENT_DATE="02-09-2017";
  public static final String WIDGET_NAME="WIDGET";
  public static final String EVENT_CATEGORY="CATEGORY";
  public static final String CHANNEL="CHANNEL";
  public static final Long FEATURE_LEVEL=1l;
  public static final Long REF_FEATURE_ID=111l;
  public static final String OEM_CODE="CODE";
  public static final String CONTACT_PERSON="PERSON";
  public static final String DESCRIPTION="DESCRIPTION";
  public static final String DEVICE_NAME="DEVICE_NAME";
  public static final Long PERS_SUB_TYPE_ID=111l;
  public static final String PERSO_SUB_TYPE_NAME="persoSubTypeName";
  public static final String BODY="push-body";
  public static final Long PUSH_NOTIF_ID=111l;
  public static final String OTP="111111";
  public static final String SUSPEND = "Suspend";
  public static final String ACTIVATE = "Activate";
  public static final String TERMINATE = "Terminate";
  public static final Long NO_OF_ACTIV_WIDGET=50l;
  public static final Long NO_OF_SUSPENDED_WIDGETS=30l;
  public static final Long NO_OF_DELETED_WIDGETS=20l;
  public static final Long TOTAL_DOWNLOADED=20l;
  public static final String IMAGE_URL="IMAGE_URL";
  public static final String CURRENCY="CURRENCY";
  public static final Double PRICE=100.1;
  public static final byte[] CONTENTS= new byte[0];
  public static final String ACCEPTED_LOCATIONS="ACCEPTED_LOCATIONS";
  public static final String WIDGET_SEGMENT="WidgetSegment";
  public static final String TERMS_AND_CONDITION="TERMS_AND_CONDITION";
  public static final String OEM_SE_MANAGEMENT="SE";
  public static final String INTENT_URL="http://google.com";
  public static final Integer DELETED_ID=111;
  public static final String SCRIPT_VERSION="1";
  public static final String AVILABILITY_DATA="111111";
  public static final String PHONE_MODEL="APPLE";
  public static final String OS_VERSION="2.0";
  public static final Long NO_OF_USER=100l;
  public static final Long NO_OF_ACTIV_USER=50l;
  public static final Long NO_OF_SUSPENDED_USER=30l;
  public static final Long NO_OF_DELETED_USER=20l;
  public static final Long OTP_PENDING=5l;
  public static final String FILE_NAME="ABC";
  public static final String ORIGIN_TIME="111";
  public static final byte[] THUMBNAIL=new byte[0];
  public static final Byte[] SECURED_KEY_MATERIAL=new Byte[0];
  public static final String TIME_ZONE="GMT";
  public static final String REFERER = "referer";
  public static final String U_AGENT = "user-agent";
  public static final String REQUESTER_ID="ABC";
  public static final String DOWNLOADED_WIDGET_CONTENT="DownloadedWidgetContent";
  public static final Long DOWNLOAD_COUNT_PER_USER=11l;
  public static final String  ACCEPTED_LOCATION="AcceptedLocations";
  public static final String REGEX_WEDGET_ID_VALIDATION = "^[0-9]*$";
  public static final String AUTH_HEADER = "Authorization";
  public static final String OEMID = "oemId";
  public static final String VC_CREATION_KEY = "vcCreationKey";
  public static final String DIVERSIFIED = "diversified";
  public static final String KEY_TYPE = "keyType";
  public static final String KEY_VALUE = "keyValue";
  public static final String KEY_ID = "keyId";
  public static final Long COUNT = 1L;
  public static final Long SUBSERVICE_PROVIDER_ID = 1L;
  public static final String SP_WEBSITE = "SP_WEBSITE";
  public static final Long SERVICE_TSM_ID = 1L;
  public static final Long SERVICE_SP_ID = 1L;
  public static final String SERVICE_TYPE = "SERVICE_TYPE";
  public static final String SP_TYPE = "SP_TYPE";
  public static final String ORDER_BY = "ORDER_BY";
  public static final String SSP_STATUS = "SSP_STATUS";
  public static final String REQUEST_FROM = "requestFrom";
  public static final String REQUEST_TYPE = "requestType";
  public static final String SEGMENT = "SEGMENT";
  public static final String CATEGORY_TYPE_ID = "CATEGORY_TYPE_ID";
  public static final String SEGMENT_ID = "SEGMENT_ID";
  public static final String SEGMENT_SUPPORTS = "SEGMENT_SUPPORTs";
  public static final String CATEGORY_SUPPORTS = "CATEGORY_SUPPORTs";
  public static final String SSP_CODE = "SSP_CODE";
  public static final String USER_IP_ADDRESS = "USER_IP_ADDRESS";
  public static final String ORIGIN_CHANNEL = "ORIGIN_CHANNEL";
  public static final String COUNTRYLIST = "COUNTRYLIST";
  public static final String PTO_SERVICE = "PTO_SERVICE";
  public static final String PTO_USER_NAME = "PTO_USER_NAME";
  public static final String PTO_PASSCODE = "PTO_PASSWORD";
  public static final String SERVICE_URL = "SERVICE_URL";
  public static final String TOKEN = "TOKEN";
  public static final String CREATED_NAME = "CREATED_NAME";
  public static final String UPDATED_NAME = "UPDATED_NAME";
  public static final String PRIVACY_CONTENT_ID = "PRIVACY_CONTENT_ID";
  public static final Long CREATED_BY_LONG = 1l;
  public static final Long UPDATED_BY_LONG = 1l;
  public static final Long SP_ID = 1l;
  public static final Long SP_HISTORY_ID = 1l;
  public static final String DOWNLOAD_STATUS = "DownLoad";
  public static final String TOPUP_STATUS = "TOPUP";
  public static final String DELETE_STATUS = "DELETE";
  public static final String SUSPEND_STATUS = "SUSPEND";
  public static final String RESUME_STATUS = "RESUME";
  public static final String AUTH_CODE_STATUS = "9000";
  public static final String PREVIOUS_FOUR_PASSCODE =
      "686B5F134DF69C13404F2E3B4C6DE452@M@48AA9011FC8A904050057FA65A830504@M@686B5F134DF69C13404F2E3B4C6DE452@M@48AA9011FC8A904050057FA65A830504@M@";
  public static final String PREVIOUS_PASSCODE =
      "686B5F134DF69C13404F2E3B4C6DE452@M@48AA9011FC8A904050057FA65A830504@M@";
  public static final String EXCEPTION_TYPE = "Exception";
  public static final String PERSO_TYPE_HEC = "HCE";
  public static final String CATEGORY_SEGMENT_ONE = "1";
  public static final String CATEGORY_SEGMENT_TWO = "2";
  public static final String CATEGORY_SEGMENT_THREE = "3";
  public static final String CATEGORY_SEGMENT_FOUR = "4";
  public static final String CATEGORY_SEGMENT_FIVE = "5";
  public static final String SELF = "SELF";
  public static final String SUPPORT_TICKET_PRIORITY_LOW = "LOW";
  public static final String SUPPORT_TICKET_PRIORITY_MEDIUM = "MEDIUM";
  public static final String SUPPORT_TICKET_PRIORITY_HIGH = "HIGH";
  public static final String SUBSERVICE_PROVIDER_PAGE = "sspPage";
  public static final String SERVICE_PROVIDER_PAGE = "spPage";
  public static final String PTOUSERNAME = "name";
  public static final String PTOUSERCITY = "city";
  public static final String PTOUSERWIDGET = "widgetname";
  public static final String PTOUSERPTO = "ptoname";
  public static final String PERSO_TYPE_SE = "SE";
  public static final String UPLOADED_FILE_DATA_FAILE =
      "25252520436F6E646974696F6E616C5F536372697074202020204E6F0A252525204146202020202020202020202020202020202020202031300A25252520535020202020202020202020202020202020202020203F";
  public static final String EXISTING_LS_CODE = "MFLS_015";
  public static final String LS_CODE = "LS_0001";
  public static final String REGEX_NO_ONLY = "[0-9]+";
  public static final String REGEX_ONLY_HEX = "^([0-9A-Fa-f]{2})+$";
  public static final String LS_PTO_CODE = "MFLS_0019";
  public static final Long TOTAL_DOWNLOADED_ACTIVE=20l;
  public static final Long TOTAL_DOWNLOADED_SUSPENDED=20l;
  public static final Long TOTAL_DOWNLOADED_TERMINATED=20l;
  public static final Long WIDGET_CATEGORY=20l;
  public static final String FIELD_LABEL="2.0";
  public static final Long NO_OF_WIDGETS=100l;
  public static final String LS_SE_CODE = "MFLS_0020";
  public static final String SP_RESET_SESSION = "serviceproviderReset";
  public static final String USER_UPDATE_EXCEPTION = "inactiveUserUpdate";
  public static final String CODE="AJHJHSHJJHDSAHJhjDHJD";
  public static final Long LS_DELETE_SCRIPT_ID=2l;
  public static final String SSD_ID="111";
  public static final Integer HUNDRED = 100;
  public static final Integer TWENTY = 20;
  public static final String WIDGET_SUMMARY_DATA = "widget_summary_data";
  public static final String ADMIN_USER_DATA = "admin_user_data";
  public static final String CANCEL_TYPE_ID = "cancel_type_id";
  public static final String SEARCH_AUDIT_REPORTS = "search_audit_reports";
  public static final String CANCEL_TYPE = "cancel_type";
  public static final String TICKET_PURCHASE_REPORT_REQUEST_DATA =
      "ticket_purchase_report_request_data";
  public static final String EDIT_VIEW_ADMIN_USER_ID = "edit_view_admin_user_id";
  public static final int USER_ID_INDEX = 1;
  public static final int USER_NAME_INDEX = 2;
  public static final int USER_EMAIL_INDEX = 3;
  public static final String EDIT_WIDGET_ID = "edit_widget_id";
  public static final String VIEW_WIDGET_ID = "view_widget_id";
  public static final String TICKET_PURCHASE_REPORT_REQUEST = "ticketPurchaseReportRequest";
  public static final String ENTITY_NAME = "@@name";
  public static final String SCRIPT_INJECTED = "SCRIPT_INJECTED";
  public static final String CREATE = "Create";
  public static final String STATUS_EXPIRED = "Expired";
  public static final String STATUS_SUSPENDED = "Suspended";
  public static final int KEY_PAIR_GENERATOR = 2048;
  public static final int EIGHT = 8;
  public static final int THREE = 3;
  public static final int TWO = 2;
  public static final int TWENTY_FOUR = 24;
  public static final double THOUSAND_DOUBLE = 1000.0;
  public static final String ALL = "All";
  public static final String DIVERSIFIED_VALUE = "diversifiedValue";
  public static final Integer TWO_ZERO_FOUR_EIGHT = 2048;
  public static final Integer SIXTEEN = 16;
  public static final Integer TWO_FIVE_SIX = 256;
  public static final Integer TWO_FIVE_SEVEN = 257;
  public static final Integer FIVE_HUNDRED = 500;
  public static final String EMPTY_STRING = "";
  public static final String EMAIL = "NXP@NXP.COM";
  public static final String START_DATE = " 00:00:00";
  public static final String END_DATE = " 23:59:59";
  public static final Integer THIRTY_TWO = 32;
  public static final int INT_ONE = 1;
  public static final int MAX_TOTAL = 300;
  public static final int MAX_PER_ROUTE = 30;
  public static final int CONNECTION_TIMEOUT = 30000;
  public static final Integer SIX = 6;
  public static final Integer FIVE = 5;
  public static final String TWO_STRING = "2";
  public static final String PNO="ABC";
  public static final String INSTANCE_ID="100";
  public static final Long LS_INSTALL_SCRIPT_ID=11l;
  public static final String DEVICE_MODEL="devic_model";
  public static final String ENCRYPTED_TRANSIT_BUNDLE="encrypted";
  public static final String DEIVICE_REG_ID="111";
  public static final String RESPONSE_DATA="111";
  public static final String PERSO_TYPE="persoType";
  public static final String PUSH_MSG_JSON="push-msg";
  public static final String SUBJECT="push-subject";
  public static final Long CREATED_FROM_API = 1l;
  public static final String MIF_REQUESTER_ID = "requesterId";
  public static final String MIF_CORRELATION_ID = "correlationId";
  public static final String MIF_SE_ID = "seId";
  public static final String MIF_USER_ID = "userId";
  public static final String MIF_DEVICE_ID = "deviceId";
  public static final String MIF_SP_ID = "spId";
  public static final String MIF_TOKEN_REQUESTOR_ID = "tokenRequestorId";
  public static final String MIF_TOKEN_REF_ID = "tokenRefId";
  public static final String MIF_CARD_BIN = "cardBin";
  public static final String MIF_BANK_ID = "bankId";
  public static final String MIF_PTO_REF_ID = "ptoReferenceId";
  public static final String MIF_NORMAL_CARD = "NormalCard";
  public static final String MIF_CREDIT_CO_BRANDED_CARD = "CreditCobrandCard";
  public static final int THOUSAND_INT = 1000;
  public static final Integer THIRTY_EIGHT = 38;
  public static final Integer FOURTY_TWO = 42;
  public static final Integer FOURTY_EIGHT = 48;
  public static final Integer FIFTY_FOUR = 54;
  public static final Integer FIFTY_EIGHT = 58;
  public static final Integer SIXTY_FOUR = 64;
  public static final Integer EIGHTY_TWO = 82;
  public static final Integer EIGHTY_EIGHT = 88;
  public static final Integer SEVENTEEN = 17;
  public static final Integer SEVEN = 7;
  public static final Integer NINE = 9;
  public static final Integer ELEVEN = 11;
  public static final Integer THIRTEEN = 13;
  public static final Integer FIFTEEN = 15;
  public static final byte FIVE_BYTE = 5;
  public static final String M4MCLASSIC = "M4MCLASSIC";
  public static final String M4MDESFIRE = "M4MDESFIRE";
  public static final String ZERO_STRING = "0";
  public static final String SIX_NINE_EIGHTY_TWO = "6982";
  public static final int FIFTY = 50;
  public static final int FIVE_FIFTY = 550;
  public static final int EIGHTEEN = 18;
  public static final int SIXTY_THREE = 63;
  public static final int SEVENTY_FIVE = 75;
  public static final int TWO_FIVE_FIVE = 255;
  public static final int TWO_FIVE = 25;
  public static final int ZERO_THREE = 03;
  public static final Integer THIRTY_ONE = 31;
  public static final Integer THIRTY = 30;
  public static final int TWENTY_SIX = 26;
  public static final int ACCOUNT_SCORE_LOWER_BOUND = 1;
  public static final int ACCOUNT_SCORE_UPPER_BOUND = 5;
  public static final int DEVICE_SCORE_LOWER_BOUND = 1;
  public static final int DEVICE_SCORE_UPPER_BOUND = 5;

  public static final long G_AMOUNT_FORMAT_10_6_MICROS = 1000000l;
  public static final String STATIC_TICKET_FIELDS = "[ { \"fieldName\": \"digitalTicketId\", \"extraParameters\": { \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 16, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"bytes\" }, { \"fieldName\": \"displayTicketReference\", \"extraParameters\": { \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 16, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"bytes\" }, { \"fieldName\": \"numberOfTrips\", \"extraParameters\": { \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 84, \"positionEnd\": 86, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"int\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"int\" }, { \"fieldName\": \"tripsConsumed\", \"extraParameters\": { \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 91, \"positionEnd\": 93, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"int\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"int\" }, { \"fieldName\": \"endTime\", \"extraParameters\": { \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 93, \"positionEnd\": 98, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"date\", \"factor\": 1000, \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"long\" }, { \"fieldName\": \"ticketStatus\", \"extraParameters\": { \"mappings\": { \"default\": \"ERROR_UNKNOWN\", \"maps\": [ { \"id\": 0, \"map\": \"active\" }, { \"id\": 1, \"map\": \"active\" }, { \"id\": 2, \"map\": \"expired\" }, { \"id\": 3, \"map\": \"refunded\" }, { \"id\": 4, \"map\": \"revoked\" } ] }, \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 98, \"positionEnd\": 99, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"enumString\" } ]";
  public static final String STATIC_TXN_FIELDS = "[ { \"fieldName\": \"digitalTicketId\", \"extraParameters\": { \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 16, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"bytes\" }, { \"fieldName\": \"displayTicketReference\", \"extraParameters\": { \"fileAccess\": { \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 16, \"fileId\": 1 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"bytes\" }, { \"fieldName\": \"stationOrigin\", \"extraParameters\": { \"fileAccess\": { \"recPositionEnd\": 1, \"recPositionStart\": 0, \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 10, \"fileId\": 3 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"int\" }, { \"fieldName\": \"gateOrigin\", \"extraParameters\": { \"fileAccess\": { \"recPositionEnd\": 2, \"recPositionStart\": 1, \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 10, \"fileId\": 3 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"int\" }, { \"fieldName\": \"transactionTime\", \"extraParameters\": { \"fileAccess\": { \"recPositionEnd\": 7, \"recPositionStart\": 2, \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 10, \"fileId\": 3 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"date\", \"factor\": 1000, \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"long\" }, { \"fieldName\": \"transactionId\", \"extraParameters\": { \"fileAccess\": { \"recPositionEnd\": 7, \"recPositionStart\": 2, \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 10, \"fileId\": 3 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"date\", \"factor\": 1000, \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"long\" }, { \"fieldName\": \"transactionStatus\", \"extraParameters\": { \"mappings\": { \"default\": \"ERROR_UNKNOWN\", \"maps\": [ { \"id\": 0, \"map\": \"SUCCESS\" }, { \"id\": 1, \"map\": \"ERROR_PASSBACK\" }, { \"id\": 2, \"map\": \"ERROR_TICKET_NOT_FOUND\" }, { \"id\": 3, \"map\": \"ERROR_UNKNOWN\" }, { \"id\": 4, \"map\": \"ERROR_TICKET_EXPIRED\" }, { \"id\": 5, \"map\": \"ERROR_UNKNOWN\" } ] }, \"fileAccess\": { \"recPositionEnd\": 8, \"recPositionStart\": 7, \"appId\": \"6021F1\", \"positionStart\": 0, \"positionEnd\": 10, \"fileId\": 3 }, \"conversionConfigs\": { \"bitEndian\": \"big\", \"type\": \"bytes\", \"byteEndian\": \"big\", \"bytesEncoding\": \"none\" } }, \"returnType\": \"enumString\" }, { \"fieldName\": \"transactionType\", \"extraParameters\": { \"staticReturnType\": \"ON\" } } ]";
  public static final String TRUE = "true";
  public static final String FALSE = "false";
  public static final String DATE_FORMAT_MM_DD_YYYY = "cs.admin.wallet.date.format";
  public static final String CORRELATION_ID="111";
  public static final String RISK_ALGORITHM_VERSION = "01";
  public static final String  PTO_LENGTH_EXCEEDED = "PTO Id Limit Exceeded";
  public static final String  CARD_UID_LENGTH_EXCEEDED = "Card Uid Id Limit Exceeded";

  public static final String INVALID_PULL_KEY = "MIF_INVALID_PULL_KEY";
  public static final String INVALID_PULL_KEY_MESAGE = "pullkeyLSCERT or pullkeyLSPKR is invalid,please retry";
  public static final String VCM_AID = "vcmAid";
  public static final String SM_AID = "smAid";
  public static final String SPSD_AID = "spsdAid";
  public static final int INT_SIXTY = 60;
  public static final int INT_MILLISECOND = 1000;
  public static final String HOUR_LABEL = "@@hours";
  public static final String MINUTES_LABEL = "@@minutes";
  public static final String DAY_LABEL = "@@days";
  public static final String MONTHS = "@@months";
  public static final int DAYS_IN_MONTH = 30;
  public static final Integer GET_INDEX = 0;
  public static final String TICKET_CONSECUTIVE_WALLET_FLAG = "mifare.service.consecutive.digitize.ticket.wallet.flag";  
  public static final String RISK_ALGORITHM_VERSION_DECIMAL_ONE = "1.0";
  public static final String CANADA_COUNTRYCODE_IN_DB = "+01";
  public static final String ACTUAL_CANADA_COUNTRYCODE = "+1";
  public static final Integer ONE_TWENTY_EIGHT = 128;
  public static final String TWO_ONE_EIGHT_SEVEN = "2177";
  public static final String TWO_ONE_NINE_SIX = "2196";
  public static final String CRTM_PTO_UIDS = "3/uids/";
  public static final String CRTM_PTO_KEYS = "/keys";
  public static final String UID_STATE_UPDATE_URL = "/states/";
  public static final String CARD_POOL_SERVICE_BASE_URL = "nxp.card.key.pooling.service.url";
  public static final int FORGET_PASSWORD_LINK_CREATION_TIME = 4;
  public static final String SUCCESS = "Success";
  public static final String DATE_FORMAT_YYYY_MM_DD = "mifare.loader.script.date.format.yyyymmdd";
  public static final String CWS = "CWS";
  public static final String CW = "CW";
  public static final String USER_TYPE = "user_type";
  public static final String EVENT_ORIGIN_UNLOCK_USER = "UNLOCK_USER";
  public static final String EVENT_ORIGIN_RESET_PASSWORD = "RESET_PASSWORD";
  public static final String VALIDATE_EMAIL_TOKEN = "VALIDATE_EMAIL_TOKEN";
  public static final String EXTRA_PARAMETERS = "extraParameters";
  public static final String DYNAMIC_FIELD_DATA = "dynamicFieldData";
  public static final String DYNAMIC_MAPPING = "dynamicMapping";
  public static final String TICKET_REFERNCE_KEY_IN_PTOCONFIG = "replaceWith";
  public static final String TICKET_REFERNCE_KEY_FROM_CARD = "fromCard";
  public static final String VALUE1 = "value1";
  public static final String VALUE2 = "value2";
  public static final String PRODUCT_ADDED_SLOT_NO = "ProductsAddedSerialNo";
  public static final String PRODUCT_ADDED_SERIAL_NO = "ProductsAddedSlotNo";
  public static final String UID_UPDATE_STATUS_URL = "nxp.update.uid.status.url";
  public static final Integer MAX_ROUTE = 100;
  public static final int SOCKET_TIMEOUT = 30000;
  public static final int POOL_MAX_TOTAL=600;
  public static final int POOL_MAX_PER_ROUTE=100;
  public static final int POOL_MAX_TOTAL_SSL=300;
  public static final int POOL_MAX_PER_ROUTE_SSL=80;
  private Constants() {}
}