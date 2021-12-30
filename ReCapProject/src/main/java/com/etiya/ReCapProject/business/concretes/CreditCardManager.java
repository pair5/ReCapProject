package com.etiya.ReCapProject.business.concretes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.regex.Pattern;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.CreditCardService;
import com.etiya.ReCapProject.business.constants.Messages;
import com.etiya.ReCapProject.business.requests.creditCardRequests.CreateCreditCardRequest;
import com.etiya.ReCapProject.business.requests.creditCardRequests.DeleteCreditCardRequest;
import com.etiya.ReCapProject.business.requests.creditCardRequests.UpdateCreditCardRequest;
import com.etiya.ReCapProject.core.utilities.business.BusinessRules;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.ErrorResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.CreditCardDao;
import com.etiya.ReCapProject.entities.concretes.CreditCard;

@Service
public class CreditCardManager implements CreditCardService {
	private CreditCardDao creditCardDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public CreditCardManager(CreditCardDao creditCardDao, ModelMapperService modelMapperService) {
		super();
		this.creditCardDao = creditCardDao;
		this.modelMapperService = modelMapperService;
	}
	@Override
	public Result delete(DeleteCreditCardRequest deleteCreditCardRequest) {
		CreditCard creditCard = modelMapperService.forRequest().map(deleteCreditCardRequest, CreditCard.class);
		this.creditCardDao.delete(creditCard);
		return new SuccessResult(Messages.CREDITCARDELETE);
	}

	@Override
	public Result update(UpdateCreditCardRequest updateCreditCardRequest) {
		CreditCard creditCard = modelMapperService.forRequest().map(updateCreditCardRequest, CreditCard.class);
		this.creditCardDao.save(creditCard);
		return new SuccessResult(Messages.CREDITCARDUPDATE);
	}

	@Override
	public Result add(CreateCreditCardRequest createCreditCardRequest) {
		Result result=BusinessRules.run(checkCreditCardNumber(createCreditCardRequest.getCardNumber()),
				checkIfCreditCardNumberExists(createCreditCardRequest.getCardNumber()),
				checkExpirationDateFormat(createCreditCardRequest.getExpirationDate())
		);
		if (result!=null) {
			return result;
		}
		CreditCard creditCard = modelMapperService.forRequest().map(createCreditCardRequest, CreditCard.class); 
		this.creditCardDao.save(creditCard);
		return new SuccessResult(Messages.CREDITCARDADD);
	}
	
	private Result checkCreditCardNumber(String cardNumber) {
		String regex = "((?:(?:\\d{4}[- ]){3}\\d{4}|\\d{16}))(?![\\d])";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(cardNumber);
		if (!matcher.matches()) {
			return new ErrorResult(Messages.CREDITCARDNUMBERERROR);
		}
		return new SuccessResult();
	}
	private Result checkIfCreditCardNumberExists(String cardNumber){
		var result=this.creditCardDao.existsByCardNumber(cardNumber);
		if (result){
			return new ErrorResult(Messages.CREDITCARDALREADYEXISTS);
		}
		return new SuccessResult();
	}

private Result checkExpirationDateFormat(String expirationDate){






/*
		var dateResult = LocalDate.now().toString();
		var dataResultBoolean = dateResult.contains("-");
		if (dataResultBoolean){
			var dateResponse = dateResult.split("/");
			var nowMonth = dateResponse[1];
			var nowYear = dateResponse[0];
			var transformedYear = nowYear.split("",2);
			}
			*/

/*		SimpleDateFormat compareExpirationDate = new SimpleDateFormat("MM/yy");
		System.out.println(sdf.parse(startDate).before(sdf.parse(endDate)));*/

		var result=expirationDate.contains("/");

		if (result){
			var response=expirationDate.split("/");
			String month = response[0];
			String year = response[1];
			int checkMonth = Integer.parseInt(month);
			int checkYear = Integer.parseInt(year);

			if (month.length() !=2 && year.length() != 2) {
				return new ErrorResult(Messages.CREDITCARDDATEERROR);
			}
		}
		return new SuccessResult(Messages.CREDITCARDADD);
	}
}


