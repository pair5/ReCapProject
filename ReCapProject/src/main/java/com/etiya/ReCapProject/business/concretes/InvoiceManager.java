package com.etiya.ReCapProject.business.concretes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

import com.etiya.ReCapProject.business.abstracts.CarService;
import com.etiya.ReCapProject.business.abstracts.RentalService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.InvoiceService;
import com.etiya.ReCapProject.business.constants.Messages;
import com.etiya.ReCapProject.business.dtos.InvoiceSearchListDto;
import com.etiya.ReCapProject.business.requests.invoiceRequests.CreateInvoiceRequest;
import com.etiya.ReCapProject.business.requests.invoiceRequests.DeleteInvoiceRequest;
import com.etiya.ReCapProject.business.requests.invoiceRequests.UpdateInvoiceRequest;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessDataResult;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.InvoiceDao;
import com.etiya.ReCapProject.entities.concretes.Invoice;

import javax.xml.crypto.Data;

@Service
public class InvoiceManager implements InvoiceService {
    private InvoiceDao invoiceDao;
    private ModelMapperService modelMapperService;
    private RentalService rentalService;
    private CarService carService;
    @Autowired
    public InvoiceManager(InvoiceDao invoiceDao, ModelMapperService modelMapperService, RentalService rentalService, CarService carService) {
        this.invoiceDao = invoiceDao;
        this.modelMapperService = modelMapperService;
        this.rentalService = rentalService;
        this.carService = carService;
    }


    @Override
    public DataResult<List<InvoiceSearchListDto>> getAll() {
        List<Invoice> invoices = this.invoiceDao.findAll();
        List<InvoiceSearchListDto> invoiceSearchListDtos = invoices.stream()
                .map(invoice -> modelMapperService.forDto().map(invoice, InvoiceSearchListDto.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<InvoiceSearchListDto>>(invoiceSearchListDtos);
    }


    @Override
    public Result add(CreateInvoiceRequest createInvoiceRequest) {
        var rental = this.rentalService.getById(createInvoiceRequest.getRentalId()).getData();
        var car=this.carService.getById(rental.getCar().getId()).getData();
        int totalDay = (int) (ChronoUnit.DAYS.between(rental.getRentDate(), rental.getReturnDate()));
        var totalAmount=car.getDailyPrice()*totalDay;
        var customer=rental.getCustomer().getId();
        createInvoiceRequest.setCustomerId(customer);
        createInvoiceRequest.setRentDate(rental.getRentDate());
        createInvoiceRequest.setReturnDate(rental.getReturnDate());
        createInvoiceRequest.setTotalRentDay(totalDay);
        createInvoiceRequest.setTotalAmount(totalAmount);
        createInvoiceRequest.setCreateDate(LocalDate.now());
        Invoice invoice = modelMapperService.forRequest().map(createInvoiceRequest, Invoice.class);
        this.invoiceDao.save(invoice);
        return new SuccessResult(Messages.INVOICEADD);
    }

    @Override
    public Result delete(DeleteInvoiceRequest deleteInvoiceRequest) {
        Invoice invoice = modelMapperService.forRequest().map(deleteInvoiceRequest, Invoice.class);
        this.invoiceDao.delete(invoice);
        return new SuccessResult(Messages.INVOICEDELETE);
    }

    @Override
    public Result update(UpdateInvoiceRequest updateInvoiceRequest) {
        Invoice invoice = modelMapperService.forRequest().map(updateInvoiceRequest, Invoice.class);
        this.invoiceDao.save(invoice);
        return new SuccessResult(Messages.INVOICEUPDATE);
    }

    @Override
    public DataResult<List<InvoiceSearchListDto>> getByCustomerId(int customerId) {

        List<Invoice> invoices = this.invoiceDao.getByCustomer_Id(customerId);
        List<InvoiceSearchListDto> invoiceSearchListDtos = invoices.stream()
                .map(invoice -> modelMapperService.forDto().map(invoice, InvoiceSearchListDto.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<InvoiceSearchListDto>>(invoiceSearchListDtos);
    }

    @Override
    public DataResult<List<InvoiceSearchListDto>> getByCreateDateBetweenBeginDateAndEndDate(LocalDate beginDate, LocalDate endDate) {
        List<Invoice> invoices = this.invoiceDao.getByCreateDateBetween(beginDate, endDate);
        List<InvoiceSearchListDto> invoiceSearchListDtos = invoices.stream()
                .map(invoice -> modelMapperService.forDto().map(invoice, InvoiceSearchListDto.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<InvoiceSearchListDto>>(invoiceSearchListDtos);
    }
}
