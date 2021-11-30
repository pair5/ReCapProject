package com.etiya.ReCapProject.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.ReCapProject.business.dtos.InvoiceSearchListDto;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.entities.concretes.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Integer>{
	
	List<InvoiceSearchListDto> getByCustomer_Id(int id);

}
