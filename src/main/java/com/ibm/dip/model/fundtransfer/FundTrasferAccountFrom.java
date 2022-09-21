package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundTrasferAccountFrom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class FundTrasferAccountFrom   {
  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("bankLogo")
  private String bankLogo;

  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("mobileNumber")
  private String mobileNumber;

  public FundTrasferAccountFrom accountName(String accountName) {
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

  public FundTrasferAccountFrom accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public FundTrasferAccountFrom bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
  */
  @ApiModelProperty(value = "")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public FundTrasferAccountFrom bankLogo(String bankLogo) {
    this.bankLogo = bankLogo;
    return this;
  }

  /**
   * Get bankLogo
   * @return bankLogo
  */
  @ApiModelProperty(value = "")


  public String getBankLogo() {
    return bankLogo;
  }

  public void setBankLogo(String bankLogo) {
    this.bankLogo = bankLogo;
  }

  public FundTrasferAccountFrom accountType(String accountType) {
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

  public FundTrasferAccountFrom mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
  */
  @ApiModelProperty(value = "")


  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundTrasferAccountFrom fundTrasferAccountFrom = (FundTrasferAccountFrom) o;
    return Objects.equals(this.accountName, fundTrasferAccountFrom.accountName) &&
        Objects.equals(this.accountNumber, fundTrasferAccountFrom.accountNumber) &&
        Objects.equals(this.bankName, fundTrasferAccountFrom.bankName) &&
        Objects.equals(this.bankLogo, fundTrasferAccountFrom.bankLogo) &&
        Objects.equals(this.accountType, fundTrasferAccountFrom.accountType) &&
        Objects.equals(this.mobileNumber, fundTrasferAccountFrom.mobileNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountNumber, bankName, bankLogo, accountType, mobileNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundTrasferAccountFrom {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankLogo: ").append(toIndentedString(bankLogo)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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

