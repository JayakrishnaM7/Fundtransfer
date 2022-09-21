package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.fundtransfer.FundTrasferAccountFrom;
import com.ibm.dip.model.fundtransfer.FundTrasferAccountTo;
import com.ibm.dip.model.fundtransfer.FundTrasferDebitAuthorization;
import com.ibm.dip.model.fundtransfer.PayLaterRequestScheduledPayment;
import com.ibm.dip.model.fundtransfer.PayLaterRequestTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * pay later Request
 */
@ApiModel(description = "pay later Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class PayLaterRequest   {
  @JsonProperty("amountDirectionCode")
  private String amountDirectionCode;

  @JsonProperty("transactionCode")
  private String transactionCode;

  @JsonProperty("transactionMode")
  private String transactionMode;

  @JsonProperty("annotation")
  private String annotation;

  @JsonProperty("accountFrom")
  private FundTrasferAccountFrom accountFrom;

  @JsonProperty("accountTo")
  private FundTrasferAccountTo accountTo;

  @JsonProperty("transaction")
  private PayLaterRequestTransaction transaction;

  @JsonProperty("remarks")
  private String remarks;

  @JsonProperty("isPayLater")
  private Boolean isPayLater;

  @JsonProperty("ScheduledPayment")
  @Valid
  private List<PayLaterRequestScheduledPayment> scheduledPayment = null;

  @JsonProperty("fundTransferId")
  private String fundTransferId;

  @JsonProperty("debitAuthorization")
  private FundTrasferDebitAuthorization debitAuthorization;

  public PayLaterRequest amountDirectionCode(String amountDirectionCode) {
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

  public PayLaterRequest transactionCode(String transactionCode) {
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

  public PayLaterRequest transactionMode(String transactionMode) {
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

  public PayLaterRequest annotation(String annotation) {
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

  public PayLaterRequest accountFrom(FundTrasferAccountFrom accountFrom) {
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

  public PayLaterRequest accountTo(FundTrasferAccountTo accountTo) {
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

  public PayLaterRequest transaction(PayLaterRequestTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public PayLaterRequestTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(PayLaterRequestTransaction transaction) {
    this.transaction = transaction;
  }

  public PayLaterRequest remarks(String remarks) {
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

  public PayLaterRequest isPayLater(Boolean isPayLater) {
    this.isPayLater = isPayLater;
    return this;
  }

  /**
   * Get isPayLater
   * @return isPayLater
  */
  @ApiModelProperty(value = "")


  public Boolean getIsPayLater() {
    return isPayLater;
  }

  public void setIsPayLater(Boolean isPayLater) {
    this.isPayLater = isPayLater;
  }

  public PayLaterRequest scheduledPayment(List<PayLaterRequestScheduledPayment> scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
    return this;
  }

  public PayLaterRequest addScheduledPaymentItem(PayLaterRequestScheduledPayment scheduledPaymentItem) {
    if (this.scheduledPayment == null) {
      this.scheduledPayment = new ArrayList<>();
    }
    this.scheduledPayment.add(scheduledPaymentItem);
    return this;
  }

  /**
   * Get scheduledPayment
   * @return scheduledPayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PayLaterRequestScheduledPayment> getScheduledPayment() {
    return scheduledPayment;
  }

  public void setScheduledPayment(List<PayLaterRequestScheduledPayment> scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
  }

  public PayLaterRequest fundTransferId(String fundTransferId) {
    this.fundTransferId = fundTransferId;
    return this;
  }

  /**
   * Get fundTransferId
   * @return fundTransferId
  */
  @ApiModelProperty(value = "")


  public String getFundTransferId() {
    return fundTransferId;
  }

  public void setFundTransferId(String fundTransferId) {
    this.fundTransferId = fundTransferId;
  }

  public PayLaterRequest debitAuthorization(FundTrasferDebitAuthorization debitAuthorization) {
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
    PayLaterRequest payLaterRequest = (PayLaterRequest) o;
    return Objects.equals(this.amountDirectionCode, payLaterRequest.amountDirectionCode) &&
        Objects.equals(this.transactionCode, payLaterRequest.transactionCode) &&
        Objects.equals(this.transactionMode, payLaterRequest.transactionMode) &&
        Objects.equals(this.annotation, payLaterRequest.annotation) &&
        Objects.equals(this.accountFrom, payLaterRequest.accountFrom) &&
        Objects.equals(this.accountTo, payLaterRequest.accountTo) &&
        Objects.equals(this.transaction, payLaterRequest.transaction) &&
        Objects.equals(this.remarks, payLaterRequest.remarks) &&
        Objects.equals(this.isPayLater, payLaterRequest.isPayLater) &&
        Objects.equals(this.scheduledPayment, payLaterRequest.scheduledPayment) &&
        Objects.equals(this.fundTransferId, payLaterRequest.fundTransferId) &&
        Objects.equals(this.debitAuthorization, payLaterRequest.debitAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDirectionCode, transactionCode, transactionMode, annotation, accountFrom, accountTo, transaction, remarks, isPayLater, scheduledPayment, fundTransferId, debitAuthorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayLaterRequest {\n");
    
    sb.append("    amountDirectionCode: ").append(toIndentedString(amountDirectionCode)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transactionMode: ").append(toIndentedString(transactionMode)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    accountFrom: ").append(toIndentedString(accountFrom)).append("\n");
    sb.append("    accountTo: ").append(toIndentedString(accountTo)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    isPayLater: ").append(toIndentedString(isPayLater)).append("\n");
    sb.append("    scheduledPayment: ").append(toIndentedString(scheduledPayment)).append("\n");
    sb.append("    fundTransferId: ").append(toIndentedString(fundTransferId)).append("\n");
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

