package com.invoice.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="INVOICE")
public class lineIterm {
	
	@Id
    @GeneratedValue
	long id;
	
	@Column(name="quantity")
	String quantity;
	
	@Column(name="descrition")
	String descrition;
	
	@Column(name="unitPrice")
	String unitPrice;
	
	public lineIterm() {
		super();
	}
	
	public lineIterm(long id, String quantity, String descrition, String unitPrice) {
		this.id = id;
		this.quantity = quantity;
		this.descrition = descrition;
		this.unitPrice = unitPrice;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
