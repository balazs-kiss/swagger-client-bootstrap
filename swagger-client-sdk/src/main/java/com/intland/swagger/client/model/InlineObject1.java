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
import com.intland.swagger.client.model.TrackerItemsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineObject1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class InlineObject1 {
  public static final String SERIALIZED_NAME_ITEM_IDS = "itemIds";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private TrackerItemsRequest itemIds = null;

  public InlineObject1 itemIds(TrackerItemsRequest itemIds) {
    this.itemIds = itemIds;
    return this;
  }

   /**
   * Get itemIds
   * @return itemIds
  **/
  @ApiModelProperty(value = "")
  public TrackerItemsRequest getItemIds() {
    return itemIds;
  }

  public void setItemIds(TrackerItemsRequest itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(this.itemIds, inlineObject1.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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

