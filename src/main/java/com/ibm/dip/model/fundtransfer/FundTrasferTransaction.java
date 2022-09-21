package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundTrasferTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class FundTrasferTransaction   {
  @JsonProperty("amount")
  private Integer amount;

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

  public FundTrasferTransaction amount(Integer amount) {
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

  public FundTrasferTransaction dateAndTime(String dateAndTime) {
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

  public FundTrasferTransaction transactionstatus(String transactionstatus) {
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

  public FundTrasferTransaction identifier(String identifier) {
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

  public FundTrasferTransaction communicationFee(Integer communicationFee) {
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

  public FundTrasferTransaction transactionFee(Integer transactionFee) {
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
    FundTrasferTransaction fundTrasferTransaction = (FundTrasferTransaction) o;
    return Objects.equals(this.amount, fundTrasferTransaction.amount) &&
        Objects.equals(this.dateAndTime, fundTrasferTransaction.dateAndTime) &&
        Objects.equals(this.transactionstatus, fundTrasferTransaction.transactionstatus) &&
        Objects.equals(this.identifier, fundTrasferTransaction.identifier) &&
        Objects.equals(this.communicationFee, fundTrasferTransaction.communicationFee) &&
        Objects.equals(this.transactionFee, fundTrasferTransaction.transactionFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, dateAndTime, transactionstatus, identifier, communicationFee, transactionFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundTrasferTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

