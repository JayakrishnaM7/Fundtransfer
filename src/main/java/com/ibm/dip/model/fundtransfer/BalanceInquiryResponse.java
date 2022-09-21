package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response for Balance Inquiry
 */
@ApiModel(description = "Response for Balance Inquiry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class BalanceInquiryResponse   {
  @JsonProperty("balanceAvailable")
  private Double balanceAvailable;

  @JsonProperty("balanceCurrent")
  private Double balanceCurrent;

  @JsonProperty("balanceOnHold")
  private Integer balanceOnHold;

  public BalanceInquiryResponse balanceAvailable(Double balanceAvailable) {
    this.balanceAvailable = balanceAvailable;
    return this;
  }

  /**
   * Get balanceAvailable
   * @return balanceAvailable
  */
  @ApiModelProperty(value = "")


  public Double getBalanceAvailable() {
    return balanceAvailable;
  }

  public void setBalanceAvailable(Double balanceAvailable) {
    this.balanceAvailable = balanceAvailable;
  }

  public BalanceInquiryResponse balanceCurrent(Double balanceCurrent) {
    this.balanceCurrent = balanceCurrent;
    return this;
  }

  /**
   * Get balanceCurrent
   * @return balanceCurrent
  */
  @ApiModelProperty(value = "")


  public Double getBalanceCurrent() {
    return balanceCurrent;
  }

  public void setBalanceCurrent(Double balanceCurrent) {
    this.balanceCurrent = balanceCurrent;
  }

  public BalanceInquiryResponse balanceOnHold(Integer balanceOnHold) {
    this.balanceOnHold = balanceOnHold;
    return this;
  }

  /**
   * Get balanceOnHold
   * @return balanceOnHold
  */
  @ApiModelProperty(value = "")


  public Integer getBalanceOnHold() {
    return balanceOnHold;
  }

  public void setBalanceOnHold(Integer balanceOnHold) {
    this.balanceOnHold = balanceOnHold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceInquiryResponse balanceInquiryResponse = (BalanceInquiryResponse) o;
    return Objects.equals(this.balanceAvailable, balanceInquiryResponse.balanceAvailable) &&
        Objects.equals(this.balanceCurrent, balanceInquiryResponse.balanceCurrent) &&
        Objects.equals(this.balanceOnHold, balanceInquiryResponse.balanceOnHold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAvailable, balanceCurrent, balanceOnHold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceInquiryResponse {\n");
    
    sb.append("    balanceAvailable: ").append(toIndentedString(balanceAvailable)).append("\n");
    sb.append("    balanceCurrent: ").append(toIndentedString(balanceCurrent)).append("\n");
    sb.append("    balanceOnHold: ").append(toIndentedString(balanceOnHold)).append("\n");
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

