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
 * PushNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-15T13:46:39.360Z")
public class PushNotification {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("userId")
  private UUID userId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("body")
  private String body = null;

  /**
   * The platform on which the push notification will be sent.
   */
  @JsonAdapter(PlatformEnum.Adapter.class)
  public enum PlatformEnum {
    ANDROID("android"),
    
    IOS("ios"),
    
    WEB("web");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformEnum fromValue(String text) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PlatformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("platform")
  private PlatformEnum platform = null;

  /**
   * The status of the push notification.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SENT("sent"),
    
    DELIVERED("delivered"),
    
    OPENED("opened"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  public PushNotification id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The push notification UUID.
   * @return id
  **/
  @ApiModelProperty(value = "The push notification UUID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PushNotification userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The UUID of the user to receive the push notification.
   * @return userId
  **/
  @ApiModelProperty(value = "The UUID of the user to receive the push notification.")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public PushNotification title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the push notification.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the push notification.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PushNotification body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The content of the push notification.
   * @return body
  **/
  @ApiModelProperty(value = "The content of the push notification.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public PushNotification platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

   /**
   * The platform on which the push notification will be sent.
   * @return platform
  **/
  @ApiModelProperty(value = "The platform on which the push notification will be sent.")
  public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }

  public PushNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the push notification.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the push notification.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PushNotification createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The timestamp when the push notification was created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The timestamp when the push notification was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushNotification pushNotification = (PushNotification) o;
    return Objects.equals(this.id, pushNotification.id) &&
        Objects.equals(this.userId, pushNotification.userId) &&
        Objects.equals(this.title, pushNotification.title) &&
        Objects.equals(this.body, pushNotification.body) &&
        Objects.equals(this.platform, pushNotification.platform) &&
        Objects.equals(this.status, pushNotification.status) &&
        Objects.equals(this.createdAt, pushNotification.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, title, body, platform, status, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

