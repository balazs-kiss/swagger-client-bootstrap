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
import com.intland.swagger.client.model.TrackerItemRevision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tracker item child update request
 */
@ApiModel(description = "Tracker item child update request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class UpdateTrackerItemChildrenRequest {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<TrackerItemRevision> children = new ArrayList<TrackerItemRevision>();

  public UpdateTrackerItemChildrenRequest children(List<TrackerItemRevision> children) {
    this.children = children;
    return this;
  }

  public UpdateTrackerItemChildrenRequest addChildrenItem(TrackerItemRevision childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<TrackerItemRevision>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Child items to update
   * @return children
  **/
  @ApiModelProperty(value = "Child items to update")
  public List<TrackerItemRevision> getChildren() {
    return children;
  }

  public void setChildren(List<TrackerItemRevision> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = (UpdateTrackerItemChildrenRequest) o;
    return Objects.equals(this.children, updateTrackerItemChildrenRequest.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrackerItemChildrenRequest {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

