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

/**
 * MediaStorage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-15T13:46:39.360Z")
public class MediaStorage {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("messageId")
  private UUID messageId = null;

  /**
   * The type of the media.
   */
  @JsonAdapter(MediaTypeEnum.Adapter.class)
  public enum MediaTypeEnum {
    IMAGE("image"),
    
    VIDEO("video"),
    
    AUDIO("audio"),
    
    FILE("file");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MediaTypeEnum fromValue(String text) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MediaTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MediaTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MediaTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MediaTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mediaType")
  private MediaTypeEnum mediaType = null;

  @SerializedName("mediaUrl")
  private String mediaUrl = null;

  @SerializedName("thumbnailUrl")
  private String thumbnailUrl = null;

  public MediaStorage id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The media storage&#39;s UUID.
   * @return id
  **/
  @ApiModelProperty(value = "The media storage's UUID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public MediaStorage messageId(UUID messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * The UUID of the message containing the media.
   * @return messageId
  **/
  @ApiModelProperty(value = "The UUID of the message containing the media.")
  public UUID getMessageId() {
    return messageId;
  }

  public void setMessageId(UUID messageId) {
    this.messageId = messageId;
  }

  public MediaStorage mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The type of the media.
   * @return mediaType
  **/
  @ApiModelProperty(value = "The type of the media.")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public MediaStorage mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The URL where the media is stored.
   * @return mediaUrl
  **/
  @ApiModelProperty(value = "The URL where the media is stored.")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public MediaStorage thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * The URL of the media&#39;s thumbnail, if applicable.
   * @return thumbnailUrl
  **/
  @ApiModelProperty(value = "The URL of the media's thumbnail, if applicable.")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStorage mediaStorage = (MediaStorage) o;
    return Objects.equals(this.id, mediaStorage.id) &&
        Objects.equals(this.messageId, mediaStorage.messageId) &&
        Objects.equals(this.mediaType, mediaStorage.mediaType) &&
        Objects.equals(this.mediaUrl, mediaStorage.mediaUrl) &&
        Objects.equals(this.thumbnailUrl, mediaStorage.thumbnailUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messageId, mediaType, mediaUrl, thumbnailUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaStorage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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
