/*
 * WhatsApp API
 * A RESTful API for a WhatsApp clone application.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * StatusUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-15T13:46:39.360Z")
public class StatusUpdate {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("userId")
  private UUID userId = null;

  @SerializedName("content")
  private String content = null;

  /**
   * The type of the status update.
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    TEXT("text"),
    
    IMAGE("image"),
    
    VIDEO("video");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String text) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contentType")
  private ContentTypeEnum contentType = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("expiresIn")
  private Integer expiresIn = null;

  public StatusUpdate id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The status update&#39;s UUID.
   * @return id
  **/
  @ApiModelProperty(value = "The status update's UUID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public StatusUpdate userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The UUID of the user who posted the status update.
   * @return userId
  **/
  @ApiModelProperty(value = "The UUID of the user who posted the status update.")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public StatusUpdate content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the status update.
   * @return content
  **/
  @ApiModelProperty(value = "The content of the status update.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public StatusUpdate contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The type of the status update.
   * @return contentType
  **/
  @ApiModelProperty(value = "The type of the status update.")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public StatusUpdate timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp when the status update was posted.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The timestamp when the status update was posted.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public StatusUpdate expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The number of seconds until the status update expires.
   * @return expiresIn
  **/
  @ApiModelProperty(value = "The number of seconds until the status update expires.")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusUpdate statusUpdate = (StatusUpdate) o;
    return Objects.equals(this.id, statusUpdate.id) &&
        Objects.equals(this.userId, statusUpdate.userId) &&
        Objects.equals(this.content, statusUpdate.content) &&
        Objects.equals(this.contentType, statusUpdate.contentType) &&
        Objects.equals(this.timestamp, statusUpdate.timestamp) &&
        Objects.equals(this.expiresIn, statusUpdate.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, content, contentType, timestamp, expiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

