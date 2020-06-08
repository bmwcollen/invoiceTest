package com.invoice.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.*;
import javax.persistence.*;

@Entity
@Table(name="Invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	long id;
	
	@Column(name="client")
	String client;
	
	@Column(name="vatRate")
	String vatRate;
	
	@Column(name="invoiceDate")
	String invoiceDate;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getVatRate() {
		return vatRate;
	}

	public void setVatRate(String vatRate) {
		this.vatRate = vatRate;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	@Override
    public String toString() {
        return String.format("Student [id=%s, client=%s, vatRate=%s, invoiveDate=%s]", id, client, vatRate, invoiceDate);
    }

}
