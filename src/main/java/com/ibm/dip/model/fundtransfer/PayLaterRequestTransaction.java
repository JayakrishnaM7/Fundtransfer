package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PayLaterRequestTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class PayLaterRequestTransaction   {
  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("blockFundNow")
  private String blockFundNow;

  @JsonProperty("dateAndTime")
  private String dateAndTime;

  @JsonProperty("transactionstatus")
  private String transactionstatus;

  @JsonProperty("identifier")
  private String identifier;

  @JsonProperty("communicationFee")
  private Integer communicationFee;

  @JsonProperty("transactionFee")
  private Integer transactionFee;

  public PayLaterRequestTransaction amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PayLaterRequestTransaction blockFundNow(String blockFundNow) {
    this.blockFundNow = blockFundNow;
    return this;
  }

  /**
   * Get blockFundNow
   * @return blockFundNow
  */
  @ApiModelProperty(value = "")


  public String getBlockFundNow() {
    return blockFundNow;
  }

  public void setBlockFundNow(String blockFundNow) {
    this.blockFundNow = blockFundNow;
  }

  public PayLaterRequestTransaction dateAndTime(String dateAndTime) {
    this.dateAndTime = dateAndTime;
    return this;
  }

  /**
   * Get dateAndTime
   * @return dateAndTime
  */
  @ApiModelProperty(value = "")


  public String getDateAndTime() {
    return dateAndTime;
  }

  public void setDateAndTime(String dateAndTime) {
    this.dateAndTime = dateAndTime;
  }

  public PayLaterRequestTransaction transactionstatus(String transactionstatus) {
    this.transactionstatus = transactionstatus;
    return this;
  }

  /**
   * Get transactionstatus
   * @return transactionstatus
  */
  @ApiModelProperty(value = "")


  public String getTransactionstatus() {
    return transactionstatus;
  }

  public void setTransactionstatus(String transactionstatus) {
    this.transactionstatus = transactionstatus;
  }

  public PayLaterRequestTransaction identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  */
  @ApiModelProperty(value = "")


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public PayLaterRequestTransaction communicationFee(Integer communicationFee) {
    this.communicationFee = communicationFee;
    return this;
  }

  /**
   * Get communicationFee
   * @return communicationFee
  */
  @ApiModelProperty(value = "")


  public Integer getCommunicationFee() {
    return communicationFee;
  }

  public void setCommunicationFee(Integer communicationFee) {
    this.communicationFee = communicationFee;
  }

  public PayLaterRequestTransaction transactionFee(Integer transactionFee) {
    this.transactionFee = transactionFee;
    return this;
  }

  /**
   * Get transactionFee
   * @return transactionFee
  */
  @ApiModelProperty(value = "")


  public Integer getTransactionFee() {
    return transactionFee;
  }

  public void setTransactionFee(Integer transactionFee) {
    this.transactionFee = transactionFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayLaterRequestTransaction payLaterRequestTransaction = (PayLaterRequestTransaction) o;
    return Objects.equals(this.amount, payLaterRequestTransaction.amount) &&
        Objects.equals(this.blockFundNow, payLaterRequestTransaction.blockFundNow) &&
        Objects.equals(this.dateAndTime, payLaterRequestTransaction.dateAndTime) &&
        Objects.equals(this.transactionstatus, payLaterRequestTransaction.transactionstatus) &&
        Objects.equals(this.identifier, payLaterRequestTransaction.identifier) &&
        Objects.equals(this.communicationFee, payLaterRequestTransaction.communicationFee) &&
        Objects.equals(this.transactionFee, payLaterRequestTransaction.transactionFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, blockFundNow, dateAndTime, transactionstatus, identifier, communicationFee, transactionFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayLaterRequestTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    blockFundNow: ").append(toIndentedString(blockFundNow)).append("\n");
    sb.append("    dateAndTime: ").append(toIndentedString(dateAndTime)).append("\n");
    sb.append("    transactionstatus: ").append(toIndentedString(transactionstatus)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    communicationFee: ").append(toIndentedString(communicationFee)).append("\n");
    sb.append("    transactionFee: ").append(toIndentedString(transactionFee)).append("\n");
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

