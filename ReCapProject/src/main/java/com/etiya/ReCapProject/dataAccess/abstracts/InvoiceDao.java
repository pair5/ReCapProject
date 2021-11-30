package com.etiya.ReCapProject.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.ReCapProject.entities.concretes.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Integer>{

}
