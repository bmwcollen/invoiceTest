package com.invoice.test.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.invoice.test.model.lineIterm;

@Repository
public interface lineItermRepo extends CrudRepository<lineIterm, Long>{ 
	
	long getLineItermTotal();
}
