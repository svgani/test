package com.nxp.hcedemomws.util;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * << Add Comments Here >>
 *
 * @author NXP
 * @date 17-Apr-2017 11:52:46 AM
 * @version 1.0
 */
public class MIFARECommonUtils {

  private static Logger logger = LoggerFactory.getLogger(MIFARECommonUtils.class);

  private static final char[] DIGITS_UPPER =
      {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

  private MIFARECommonUtils() {

  }
  /**
   * Method to get padded size
   * 
   * @param size
   * @param padding_size
   * @return
   */
  public static int paddedSize(int size, int paddingSize) {
    if (size % paddingSize == 0)
      return size;

    return ((size / paddingSize) + 1) * paddingSize;
  }

  /**
   * Method to convert bytes array to Int
   * 
   * @param bytes
   * @return
   */
  public static int bytesToInt(final byte... bytes) {
    int res = 0;

    for (int i = 0; i < bytes.length; i++)
      res = (res << Constants.EIGHT) | (bytes[i] & 0xff);

    return res;
  }

 /**
   * Method to convert integer value to byte array
   * 
   * @param val
   * @return
   */
  public static byte[] intToBytes(int val, int length) {
    byte[] res = new byte[length];

    for (int i = length - 1; i >= 0; i--) {
      res[i] = (byte) (val);
      val = (val >> Constants.EIGHT);
    }
    return res;
  }

  /**
   * Converts an array of bytes into a {@link String} representing the
   * hexadecimal values of each byte in order.<br />
   * <i>Note</i>: Implementation took from <i>Apache commons</i>.
   *
   * @param array
   *          a byte[] to convert to Hex characters
   * @return a {@link String} containing hexadecimal representation
   */
  public static String getHexString(final byte... array) {
    assert array != null;

    final int length = array.length;
    final char[] out = new char[length << 1];
    int i,j;
    for ( i = 0, j = 0; i < length; i++) {
      out[j] = DIGITS_UPPER[(0xF0 & array[i]) >>> Constants.FOUR];
      j++;
      out[j] = DIGITS_UPPER[0x0F & array[i]];
      j++;
    }

    return String.valueOf(out);
  }

  /**
   * This method is used to convert hex string to byte array
   * 
   * @param hexString
   * @return
   */
  public static byte[] hexStringToByteArray(String hexString) {
    byte[] result = null;

    if (hexString != null) {
      result = new byte[hexString.length() / Constants.TWO];

      for (int i = 0; i < result.length; i++) {
        int j = i * Constants.TWO;
        char msb = hexString.charAt(j);
        char lsb = hexString.charAt(j + 1);

        result[i] = (byte) (char) (((hexCharToInt(msb) << Constants.FOUR) & 0x00F0)
            | (hexCharToInt(lsb) & 0x000F));
      }
    }
    return result;
  }

  /**
   * @param c
   * @return
   */
  public static int hexCharToInt(char c) {
    int i = 0;

    if ((c >= '0') && (c <= '9'))
      i = c - '0';
    else if ((c >= 'A') && (c <= 'F'))
      i = c - 'A' + Constants.TEN;
    else if ((c >= 'a') && (c <= 'f'))
      i = c - 'a' + Constants.TEN;

    return i;
  }

  /**
   * This method compares the content of two byte arrays. It returns
   * {@code true} if, and only if the arrays are not {@code null} and the
   * contents beginning at the specified offsets are equal for the specified
   * length.
   *
   * @param firstArray
   *          first array
   * @param firstOffset
   *          offset in the first array
   * @param secondArray
   *          second array
   * @param secondOffset
   *          offset in the second array
   * @param length
   *          length to compare over
   * @return {@code true} if the compared part is equal, otherwise {@code false}
   */
  public static boolean arrayCompare(final byte[] firstArray, final int firstOffset,
      final byte[] secondArray, final int secondOffset, final int length) {
    // initial checks
    if ((firstArray == null) || (secondArray == null)) {
      return false;
    }
    if ((firstOffset < 0) || (secondOffset < 0) || (length < 0)) {
      return false;
    }
    if ((firstOffset >= firstArray.length) || (secondOffset >= secondArray.length)
        || ((firstOffset + length) > firstArray.length)
        || ((secondOffset + length) > secondArray.length)) {
      return false;
    }

    for (int i = 0; i < length; i++) {
      if (firstArray[firstOffset + i] != secondArray[secondOffset + i]) {
        return false;
      }
    }

    return true;
  }

  public static byte[] getRandomBytes(int size) {
    byte[] bytes = new byte[size];
    try {
      SecureRandom sha1Random = SecureRandom.getInstance("SHA1PRNG");
      sha1Random.nextBytes(bytes);
    } catch (NoSuchAlgorithmException e) {
      logger.error("Exception :: MIFARECommonUtils :: getRandomBytes method " + e);
    }
    return bytes;
  }

  /**
   * Method to convert long value to byte array
   *
   * @param val
   * @return
   */
  public static byte[] longToBytes(final long val, int length) {
    byte[] res = new byte[length];

    for (int i = 0; i < length; i++)
      res[i] = (byte) (val >> ((Constants.THREE - i) * Constants.EIGHT));

    return res;
  }

  /**
   * Method to get long to binary
   * @param ptoId Ex: 1
   * @param length Ex: 13
   * @param lsbRequired Ex: true
   * @return Ex: 1000000000000
   */
  public static String getlongToBinaryWithSpecifiedLength(Long ptoId, int length,
      boolean lsbRequired) {
    String res = String.format("%0" + length + "d", new BigInteger(Long.toBinaryString(ptoId)));
    if (lsbRequired) {
      res = new StringBuilder(res).reverse().toString();
    }
    return res.trim();
  }

  /**
   * Method to get HEX String from Binary string
   *
   * @param binaryString Ex: 00001111
   * @return String Ex:  0F
   */
  public static String getHexFromBinaryString(String binaryString) {
    return MIFARECommonUtils.getHexString(new BigInteger(binaryString, 2).toByteArray());
  }
 
}
