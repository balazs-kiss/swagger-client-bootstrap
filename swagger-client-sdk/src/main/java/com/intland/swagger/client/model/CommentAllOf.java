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
import com.intland.swagger.client.model.Attachment;
import com.intland.swagger.client.model.CommentReference;
import com.intland.swagger.client.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * CommentAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class CommentAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private DateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserReference createdBy = null;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modifiedAt";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private DateTime modifiedAt;

  public static final String SERIALIZED_NAME_MODIFIER = "modifier";
  @SerializedName(SERIALIZED_NAME_MODIFIER)
  private UserReference modifier = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = new ArrayList<Attachment>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  /**
   * Format of a comment
   */
  @JsonAdapter(CommentFormatEnum.Adapter.class)
  public enum CommentFormatEnum {
    PLAINTEXT("PlainText"),
    
    HTML("Html"),
    
    WIKI("Wiki");

    private String value;

    CommentFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommentFormatEnum fromValue(String value) {
      for (CommentFormatEnum b : CommentFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CommentFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommentFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommentFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommentFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMMENT_FORMAT = "commentFormat";
  @SerializedName(SERIALIZED_NAME_COMMENT_FORMAT)
  private CommentFormatEnum commentFormat;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private CommentReference replyTo = null;

  public CommentAllOf id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * @return id
  **/
  @ApiModelProperty(value = "Id of the entity")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CommentAllOf uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Reference to an object
   * @return uri
  **/
  @ApiModelProperty(value = "Reference to an object")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public CommentAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @ApiModelProperty(value = "Name of the entity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CommentAllOf type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of a referenced object
   * @return type
  **/
  @ApiModelProperty(value = "Type of a referenced object")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CommentAllOf version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Version of a comment
   * @return version
  **/
  @ApiModelProperty(value = "Version of a comment")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CommentAllOf createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of a comment
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation date of a comment")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CommentAllOf createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public UserReference getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }

  public CommentAllOf modifiedAt(DateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Modification date of a comment
   * @return modifiedAt
  **/
  @ApiModelProperty(value = "Modification date of a comment")
  public DateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(DateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public CommentAllOf modifier(UserReference modifier) {
    this.modifier = modifier;
    return this;
  }

   /**
   * Get modifier
   * @return modifier
  **/
  @ApiModelProperty(value = "")
  public UserReference getModifier() {
    return modifier;
  }

  public void setModifier(UserReference modifier) {
    this.modifier = modifier;
  }

  public CommentAllOf attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public CommentAllOf addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments of a comment
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments of a comment")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public CommentAllOf comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Text of a comment
   * @return comment
  **/
  @ApiModelProperty(value = "Text of a comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public CommentAllOf commentFormat(CommentFormatEnum commentFormat) {
    this.commentFormat = commentFormat;
    return this;
  }

   /**
   * Format of a comment
   * @return commentFormat
  **/
  @ApiModelProperty(value = "Format of a comment")
  public CommentFormatEnum getCommentFormat() {
    return commentFormat;
  }

  public void setCommentFormat(CommentFormatEnum commentFormat) {
    this.commentFormat = commentFormat;
  }

  public CommentAllOf replyTo(CommentReference replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @ApiModelProperty(value = "")
  public CommentReference getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(CommentReference replyTo) {
    this.replyTo = replyTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentAllOf commentAllOf = (CommentAllOf) o;
    return Objects.equals(this.id, commentAllOf.id) &&
        Objects.equals(this.uri, commentAllOf.uri) &&
        Objects.equals(this.name, commentAllOf.name) &&
        Objects.equals(this.type, commentAllOf.type) &&
        Objects.equals(this.version, commentAllOf.version) &&
        Objects.equals(this.createdAt, commentAllOf.createdAt) &&
        Objects.equals(this.createdBy, commentAllOf.createdBy) &&
        Objects.equals(this.modifiedAt, commentAllOf.modifiedAt) &&
        Objects.equals(this.modifier, commentAllOf.modifier) &&
        Objects.equals(this.attachments, commentAllOf.attachments) &&
        Objects.equals(this.comment, commentAllOf.comment) &&
        Objects.equals(this.commentFormat, commentAllOf.commentFormat) &&
        Objects.equals(this.replyTo, commentAllOf.replyTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, name, type, version, createdAt, createdBy, modifiedAt, modifier, attachments, comment, commentFormat, replyTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    commentFormat: ").append(toIndentedString(commentFormat)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
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

