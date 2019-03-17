/**
 * 
 */
package com.nxp.hcedemomws.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 19-Dec-2017 11:14:13 AM
 * @version 1.0
 */
public final class JsonUtil {
  
  private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);
  
  private JsonUtil() {
    //Do Nothing
  }
  
  /**
   * Construct JSON from Object
   * 
   * @param object
   * @return
   */
  public static String toJSON(Object object) {
    if (object == null) {
      return "{}";
    } else {
      try {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
      } catch (Exception e) {
        logger.error("RestUtil :: toJSON method", e, "");
        return "{}";
      }
    }
  }
  
  /**
   * Construct Object of given class from JSON String
   * 
   * @param jsonString
   * @param type
   * @return
   * @throws IOException 
   * @throws JsonMappingException 
   * @throws JsonParseException 
   */
  public static <T> T toObject(String jsonString, Class<T> type) {
    try {
      if (jsonString == null) {
        return null;
      } else {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonString, type);
      }
    } catch (IOException e) {
      logger.error("JsonUtil :: convertJSONToObject method", e, "");
      return null;
    }
  }
}
