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
 * FriendRequestStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-15T13:46:39.360Z")
public class FriendRequestStatus {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("friendRequestId")
  private UUID friendRequestId = null;

  /**
   * The status of the friend request.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    ACCEPTED("accepted"),
    
    REJECTED("rejected"),
    
    CANCELLED("cancelled");

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

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public FriendRequestStatus id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The friend request status UUID.
   * @return id
  **/
  @ApiModelProperty(value = "The friend request status UUID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FriendRequestStatus friendRequestId(UUID friendRequestId) {
    this.friendRequestId = friendRequestId;
    return this;
  }

   /**
   * The UUID of the related friend request.
   * @return friendRequestId
  **/
  @ApiModelProperty(value = "The UUID of the related friend request.")
  public UUID getFriendRequestId() {
    return friendRequestId;
  }

  public void setFriendRequestId(UUID friendRequestId) {
    this.friendRequestId = friendRequestId;
  }

  public FriendRequestStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the friend request.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the friend request.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FriendRequestStatus updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The timestamp when the friend request status was last updated.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The timestamp when the friend request status was last updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendRequestStatus friendRequestStatus = (FriendRequestStatus) o;
    return Objects.equals(this.id, friendRequestStatus.id) &&
        Objects.equals(this.friendRequestId, friendRequestStatus.friendRequestId) &&
        Objects.equals(this.status, friendRequestStatus.status) &&
        Objects.equals(this.updatedAt, friendRequestStatus.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, friendRequestId, status, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendRequestStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    friendRequestId: ").append(toIndentedString(friendRequestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

