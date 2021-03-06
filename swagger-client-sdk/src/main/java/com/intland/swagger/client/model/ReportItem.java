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
import com.intland.swagger.client.model.TrackerItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An item of the report.
 */
@ApiModel(description = "An item of the report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class ReportItem {
  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private TrackerItem item = null;

  public static final String SERIALIZED_NAME_OUTLINE_LEVEL = "outlineLevel";
  @SerializedName(SERIALIZED_NAME_OUTLINE_LEVEL)
  private Integer outlineLevel;

  public static final String SERIALIZED_NAME_IS_REAL_RESULT = "isRealResult";
  @SerializedName(SERIALIZED_NAME_IS_REAL_RESULT)
  private Boolean isRealResult;

  public ReportItem item(TrackerItem item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")
  public TrackerItem getItem() {
    return item;
  }

  public void setItem(TrackerItem item) {
    this.item = item;
  }

  public ReportItem outlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * Item&#39;s level in the tracker outline.
   * @return outlineLevel
  **/
  @ApiModelProperty(value = "Item's level in the tracker outline.")
  public Integer getOutlineLevel() {
    return outlineLevel;
  }

  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }

  public ReportItem isRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
    return this;
  }

   /**
   * Indicator if the item is a real query result (e.g. not an ancestor item).
   * @return isRealResult
  **/
  @ApiModelProperty(value = "Indicator if the item is a real query result (e.g. not an ancestor item).")
  public Boolean getIsRealResult() {
    return isRealResult;
  }

  public void setIsRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportItem reportItem = (ReportItem) o;
    return Objects.equals(this.item, reportItem.item) &&
        Objects.equals(this.outlineLevel, reportItem.outlineLevel) &&
        Objects.equals(this.isRealResult, reportItem.isRealResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, outlineLevel, isRealResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportItem {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
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

