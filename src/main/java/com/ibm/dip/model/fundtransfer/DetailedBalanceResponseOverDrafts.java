package com.ibm.dip.model.fundtransfer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedBalanceResponseOverDrafts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class DetailedBalanceResponseOverDrafts   {
  @JsonProperty("overdraftLimitTotal")
  private Double overdraftLimitTotal;

  @JsonProperty("overdraftLimit")
  private Double overdraftLimit;

  @JsonProperty("overdraftDueDate")
  private LocalDate overdraftDueDate;

  @JsonProperty("temporaryOverdraftLimit")
  private Double temporaryOverdraftLimit;

  @JsonProperty("temporaryOverdraftDueDate")
  private LocalDate temporaryOverdraftDueDate;

  public DetailedBalanceResponseOverDrafts overdraftLimitTotal(Double overdraftLimitTotal) {
    this.overdraftLimitTotal = overdraftLimitTotal;
    return this;
  }

  /**
   * Get overdraftLimitTotal
   * @return overdraftLimitTotal
  */
  @ApiModelProperty(value = "")


  public Double getOverdraftLimitTotal() {
    return overdraftLimitTotal;
  }

  public void setOverdraftLimitTotal(Double overdraftLimitTotal) {
    this.overdraftLimitTotal = overdraftLimitTotal;
  }

  public DetailedBalanceResponseOverDrafts overdraftLimit(Double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
    return this;
  }

  /**
   * Get overdraftLimit
   * @return overdraftLimit
  */
  @ApiModelProperty(value = "")


  public Double getOverdraftLimit() {
    return overdraftLimit;
  }

  public void setOverdraftLimit(Double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  public DetailedBalanceResponseOverDrafts overdraftDueDate(LocalDate overdraftDueDate) {
    this.overdraftDueDate = overdraftDueDate;
    return this;
  }

  /**
   * Get overdraftDueDate
   * @return overdraftDueDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getOverdraftDueDate() {
    return overdraftDueDate;
  }

  public void setOverdraftDueDate(LocalDate overdraftDueDate) {
    this.overdraftDueDate = overdraftDueDate;
  }

  public DetailedBalanceResponseOverDrafts temporaryOverdraftLimit(Double temporaryOverdraftLimit) {
    this.temporaryOverdraftLimit = temporaryOverdraftLimit;
    return this;
  }

  /**
   * Get temporaryOverdraftLimit
   * @return temporaryOverdraftLimit
  */
  @ApiModelProperty(value = "")


  public Double getTemporaryOverdraftLimit() {
    return temporaryOverdraftLimit;
  }

  public void setTemporaryOverdraftLimit(Double temporaryOverdraftLimit) {
    this.temporaryOverdraftLimit = temporaryOverdraftLimit;
  }

  public DetailedBalanceResponseOverDrafts temporaryOverdraftDueDate(LocalDate temporaryOverdraftDueDate) {
    this.temporaryOverdraftDueDate = temporaryOverdraftDueDate;
    return this;
  }

  /**
   * Get temporaryOverdraftDueDate
   * @return temporaryOverdraftDueDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getTemporaryOverdraftDueDate() {
    return temporaryOverdraftDueDate;
  }

  public void setTemporaryOverdraftDueDate(LocalDate temporaryOverdraftDueDate) {
    this.temporaryOverdraftDueDate = temporaryOverdraftDueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedBalanceResponseOverDrafts detailedBalanceResponseOverDrafts = (DetailedBalanceResponseOverDrafts) o;
    return Objects.equals(this.overdraftLimitTotal, detailedBalanceResponseOverDrafts.overdraftLimitTotal) &&
        Objects.equals(this.overdraftLimit, detailedBalanceResponseOverDrafts.overdraftLimit) &&
        Objects.equals(this.overdraftDueDate, detailedBalanceResponseOverDrafts.overdraftDueDate) &&
        Objects.equals(this.temporaryOverdraftLimit, detailedBalanceResponseOverDrafts.temporaryOverdraftLimit) &&
        Objects.equals(this.temporaryOverdraftDueDate, detailedBalanceResponseOverDrafts.temporaryOverdraftDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftLimitTotal, overdraftLimit, overdraftDueDate, temporaryOverdraftLimit, temporaryOverdraftDueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedBalanceResponseOverDrafts {\n");
    
    sb.append("    overdraftLimitTotal: ").append(toIndentedString(overdraftLimitTotal)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
    sb.append("    overdraftDueDate: ").append(toIndentedString(overdraftDueDate)).append("\n");
    sb.append("    temporaryOverdraftLimit: ").append(toIndentedString(temporaryOverdraftLimit)).append("\n");
    sb.append("    temporaryOverdraftDueDate: ").append(toIndentedString(temporaryOverdraftDueDate)).append("\n");
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

