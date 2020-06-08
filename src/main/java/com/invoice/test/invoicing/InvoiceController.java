package com.invoice.test.invoicing;

import java.net.URI;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.invoice.test.model.Invoice;
import com.invoice.test.services.*;

@RestController
@RequestMapping("/invoices")
public class InvoiceController  implements ErrorController{	
	
	@Autowired
	invoiceService invoiceService; 
	
		
	@GetMapping(path="/viewInvoice/{id}", produces = "application/json")
    public Invoice viewInvoice(@PathVariable int id){
        return invoiceService.viewInvoice(id);
    }
    
    @GetMapping(path= "/viewAllInvoice", produces = "application/json")
    public java.util.List<Invoice> viewAllInvoice(){         
    	return invoiceService.viewAllInvoice();
    }
    
    @PutMapping(path= "/addInvoice", produces = "application/json")
    public int addInvoice(Invoice invoice){
        return invoiceService.addInvoice(invoice);
    }
    
    @Override
    @RequestMapping("/error")
    @ResponseBody
    public String getErrorPath() {
        return "No Mapping Found";
    }
}
