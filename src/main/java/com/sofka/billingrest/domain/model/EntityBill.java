package com.sofka.billingrest.domain.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bill")
public class EntityBill implements Serializable {

	private static final long serialVersionUID = -7311409817957545980L;
	
	@Id
	@NotBlank(message = "no se permiten campos en blancos")
	private String idBillClient;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String nameClient;

	@NotBlank(message = "no se permiten campos en blancos")
	private String companyLeader;

	@NotBlank(message = "no se permiten campos en blancos")
	private String telephoneClient;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String addressClient;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String cityClient;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String currencyToPay;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String descriptionProduct;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String amountHoursWorked;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String discount;
	
	@NotBlank(message = "no se permiten campos en blancos")
	private String fullPayment;

	
	public String getIdBillClient() {

		return idBillClient;
	}

	public void setIdBillClient(String idBillClient) {

		this.idBillClient = idBillClient;
	}


	public String getNameClient() {

		return nameClient;
	}

	public void setNameClient(String nameClient) {

		this.nameClient = nameClient;
	}

	public String getCompanyLeader() {

		return companyLeader;
	}

	public void setCompanyLeader(String companyLeader) {

		this.companyLeader = companyLeader;
	}

	public String getTelephoneClient() {

		return telephoneClient;
	}

	public void setTelephoneClient(String telephoneClient) {

		this.telephoneClient = telephoneClient;
	}

	public String getAddressClient() {

		return addressClient;
	}

	public void setAddressClient(String addressClient) {

		this.addressClient = addressClient;
	}

	public String getCityClient() {

		return cityClient;
	}

	public void setCityClient(String cityclient) {

		this.cityClient = cityclient;
	}

	public String getCurrencyToPay() {

		return currencyToPay;
	}

	public void setCurrencyToPay(String currencyToPay) {

		this.currencyToPay = currencyToPay;
	}

	public String getDescriptionProduct() {

		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {

		this.descriptionProduct = descriptionProduct;
	}

	public String getAmountHoursWorked() {

		return amountHoursWorked;
	}

	public void setAmountHoursWorked(String amountHoursWorked) {

		this.amountHoursWorked = amountHoursWorked;
	}

	public String getDiscount() {

		return discount;
	}

	public void setDiscount(String discount) {

		this.discount = discount;
	}

	public String getFullPayment() {

		return fullPayment;
	}

	public void setFullPayment(String fullPayment) {

		this.fullPayment = fullPayment;
	}


}
