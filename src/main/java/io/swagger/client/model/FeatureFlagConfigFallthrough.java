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
import io.swagger.client.model.Rollout;
import java.io.IOException;

/**
 * FeatureFlagConfigFallthrough
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T18:49:13.486-05:00")
public class FeatureFlagConfigFallthrough {
  @SerializedName("variation")
  private Integer variation = null;

  @SerializedName("rollout")
  private Rollout rollout = null;

  public FeatureFlagConfigFallthrough variation(Integer variation) {
    this.variation = variation;
    return this;
  }

   /**
   * Get variation
   * @return variation
  **/
  @ApiModelProperty(value = "")
  public Integer getVariation() {
    return variation;
  }

  public void setVariation(Integer variation) {
    this.variation = variation;
  }

  public FeatureFlagConfigFallthrough rollout(Rollout rollout) {
    this.rollout = rollout;
    return this;
  }

   /**
   * Get rollout
   * @return rollout
  **/
  @ApiModelProperty(value = "")
  public Rollout getRollout() {
    return rollout;
  }

  public void setRollout(Rollout rollout) {
    this.rollout = rollout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagConfigFallthrough featureFlagConfigFallthrough = (FeatureFlagConfigFallthrough) o;
    return Objects.equals(this.variation, featureFlagConfigFallthrough.variation) &&
        Objects.equals(this.rollout, featureFlagConfigFallthrough.rollout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variation, rollout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagConfigFallthrough {\n");
    
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
    sb.append("    rollout: ").append(toIndentedString(rollout)).append("\n");
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

