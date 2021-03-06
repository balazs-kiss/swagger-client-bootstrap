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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Settings for a resizeable column definition.
 */
@ApiModel(description = "Settings for a resizeable column definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class ResizableReportColumnSettings {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private Integer fieldId;

  public static final String SERIALIZED_NAME_TRACKER_ID = "trackerId";
  @SerializedName(SERIALIZED_NAME_TRACKER_ID)
  private Integer trackerId;

  public static final String SERIALIZED_NAME_COLUMN_INDEX = "columnIndex";
  @SerializedName(SERIALIZED_NAME_COLUMN_INDEX)
  private Integer columnIndex;

  public static final String SERIALIZED_NAME_COLUMN_WIDTH_PERCENTAGE = "columnWidthPercentage";
  @SerializedName(SERIALIZED_NAME_COLUMN_WIDTH_PERCENTAGE)
  private Double columnWidthPercentage;

  public ResizableReportColumnSettings fieldId(Integer fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Field identifier in a tracker
   * @return fieldId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Field identifier in a tracker")
  public Integer getFieldId() {
    return fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  public ResizableReportColumnSettings trackerId(Integer trackerId) {
    this.trackerId = trackerId;
    return this;
  }

   /**
   * Tracker identifier
   * @return trackerId
  **/
  @ApiModelProperty(example = "1230", value = "Tracker identifier")
  public Integer getTrackerId() {
    return trackerId;
  }

  public void setTrackerId(Integer trackerId) {
    this.trackerId = trackerId;
  }

  public ResizableReportColumnSettings columnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Index of the column in the report table.
   * @return columnIndex
  **/
  @ApiModelProperty(example = "0", required = true, value = "Index of the column in the report table.")
  public Integer getColumnIndex() {
    return columnIndex;
  }

  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }

  public ResizableReportColumnSettings columnWidthPercentage(Double columnWidthPercentage) {
    this.columnWidthPercentage = columnWidthPercentage;
    return this;
  }

   /**
   * Width of the column in percentage.
   * @return columnWidthPercentage
  **/
  @ApiModelProperty(example = "43.2", value = "Width of the column in percentage.")
  public Double getColumnWidthPercentage() {
    return columnWidthPercentage;
  }

  public void setColumnWidthPercentage(Double columnWidthPercentage) {
    this.columnWidthPercentage = columnWidthPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResizableReportColumnSettings resizableReportColumnSettings = (ResizableReportColumnSettings) o;
    return Objects.equals(this.fieldId, resizableReportColumnSettings.fieldId) &&
        Objects.equals(this.trackerId, resizableReportColumnSettings.trackerId) &&
        Objects.equals(this.columnIndex, resizableReportColumnSettings.columnIndex) &&
        Objects.equals(this.columnWidthPercentage, resizableReportColumnSettings.columnWidthPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, trackerId, columnIndex, columnWidthPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResizableReportColumnSettings {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    columnWidthPercentage: ").append(toIndentedString(columnWidthPercentage)).append("\n");
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

