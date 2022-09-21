package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundTrasferDebitAuthorization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class FundTrasferDebitAuthorization   {
  @JsonProperty("otpCode")
  private String otpCode;

  @JsonProperty("otpReference")
  private String otpReference;

  public FundTrasferDebitAuthorization otpCode(String otpCode) {
    this.otpCode = otpCode;
    return this;
  }

  /**
   * Get otpCode
   * @return otpCode
  */
  @ApiModelProperty(value = "")


  public String getOtpCode() {
    return otpCode;
  }

  public void setOtpCode(String otpCode) {
    this.otpCode = otpCode;
  }

  public FundTrasferDebitAuthorization otpReference(String otpReference) {
    this.otpReference = otpReference;
    return this;
  }

  /**
   * Get otpReference
   * @return otpReference
  */
  @ApiModelProperty(value = "")


  public String getOtpReference() {
    return otpReference;
  }

  public void setOtpReference(String otpReference) {
    this.otpReference = otpReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundTrasferDebitAuthorization fundTrasferDebitAuthorization = (FundTrasferDebitAuthorization) o;
    return Objects.equals(this.otpCode, fundTrasferDebitAuthorization.otpCode) &&
        Objects.equals(this.otpReference, fundTrasferDebitAuthorization.otpReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otpCode, otpReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundTrasferDebitAuthorization {\n");
    
    sb.append("    otpCode: ").append(toIndentedString(otpCode)).append("\n");
    sb.append("    otpReference: ").append(toIndentedString(otpReference)).append("\n");
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

