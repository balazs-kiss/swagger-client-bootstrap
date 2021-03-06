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
import com.intland.swagger.client.model.AbstractReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChoiceFieldValueAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class ChoiceFieldValueAllOf {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private Integer fieldId;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<AbstractReference> values = new ArrayList<AbstractReference>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ChoiceFieldValueAllOf fieldId(Integer fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Id of the field
   * @return fieldId
  **/
  @ApiModelProperty(value = "Id of the field")
  public Integer getFieldId() {
    return fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  public ChoiceFieldValueAllOf uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Reference to the field
   * @return uri
  **/
  @ApiModelProperty(value = "Reference to the field")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ChoiceFieldValueAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the field
   * @return name
  **/
  @ApiModelProperty(value = "Name of the field")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChoiceFieldValueAllOf values(List<AbstractReference> values) {
    this.values = values;
    return this;
  }

  public ChoiceFieldValueAllOf addValuesItem(AbstractReference valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<AbstractReference>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Values of the choice option field
   * @return values
  **/
  @ApiModelProperty(value = "Values of the choice option field")
  public List<AbstractReference> getValues() {
    return values;
  }

  public void setValues(List<AbstractReference> values) {
    this.values = values;
  }

  public ChoiceFieldValueAllOf type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the field
   * @return type
  **/
  @ApiModelProperty(value = "Type of the field")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChoiceFieldValueAllOf choiceFieldValueAllOf = (ChoiceFieldValueAllOf) o;
    return Objects.equals(this.fieldId, choiceFieldValueAllOf.fieldId) &&
        Objects.equals(this.uri, choiceFieldValueAllOf.uri) &&
        Objects.equals(this.name, choiceFieldValueAllOf.name) &&
        Objects.equals(this.values, choiceFieldValueAllOf.values) &&
        Objects.equals(this.type, choiceFieldValueAllOf.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, uri, name, values, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoiceFieldValueAllOf {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

