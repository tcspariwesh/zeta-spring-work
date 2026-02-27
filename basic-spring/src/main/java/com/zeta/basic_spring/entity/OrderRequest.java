package com.zeta.basic_spring.entity;

import jakarta.validation.constraints.Min;

public class OrderRequest {
	String houseNumber;
	@Min(100000)
	int pin;
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
