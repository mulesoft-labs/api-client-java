/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.3
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.launchdarkly.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.api.model.Policy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomRoleBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-20T15:51:46.991-07:00")
public class CustomRoleBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("policy")
  private List<Policy> policy = new ArrayList<Policy>();

  public CustomRoleBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the custom role.
   * @return name
  **/
  @ApiModelProperty(example = "revenue team", required = true, value = "Name of the custom role.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomRoleBody description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the custom role.
   * @return description
  **/
  @ApiModelProperty(example = "Description of revenue team role here", value = "Description of the custom role.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomRoleBody key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CustomRoleBody policy(List<Policy> policy) {
    this.policy = policy;
    return this;
  }

  public CustomRoleBody addPolicyItem(Policy policyItem) {
    this.policy.add(policyItem);
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Policy> getPolicy() {
    return policy;
  }

  public void setPolicy(List<Policy> policy) {
    this.policy = policy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRoleBody customRoleBody = (CustomRoleBody) o;
    return Objects.equals(this.name, customRoleBody.name) &&
        Objects.equals(this.description, customRoleBody.description) &&
        Objects.equals(this.key, customRoleBody.key) &&
        Objects.equals(this.policy, customRoleBody.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, key, policy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRoleBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

