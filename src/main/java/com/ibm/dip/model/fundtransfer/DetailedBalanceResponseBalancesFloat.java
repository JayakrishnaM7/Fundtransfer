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
 * DetailedBalanceResponseBalancesFloat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-21T04:30:16.127Z[GMT]")

public class DetailedBalanceResponseBalancesFloat   {
  @JsonProperty("creditLimit")
  private Double creditLimit;

  @JsonProperty("creditLimitExpiryDate")
  private LocalDate creditLimitExpiryDate;

  @JsonProperty("total")
  private Double total;

  @JsonProperty("today")
  private Double today;

  @JsonProperty("yesterday")
  private Double yesterday;

  @JsonProperty("availableNextDay")
  private Double availableNextDay;

  @JsonProperty("yesterdayReleasedIndicator")
  private Boolean yesterdayReleasedIndicator;

  @JsonProperty("availableNextDayReleasedIndicator")
  private Boolean availableNextDayReleasedIndicator;

  public DetailedBalanceResponseBalancesFloat creditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  */
  @ApiModelProperty(value = "")


  public Double getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public DetailedBalanceResponseBalancesFloat creditLimitExpiryDate(LocalDate creditLimitExpiryDate) {
    this.creditLimitExpiryDate = creditLimitExpiryDate;
    return this;
  }

  /**
   * Get creditLimitExpiryDate
   * @return creditLimitExpiryDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreditLimitExpiryDate() {
    return creditLimitExpiryDate;
  }

  public void setCreditLimitExpiryDate(LocalDate creditLimitExpiryDate) {
    this.creditLimitExpiryDate = creditLimitExpiryDate;
  }

  public DetailedBalanceResponseBalancesFloat total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @ApiModelProperty(value = "")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public DetailedBalanceResponseBalancesFloat today(Double today) {
    this.today = today;
    return this;
  }

  /**
   * Get today
   * @return today
  */
  @ApiModelProperty(value = "")


  public Double getToday() {
    return today;
  }

  public void setToday(Double today) {
    this.today = today;
  }

  public DetailedBalanceResponseBalancesFloat yesterday(Double yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  /**
   * Get yesterday
   * @return yesterday
  */
  @ApiModelProperty(value = "")


  public Double getYesterday() {
    return yesterday;
  }

  public void setYesterday(Double yesterday) {
    this.yesterday = yesterday;
  }

  public DetailedBalanceResponseBalancesFloat availableNextDay(Double availableNextDay) {
    this.availableNextDay = availableNextDay;
    return this;
  }

  /**
   * Get availableNextDay
   * @return availableNextDay
  */
  @ApiModelProperty(value = "")


  public Double getAvailableNextDay() {
    return availableNextDay;
  }

  public void setAvailableNextDay(Double availableNextDay) {
    this.availableNextDay = availableNextDay;
  }

  public DetailedBalanceResponseBalancesFloat yesterdayReleasedIndicator(Boolean yesterdayReleasedIndicator) {
    this.yesterdayReleasedIndicator = yesterdayReleasedIndicator;
    return this;
  }

  /**
   * Get yesterdayReleasedIndicator
   * @return yesterdayReleasedIndicator
  */
  @ApiModelProperty(value = "")


  public Boolean getYesterdayReleasedIndicator() {
    return yesterdayReleasedIndicator;
  }

  public void setYesterdayReleasedIndicator(Boolean yesterdayReleasedIndicator) {
    this.yesterdayReleasedIndicator = yesterdayReleasedIndicator;
  }

  public DetailedBalanceResponseBalancesFloat availableNextDayReleasedIndicator(Boolean availableNextDayReleasedIndicator) {
    this.availableNextDayReleasedIndicator = availableNextDayReleasedIndicator;
    return this;
  }

  /**
   * Get availableNextDayReleasedIndicator
   * @return availableNextDayReleasedIndicator
  */
  @ApiModelProperty(value = "")


  public Boolean getAvailableNextDayReleasedIndicator() {
    return availableNextDayReleasedIndicator;
  }

  public void setAvailableNextDayReleasedIndicator(Boolean availableNextDayReleasedIndicator) {
    this.availableNextDayReleasedIndicator = availableNextDayReleasedIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedBalanceResponseBalancesFloat detailedBalanceResponseBalancesFloat = (DetailedBalanceResponseBalancesFloat) o;
    return Objects.equals(this.creditLimit, detailedBalanceResponseBalancesFloat.creditLimit) &&
        Objects.equals(this.creditLimitExpiryDate, detailedBalanceResponseBalancesFloat.creditLimitExpiryDate) &&
        Objects.equals(this.total, detailedBalanceResponseBalancesFloat.total) &&
        Objects.equals(this.today, detailedBalanceResponseBalancesFloat.today) &&
        Objects.equals(this.yesterday, detailedBalanceResponseBalancesFloat.yesterday) &&
        Objects.equals(this.availableNextDay, detailedBalanceResponseBalancesFloat.availableNextDay) &&
        Objects.equals(this.yesterdayReleasedIndicator, detailedBalanceResponseBalancesFloat.yesterdayReleasedIndicator) &&
        Objects.equals(this.availableNextDayReleasedIndicator, detailedBalanceResponseBalancesFloat.availableNextDayReleasedIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, creditLimitExpiryDate, total, today, yesterday, availableNextDay, yesterdayReleasedIndicator, availableNextDayReleasedIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedBalanceResponseBalancesFloat {\n");
    
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    creditLimitExpiryDate: ").append(toIndentedString(creditLimitExpiryDate)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    today: ").append(toIndentedString(today)).append("\n");
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
    sb.append("    availableNextDay: ").append(toIndentedString(availableNextDay)).append("\n");
    sb.append("    yesterdayReleasedIndicator: ").append(toIndentedString(yesterdayReleasedIndicator)).append("\n");
    sb.append("    availableNextDayReleasedIndicator: ").append(toIndentedString(availableNextDayReleasedIndicator)).append("\n");
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

