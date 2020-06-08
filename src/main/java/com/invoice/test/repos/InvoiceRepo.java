package com.invoice.test.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.invoice.test.model.Invoice;

@Repository
public interface InvoiceRepo extends CrudRepository<Invoice, Long>{ 
	
	@Query("select vatRate from Invoice i LIMIT 1")
	long getVat();
	
	long getSubTotal();
	long getTotal();	
}
