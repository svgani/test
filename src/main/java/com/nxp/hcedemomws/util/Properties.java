package com.nxp.hcedemomws.util;


import java.io.IOException;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 *Utility class to fetch the properties' values from property file 
 * 
 * @Author: NXP
 * @Date: 13-Jun-2014
 * @Time: 10:58:03 am
 * @Version: 1.0
 *
 */
public class Properties extends PropertyPlaceholderConfigurer {

  // Property key for propsExported
  private static java.util.Properties propsExported = new java.util.Properties();

  /*
   * (non-Javadoc)
   * @see
   * org.springframework.core.io.support.PropertiesLoaderSupport#mergeProperties
   * ()
   */
  @Override
  protected java.util.Properties mergeProperties() throws IOException {
    return mergeSuperProperties(super.mergeProperties());
  }
  
  private static java.util.Properties mergeSuperProperties(java.util.Properties properties) {
    propsExported = properties;
    return propsExported;
  }
  
  /**
   * Get the value of given key from the property file
   * 
   * @param key
   * @return
   */
  public static String getProperty(final String key) {
    String value = propsExported.getProperty(key);
    return ((value == null) ? "" : value);
  }
  
  /**
   * Get the value of given key from the property file
   * 
   * @param key
   * @param defaultValue
   * @return
   */
  public static String getProperty(final String key, final String defaultValue) {
    String value = propsExported.getProperty(key, defaultValue);
    return ((value == null) ? "" : value);
  }
  
  public static void mergeProperties(java.util.Properties properties) throws IOException {
    propsExported = properties;
  }
}
