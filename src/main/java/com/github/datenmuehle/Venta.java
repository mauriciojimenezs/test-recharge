package com.github.datenmuehle;

import jakarta.faces.bean.ManagedBean;

@ManagedBean(name = "sell")
public class Venta {

  public Venta() {
  }

  private String phoneNumber;
  private String fullName;
  private Integer quantity;
  private Double value;

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getFullName() {
    return fullName;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public Double getValue() {
    return value;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public void setValue(Double value) {
    this.value = value;
  }
}
