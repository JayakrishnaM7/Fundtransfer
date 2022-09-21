package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.fundtransfer.DetailedBalanceResponseBalancesFloat;
import com.ibm.dip.model.fundtransfer.DetailedBalanceResponseInterests;
import com.ibm.dip.model.fundtransfer.DetailedBalanceResponseOverDrafts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Detailed Balance Response
 */
@ApiModel(description = "Detailed Balance Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class DetailedBalanceResponse   {
  @JsonProperty("accountType")
  private String accountType;

  @JsonProperty("accountShortName")
  private String accountShortName;

  @JsonProperty("balancesFloat")
  private DetailedBalanceResponseBalancesFloat balancesFloat;

  @JsonProperty("interests")
  private DetailedBalanceResponseInterests interests;

  @JsonProperty("accruedInterestDate")
  private LocalDate accruedInterestDate;

  @JsonProperty("overDrafts")
  private DetailedBalanceResponseOverDrafts overDrafts;

  @JsonProperty("backDateDebit")
  private Double backDateDebit;

  @JsonProperty("backDateCredit")
  private Double backDateCredit;

  @JsonProperty("otherDebit")
  private Double otherDebit;

  @JsonProperty("otherCredit")
  private Double otherCredit;

  @JsonProperty("customerLastActivityDate")
  private LocalDate customerLastActivityDate;

  @JsonProperty("suspendedDebitOperationsIndicator")
  private Boolean suspendedDebitOperationsIndicator;

  @JsonProperty("suspendedCreditOperationsIndicator")
  private Boolean suspendedCreditOperationsIndicator;

  public DetailedBalanceResponse accountType(String accountType) {
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

  public DetailedBalanceResponse accountShortName(String accountShortName) {
    this.accountShortName = accountShortName;
    return this;
  }

  /**
   * Get accountShortName
   * @return accountShortName
  */
  @ApiModelProperty(value = "")


  public String getAccountShortName() {
    return accountShortName;
  }

  public void setAccountShortName(String accountShortName) {
    this.accountShortName = accountShortName;
  }

  public DetailedBalanceResponse balancesFloat(DetailedBalanceResponseBalancesFloat balancesFloat) {
    this.balancesFloat = balancesFloat;
    return this;
  }

  /**
   * Get balancesFloat
   * @return balancesFloat
  */
  @ApiModelProperty(value = "")

  @Valid

  public DetailedBalanceResponseBalancesFloat getBalancesFloat() {
    return balancesFloat;
  }

  public void setBalancesFloat(DetailedBalanceResponseBalancesFloat balancesFloat) {
    this.balancesFloat = balancesFloat;
  }

  public DetailedBalanceResponse interests(DetailedBalanceResponseInterests interests) {
    this.interests = interests;
    return this;
  }

  /**
   * Get interests
   * @return interests
  */
  @ApiModelProperty(value = "")

  @Valid

  public DetailedBalanceResponseInterests getInterests() {
    return interests;
  }

  public void setInterests(DetailedBalanceResponseInterests interests) {
    this.interests = interests;
  }

  public DetailedBalanceResponse accruedInterestDate(LocalDate accruedInterestDate) {
    this.accruedInterestDate = accruedInterestDate;
    return this;
  }

  /**
   * Get accruedInterestDate
   * @return accruedInterestDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getAccruedInterestDate() {
    return accruedInterestDate;
  }

  public void setAccruedInterestDate(LocalDate accruedInterestDate) {
    this.accruedInterestDate = accruedInterestDate;
  }

  public DetailedBalanceResponse overDrafts(DetailedBalanceResponseOverDrafts overDrafts) {
    this.overDrafts = overDrafts;
    return this;
  }

  /**
   * Get overDrafts
   * @return overDrafts
  */
  @ApiModelProperty(value = "")

  @Valid

  public DetailedBalanceResponseOverDrafts getOverDrafts() {
    return overDrafts;
  }

  public void setOverDrafts(DetailedBalanceResponseOverDrafts overDrafts) {
    this.overDrafts = overDrafts;
  }

  public DetailedBalanceResponse backDateDebit(Double backDateDebit) {
    this.backDateDebit = backDateDebit;
    return this;
  }

  /**
   * Get backDateDebit
   * @return backDateDebit
  */
  @ApiModelProperty(value = "")


  public Double getBackDateDebit() {
    return backDateDebit;
  }

  public void setBackDateDebit(Double backDateDebit) {
    this.backDateDebit = backDateDebit;
  }

  public DetailedBalanceResponse backDateCredit(Double backDateCredit) {
    this.backDateCredit = backDateCredit;
    return this;
  }

  /**
   * Get backDateCredit
   * @return backDateCredit
  */
  @ApiModelProperty(value = "")


  public Double getBackDateCredit() {
    return backDateCredit;
  }

  public void setBackDateCredit(Double backDateCredit) {
    this.backDateCredit = backDateCredit;
  }

  public DetailedBalanceResponse otherDebit(Double otherDebit) {
    this.otherDebit = otherDebit;
    return this;
  }

  /**
   * Get otherDebit
   * @return otherDebit
  */
  @ApiModelProperty(value = "")


  public Double getOtherDebit() {
    return otherDebit;
  }

  public void setOtherDebit(Double otherDebit) {
    this.otherDebit = otherDebit;
  }

  public DetailedBalanceResponse otherCredit(Double otherCredit) {
    this.otherCredit = otherCredit;
    return this;
  }

  /**
   * Get otherCredit
   * @return otherCredit
  */
  @ApiModelProperty(value = "")


  public Double getOtherCredit() {
    return otherCredit;
  }

  public void setOtherCredit(Double otherCredit) {
    this.otherCredit = otherCredit;
  }

  public DetailedBalanceResponse customerLastActivityDate(LocalDate customerLastActivityDate) {
    this.customerLastActivityDate = customerLastActivityDate;
    return this;
  }

  /**
   * Get customerLastActivityDate
   * @return customerLastActivityDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCustomerLastActivityDate() {
    return customerLastActivityDate;
  }

  public void setCustomerLastActivityDate(LocalDate customerLastActivityDate) {
    this.customerLastActivityDate = customerLastActivityDate;
  }

  public DetailedBalanceResponse suspendedDebitOperationsIndicator(Boolean suspendedDebitOperationsIndicator) {
    this.suspendedDebitOperationsIndicator = suspendedDebitOperationsIndicator;
    return this;
  }

  /**
   * Get suspendedDebitOperationsIndicator
   * @return suspendedDebitOperationsIndicator
  */
  @ApiModelProperty(value = "")


  public Boolean getSuspendedDebitOperationsIndicator() {
    return suspendedDebitOperationsIndicator;
  }

  public void setSuspendedDebitOperationsIndicator(Boolean suspendedDebitOperationsIndicator) {
    this.suspendedDebitOperationsIndicator = suspendedDebitOperationsIndicator;
  }

  public DetailedBalanceResponse suspendedCreditOperationsIndicator(Boolean suspendedCreditOperationsIndicator) {
    this.suspendedCreditOperationsIndicator = suspendedCreditOperationsIndicator;
    return this;
  }

  /**
   * Get suspendedCreditOperationsIndicator
   * @return suspendedCreditOperationsIndicator
  */
  @ApiModelProperty(value = "")


  public Boolean getSuspendedCreditOperationsIndicator() {
    return suspendedCreditOperationsIndicator;
  }

  public void setSuspendedCreditOperationsIndicator(Boolean suspendedCreditOperationsIndicator) {
    this.suspendedCreditOperationsIndicator = suspendedCreditOperationsIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedBalanceResponse detailedBalanceResponse = (DetailedBalanceResponse) o;
    return Objects.equals(this.accountType, detailedBalanceResponse.accountType) &&
        Objects.equals(this.accountShortName, detailedBalanceResponse.accountShortName) &&
        Objects.equals(this.balancesFloat, detailedBalanceResponse.balancesFloat) &&
        Objects.equals(this.interests, detailedBalanceResponse.interests) &&
        Objects.equals(this.accruedInterestDate, detailedBalanceResponse.accruedInterestDate) &&
        Objects.equals(this.overDrafts, detailedBalanceResponse.overDrafts) &&
        Objects.equals(this.backDateDebit, detailedBalanceResponse.backDateDebit) &&
        Objects.equals(this.backDateCredit, detailedBalanceResponse.backDateCredit) &&
        Objects.equals(this.otherDebit, detailedBalanceResponse.otherDebit) &&
        Objects.equals(this.otherCredit, detailedBalanceResponse.otherCredit) &&
        Objects.equals(this.customerLastActivityDate, detailedBalanceResponse.customerLastActivityDate) &&
        Objects.equals(this.suspendedDebitOperationsIndicator, detailedBalanceResponse.suspendedDebitOperationsIndicator) &&
        Objects.equals(this.suspendedCreditOperationsIndicator, detailedBalanceResponse.suspendedCreditOperationsIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accountShortName, balancesFloat, interests, accruedInterestDate, overDrafts, backDateDebit, backDateCredit, otherDebit, otherCredit, customerLastActivityDate, suspendedDebitOperationsIndicator, suspendedCreditOperationsIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedBalanceResponse {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountShortName: ").append(toIndentedString(accountShortName)).append("\n");
    sb.append("    balancesFloat: ").append(toIndentedString(balancesFloat)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    accruedInterestDate: ").append(toIndentedString(accruedInterestDate)).append("\n");
    sb.append("    overDrafts: ").append(toIndentedString(overDrafts)).append("\n");
    sb.append("    backDateDebit: ").append(toIndentedString(backDateDebit)).append("\n");
    sb.append("    backDateCredit: ").append(toIndentedString(backDateCredit)).append("\n");
    sb.append("    otherDebit: ").append(toIndentedString(otherDebit)).append("\n");
    sb.append("    otherCredit: ").append(toIndentedString(otherCredit)).append("\n");
    sb.append("    customerLastActivityDate: ").append(toIndentedString(customerLastActivityDate)).append("\n");
    sb.append("    suspendedDebitOperationsIndicator: ").append(toIndentedString(suspendedDebitOperationsIndicator)).append("\n");
    sb.append("    suspendedCreditOperationsIndicator: ").append(toIndentedString(suspendedCreditOperationsIndicator)).append("\n");
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

