package com.invoice.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoice.test.model.Invoice;
import com.invoice.test.repos.*;

@Service
public class invoiceService  implements invoicing{
	
	@Autowired
	InvoiceRepo invoiceRepo;
	
	@Autowired
	lineItermRepo lineItermRepo; 
	
	public Invoice viewInvoice(long id) {
		return invoiceRepo.findById(id).get();
	}
	
	public List<Invoice> viewAllInvoice(){
		return (List<Invoice>) invoiceRepo.findAll();		
		
	}
	
	public int addInvoice(Invoice invoice) {
		if (invoiceRepo.save(invoice) != null) {
			return 1;
		}
		return 0;
	}
	
}
