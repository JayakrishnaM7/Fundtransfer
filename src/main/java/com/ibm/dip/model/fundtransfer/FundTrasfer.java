package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.fundtransfer.FundTrasferAccountFrom;
import com.ibm.dip.model.fundtransfer.FundTrasferAccountTo;
import com.ibm.dip.model.fundtransfer.FundTrasferDebitAuthorization;
import com.ibm.dip.model.fundtransfer.FundTrasferTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fund Transfer
 */
@ApiModel(description = "Fund Transfer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class FundTrasfer   {
  @JsonProperty("amountDirectionCode")
  private String amountDirectionCode;

  @JsonProperty("transactionCode")
  private String transactionCode;

  @JsonProperty("transactionMode")
  private String transactionMode;

  @JsonProperty("annotation")
  private String annotation;

  @JsonProperty("isPayNow")
  private Boolean isPayNow;

  @JsonProperty("accountFrom")
  private FundTrasferAccountFrom accountFrom;

  @JsonProperty("accountTo")
  private FundTrasferAccountTo accountTo;

  @JsonProperty("transaction")
  private FundTrasferTransaction transaction;

  @JsonProperty("remarks")
  private String remarks;

  @JsonProperty("debitAuthorization")
  private FundTrasferDebitAuthorization debitAuthorization;

  public FundTrasfer amountDirectionCode(String amountDirectionCode) {
    this.amountDirectionCode = amountDirectionCode;
    return this;
  }

  /**
   * Get amountDirectionCode
   * @return amountDirectionCode
  */
  @ApiModelProperty(value = "")


  public String getAmountDirectionCode() {
    return amountDirectionCode;
  }

  public void setAmountDirectionCode(String amountDirectionCode) {
    this.amountDirectionCode = amountDirectionCode;
  }

  public FundTrasfer transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

  /**
   * Get transactionCode
   * @return transactionCode
  */
  @ApiModelProperty(value = "")


  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }

  public FundTrasfer transactionMode(String transactionMode) {
    this.transactionMode = transactionMode;
    return this;
  }

  /**
   * Get transactionMode
   * @return transactionMode
  */
  @ApiModelProperty(value = "")


  public String getTransactionMode() {
    return transactionMode;
  }

  public void setTransactionMode(String transactionMode) {
    this.transactionMode = transactionMode;
  }

  public FundTrasfer annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * Get annotation
   * @return annotation
  */
  @ApiModelProperty(value = "")


  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }

  public FundTrasfer isPayNow(Boolean isPayNow) {
    this.isPayNow = isPayNow;
    return this;
  }

  /**
   * Get isPayNow
   * @return isPayNow
  */
  @ApiModelProperty(value = "")


  public Boolean getIsPayNow() {
    return isPayNow;
  }

  public void setIsPayNow(Boolean isPayNow) {
    this.isPayNow = isPayNow;
  }

  public FundTrasfer accountFrom(FundTrasferAccountFrom accountFrom) {
    this.accountFrom = accountFrom;
    return this;
  }

  /**
   * Get accountFrom
   * @return accountFrom
  */
  @ApiModelProperty(value = "")

  @Valid

  public FundTrasferAccountFrom getAccountFrom() {
    return accountFrom;
  }

  public void setAccountFrom(FundTrasferAccountFrom accountFrom) {
    this.accountFrom = accountFrom;
  }

  public FundTrasfer accountTo(FundTrasferAccountTo accountTo) {
    this.accountTo = accountTo;
    return this;
  }

  /**
   * Get accountTo
   * @return accountTo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FundTrasferAccountTo getAccountTo() {
    return accountTo;
  }

  public void setAccountTo(FundTrasferAccountTo accountTo) {
    this.accountTo = accountTo;
  }

  public FundTrasfer transaction(FundTrasferTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public FundTrasferTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(FundTrasferTransaction transaction) {
    this.transaction = transaction;
  }

  public FundTrasfer remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  */
  @ApiModelProperty(value = "")


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public FundTrasfer debitAuthorization(FundTrasferDebitAuthorization debitAuthorization) {
    this.debitAuthorization = debitAuthorization;
    return this;
  }

  /**
   * Get debitAuthorization
   * @return debitAuthorization
  */
  @ApiModelProperty(value = "")

  @Valid

  public FundTrasferDebitAuthorization getDebitAuthorization() {
    return debitAuthorization;
  }

  public void setDebitAuthorization(FundTrasferDebitAuthorization debitAuthorization) {
    this.debitAuthorization = debitAuthorization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundTrasfer fundTrasfer = (FundTrasfer) o;
    return Objects.equals(this.amountDirectionCode, fundTrasfer.amountDirectionCode) &&
        Objects.equals(this.transactionCode, fundTrasfer.transactionCode) &&
        Objects.equals(this.transactionMode, fundTrasfer.transactionMode) &&
        Objects.equals(this.annotation, fundTrasfer.annotation) &&
        Objects.equals(this.isPayNow, fundTrasfer.isPayNow) &&
        Objects.equals(this.accountFrom, fundTrasfer.accountFrom) &&
        Objects.equals(this.accountTo, fundTrasfer.accountTo) &&
        Objects.equals(this.transaction, fundTrasfer.transaction) &&
        Objects.equals(this.remarks, fundTrasfer.remarks) &&
        Objects.equals(this.debitAuthorization, fundTrasfer.debitAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDirectionCode, transactionCode, transactionMode, annotation, isPayNow, accountFrom, accountTo, transaction, remarks, debitAuthorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundTrasfer {\n");
    
    sb.append("    amountDirectionCode: ").append(toIndentedString(amountDirectionCode)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transactionMode: ").append(toIndentedString(transactionMode)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    isPayNow: ").append(toIndentedString(isPayNow)).append("\n");
    sb.append("    accountFrom: ").append(toIndentedString(accountFrom)).append("\n");
    sb.append("    accountTo: ").append(toIndentedString(accountTo)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    debitAuthorization: ").append(toIndentedString(debitAuthorization)).append("\n");
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

