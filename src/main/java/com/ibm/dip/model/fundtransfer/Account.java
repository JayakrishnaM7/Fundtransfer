package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * account Number details Response
 */
@ApiModel(description = "account Number details Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class Account   {
  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("accountStatusCode")
  private String accountStatusCode;

  @JsonProperty("accountStatusDescription")
  private String accountStatusDescription;

  @JsonProperty("suspendedIndicator")
  private Boolean suspendedIndicator;

  @JsonProperty("balanceAvailable")
  private Double balanceAvailable;

  @JsonProperty("balanceCurrent")
  private Double balanceCurrent;

  @JsonProperty("balanceOnHold")
  private Integer balanceOnHold;

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Account accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
  */
  @ApiModelProperty(value = "")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Account accountStatusCode(String accountStatusCode) {
    this.accountStatusCode = accountStatusCode;
    return this;
  }

  /**
   * Get accountStatusCode
   * @return accountStatusCode
  */
  @ApiModelProperty(value = "")


  public String getAccountStatusCode() {
    return accountStatusCode;
  }

  public void setAccountStatusCode(String accountStatusCode) {
    this.accountStatusCode = accountStatusCode;
  }

  public Account accountStatusDescription(String accountStatusDescription) {
    this.accountStatusDescription = accountStatusDescription;
    return this;
  }

  /**
   * Get accountStatusDescription
   * @return accountStatusDescription
  */
  @ApiModelProperty(value = "")


  public String getAccountStatusDescription() {
    return accountStatusDescription;
  }

  public void setAccountStatusDescription(String accountStatusDescription) {
    this.accountStatusDescription = accountStatusDescription;
  }

  public Account suspendedIndicator(Boolean suspendedIndicator) {
    this.suspendedIndicator = suspendedIndicator;
    return this;
  }

  /**
   * Get suspendedIndicator
   * @return suspendedIndicator
  */
  @ApiModelProperty(value = "")


  public Boolean getSuspendedIndicator() {
    return suspendedIndicator;
  }

  public void setSuspendedIndicator(Boolean suspendedIndicator) {
    this.suspendedIndicator = suspendedIndicator;
  }

  public Account balanceAvailable(Double balanceAvailable) {
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

  public Account balanceCurrent(Double balanceCurrent) {
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

  public Account balanceOnHold(Integer balanceOnHold) {
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
    Account account = (Account) o;
    return Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.accountName, account.accountName) &&
        Objects.equals(this.accountStatusCode, account.accountStatusCode) &&
        Objects.equals(this.accountStatusDescription, account.accountStatusDescription) &&
        Objects.equals(this.suspendedIndicator, account.suspendedIndicator) &&
        Objects.equals(this.balanceAvailable, account.balanceAvailable) &&
        Objects.equals(this.balanceCurrent, account.balanceCurrent) &&
        Objects.equals(this.balanceOnHold, account.balanceOnHold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accountName, accountStatusCode, accountStatusDescription, suspendedIndicator, balanceAvailable, balanceCurrent, balanceOnHold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatusCode: ").append(toIndentedString(accountStatusCode)).append("\n");
    sb.append("    accountStatusDescription: ").append(toIndentedString(accountStatusDescription)).append("\n");
    sb.append("    suspendedIndicator: ").append(toIndentedString(suspendedIndicator)).append("\n");
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

