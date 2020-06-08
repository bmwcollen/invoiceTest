package com.invoice.test.services;

import java.util.List;

import com.invoice.test.model.Invoice;

public interface invoicing {
	
	public Invoice viewInvoice(long id) ;
	
	public List<Invoice> viewAllInvoice();
	
	public int addInvoice(Invoice invoice); 
}
