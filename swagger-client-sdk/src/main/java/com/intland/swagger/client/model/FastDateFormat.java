/*
 * codeBeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.model.FastDateFormatLocale;
import com.intland.swagger.client.model.FastDateFormatTimeZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FastDateFormat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class FastDateFormat {
  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_MAX_LENGTH_ESTIMATE = "maxLengthEstimate";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH_ESTIMATE)
  private Integer maxLengthEstimate;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private FastDateFormatLocale locale = null;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private FastDateFormatTimeZone timeZone = null;

  public static final String SERIALIZED_NAME_TIME_ZONE_OVERRIDES_CALENDAR = "timeZoneOverridesCalendar";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_OVERRIDES_CALENDAR)
  private Boolean timeZoneOverridesCalendar;

  public FastDateFormat pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public FastDateFormat maxLengthEstimate(Integer maxLengthEstimate) {
    this.maxLengthEstimate = maxLengthEstimate;
    return this;
  }

   /**
   * Get maxLengthEstimate
   * @return maxLengthEstimate
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxLengthEstimate() {
    return maxLengthEstimate;
  }

  public void setMaxLengthEstimate(Integer maxLengthEstimate) {
    this.maxLengthEstimate = maxLengthEstimate;
  }

  public FastDateFormat locale(FastDateFormatLocale locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public FastDateFormatLocale getLocale() {
    return locale;
  }

  public void setLocale(FastDateFormatLocale locale) {
    this.locale = locale;
  }

  public FastDateFormat timeZone(FastDateFormatTimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public FastDateFormatTimeZone getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(FastDateFormatTimeZone timeZone) {
    this.timeZone = timeZone;
  }

  public FastDateFormat timeZoneOverridesCalendar(Boolean timeZoneOverridesCalendar) {
    this.timeZoneOverridesCalendar = timeZoneOverridesCalendar;
    return this;
  }

   /**
   * Get timeZoneOverridesCalendar
   * @return timeZoneOverridesCalendar
  **/
  @ApiModelProperty(value = "")
  public Boolean getTimeZoneOverridesCalendar() {
    return timeZoneOverridesCalendar;
  }

  public void setTimeZoneOverridesCalendar(Boolean timeZoneOverridesCalendar) {
    this.timeZoneOverridesCalendar = timeZoneOverridesCalendar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastDateFormat fastDateFormat = (FastDateFormat) o;
    return Objects.equals(this.pattern, fastDateFormat.pattern) &&
        Objects.equals(this.maxLengthEstimate, fastDateFormat.maxLengthEstimate) &&
        Objects.equals(this.locale, fastDateFormat.locale) &&
        Objects.equals(this.timeZone, fastDateFormat.timeZone) &&
        Objects.equals(this.timeZoneOverridesCalendar, fastDateFormat.timeZoneOverridesCalendar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, maxLengthEstimate, locale, timeZone, timeZoneOverridesCalendar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastDateFormat {\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    maxLengthEstimate: ").append(toIndentedString(maxLengthEstimate)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeZoneOverridesCalendar: ").append(toIndentedString(timeZoneOverridesCalendar)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

