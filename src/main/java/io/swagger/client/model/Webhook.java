/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Links;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Webhook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T18:49:13.486-05:00")
public class Webhook {
  @SerializedName("_links")
  private Links links = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public Webhook links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Webhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(value = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Webhook on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Get on
   * @return on
  **/
  @ApiModelProperty(value = "")
  public Boolean getOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }

  public Webhook tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Webhook addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.links, webhook.links) &&
        Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.on, webhook.on) &&
        Objects.equals(this.tags, webhook.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, url, secret, on, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

