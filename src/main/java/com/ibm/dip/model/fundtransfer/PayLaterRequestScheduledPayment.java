package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.fundtransfer.PayLaterRequestCreditorAccount;
import com.ibm.dip.model.fundtransfer.PayLaterRequestInstructedAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PayLaterRequestScheduledPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class PayLaterRequestScheduledPayment   {
  @JsonProperty("isOneTime")
  private String isOneTime;

  @JsonProperty("frequecny")
  private String frequecny;

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("ScheduledPaymentId")
  private String scheduledPaymentId;

  @JsonProperty("ScheduledPaymentDateTime")
  private OffsetDateTime scheduledPaymentDateTime;

  @JsonProperty("timeSlot")
  private String timeSlot;

  @JsonProperty("ScheduledType")
  private String scheduledType;

  @JsonProperty("InstructedAmount")
  private PayLaterRequestInstructedAmount instructedAmount;

  @JsonProperty("CreditorAccount")
  private PayLaterRequestCreditorAccount creditorAccount;

  public PayLaterRequestScheduledPayment isOneTime(String isOneTime) {
    this.isOneTime = isOneTime;
    return this;
  }

  /**
   * Get isOneTime
   * @return isOneTime
  */
  @ApiModelProperty(value = "")


  public String getIsOneTime() {
    return isOneTime;
  }

  public void setIsOneTime(String isOneTime) {
    this.isOneTime = isOneTime;
  }

  public PayLaterRequestScheduledPayment frequecny(String frequecny) {
    this.frequecny = frequecny;
    return this;
  }

  /**
   * Get frequecny
   * @return frequecny
  */
  @ApiModelProperty(value = "")


  public String getFrequecny() {
    return frequecny;
  }

  public void setFrequecny(String frequecny) {
    this.frequecny = frequecny;
  }

  public PayLaterRequestScheduledPayment accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @ApiModelProperty(value = "")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public PayLaterRequestScheduledPayment scheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

  /**
   * Get scheduledPaymentId
   * @return scheduledPaymentId
  */
  @ApiModelProperty(value = "")


  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public PayLaterRequestScheduledPayment scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

  /**
   * Get scheduledPaymentDateTime
   * @return scheduledPaymentDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public PayLaterRequestScheduledPayment timeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
    return this;
  }

  /**
   * Get timeSlot
   * @return timeSlot
  */
  @ApiModelProperty(value = "")


  public String getTimeSlot() {
    return timeSlot;
  }

  public void setTimeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
  }

  public PayLaterRequestScheduledPayment scheduledType(String scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }

  /**
   * Get scheduledType
   * @return scheduledType
  */
  @ApiModelProperty(value = "")


  public String getScheduledType() {
    return scheduledType;
  }

  public void setScheduledType(String scheduledType) {
    this.scheduledType = scheduledType;
  }

  public PayLaterRequestScheduledPayment instructedAmount(PayLaterRequestInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public PayLaterRequestInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(PayLaterRequestInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PayLaterRequestScheduledPayment creditorAccount(PayLaterRequestCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public PayLaterRequestCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(PayLaterRequestCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayLaterRequestScheduledPayment payLaterRequestScheduledPayment = (PayLaterRequestScheduledPayment) o;
    return Objects.equals(this.isOneTime, payLaterRequestScheduledPayment.isOneTime) &&
        Objects.equals(this.frequecny, payLaterRequestScheduledPayment.frequecny) &&
        Objects.equals(this.accountId, payLaterRequestScheduledPayment.accountId) &&
        Objects.equals(this.scheduledPaymentId, payLaterRequestScheduledPayment.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, payLaterRequestScheduledPayment.scheduledPaymentDateTime) &&
        Objects.equals(this.timeSlot, payLaterRequestScheduledPayment.timeSlot) &&
        Objects.equals(this.scheduledType, payLaterRequestScheduledPayment.scheduledType) &&
        Objects.equals(this.instructedAmount, payLaterRequestScheduledPayment.instructedAmount) &&
        Objects.equals(this.creditorAccount, payLaterRequestScheduledPayment.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOneTime, frequecny, accountId, scheduledPaymentId, scheduledPaymentDateTime, timeSlot, scheduledType, instructedAmount, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayLaterRequestScheduledPayment {\n");
    
    sb.append("    isOneTime: ").append(toIndentedString(isOneTime)).append("\n");
    sb.append("    frequecny: ").append(toIndentedString(frequecny)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

