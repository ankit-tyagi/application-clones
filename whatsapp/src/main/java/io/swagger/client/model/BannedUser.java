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
 * BannedUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-15T13:46:39.360Z")
public class BannedUser {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("userId")
  private UUID userId = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("bannedAt")
  private OffsetDateTime bannedAt = null;

  public BannedUser id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The banned user&#39;s UUID.
   * @return id
  **/
  @ApiModelProperty(value = "The banned user's UUID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BannedUser userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The UUID of the user who is banned.
   * @return userId
  **/
  @ApiModelProperty(value = "The UUID of the user who is banned.")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public BannedUser reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for banning the user.
   * @return reason
  **/
  @ApiModelProperty(value = "The reason for banning the user.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public BannedUser bannedAt(OffsetDateTime bannedAt) {
    this.bannedAt = bannedAt;
    return this;
  }

   /**
   * The timestamp when the user was banned.
   * @return bannedAt
  **/
  @ApiModelProperty(value = "The timestamp when the user was banned.")
  public OffsetDateTime getBannedAt() {
    return bannedAt;
  }

  public void setBannedAt(OffsetDateTime bannedAt) {
    this.bannedAt = bannedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BannedUser bannedUser = (BannedUser) o;
    return Objects.equals(this.id, bannedUser.id) &&
        Objects.equals(this.userId, bannedUser.userId) &&
        Objects.equals(this.reason, bannedUser.reason) &&
        Objects.equals(this.bannedAt, bannedUser.bannedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, reason, bannedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BannedUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    bannedAt: ").append(toIndentedString(bannedAt)).append("\n");
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

