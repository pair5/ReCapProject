package com.etiya.ReCapProject.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.CarMaintenanceService;
import com.etiya.ReCapProject.business.abstracts.RentalService;
import com.etiya.ReCapProject.business.constants.Messages;
import com.etiya.ReCapProject.business.dtos.CarMaintenanceSearchListDto;
import com.etiya.ReCapProject.business.dtos.RentalSearchListDto;
import com.etiya.ReCapProject.business.requests.carMaintenanceRequess.CreateCarMaintenanceRequest;
import com.etiya.ReCapProject.business.requests.carMaintenanceRequess.DeleteCarMaintenanceRequest;
import com.etiya.ReCapProject.business.requests.carMaintenanceRequess.UpdateCarMaintenanceRequest;
import com.etiya.ReCapProject.core.utilities.business.BusinessRules;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.ErrorDataResult;
import com.etiya.ReCapProject.core.utilities.results.ErrorResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessDataResult;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.CarMaintenanceDao;
import com.etiya.ReCapProject.dataAccess.abstracts.RentalDao;
import com.etiya.ReCapProject.entities.concretes.CarMaintenance;
import com.etiya.ReCapProject.entities.concretes.Rental;

@Service
public class CarMaintenanceManager implements CarMaintenanceService {

	private CarMaintenanceDao carMaintenanceDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public CarMaintenanceManager(CarMaintenanceDao carMaintenanceDao, ModelMapperService modelMapperService) {
		super();
		this.carMaintenanceDao = carMaintenanceDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<CarMaintenanceSearchListDto>> getAll() {
		List<CarMaintenance> result = this.carMaintenanceDao.findAll();
		List<CarMaintenanceSearchListDto> response = result.stream().map(
				carMaintenance -> modelMapperService.forDto().map(carMaintenance, CarMaintenanceSearchListDto.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<CarMaintenanceSearchListDto>>(response);
	}

	@Override
	public Result add(CreateCarMaintenanceRequest createCarMaintenanceRequest) {
		Result result = BusinessRules.run();
		if (result != null) {
			return result;
		}
		CarMaintenance carMaintenance = modelMapperService.forRequest().map(createCarMaintenanceRequest,
				CarMaintenance.class);
		this.carMaintenanceDao.save(carMaintenance);
		return new SuccessResult(Messages.CARMAINTENANCEADD);
	}

	@Override
	public Result update(UpdateCarMaintenanceRequest updateCarMaintenanceRequest) {
		CarMaintenance carMaintenance = modelMapperService.forRequest().map(updateCarMaintenanceRequest,
				CarMaintenance.class);
		this.carMaintenanceDao.save(carMaintenance);
		return new SuccessResult(Messages.CARMAINTENANCEUPDATE);

	}

	@Override
	public Result delete(DeleteCarMaintenanceRequest deleteCarMaintenanceRequest) {
		CarMaintenance carMaintenance = this.carMaintenanceDao.getById(deleteCarMaintenanceRequest.getId());
		this.carMaintenanceDao.delete(carMaintenance);
		return new SuccessResult(Messages.CARMAINTENANCEDELETE);
	}

	
//	private Result checkIfCarIsRented() {
//		var result=this.carMaintenanceDao.findByRentalCarId();
//		if (result!=null) {
//			return new ErrorResult(Messages.CARMAINTENANCERENTALERROR);
//		}
//		return new SuccessResult();
//	}

	@Override
	public DataResult<CarMaintenance> getByCar(int carId) {
		var carMaintenance = this.carMaintenanceDao.getByCar_Id(carId);
		if (carMaintenance != null) {
			return new ErrorDataResult("bu araba bakımda değil");
		}
		return new SuccessDataResult<CarMaintenance>(carMaintenance);
	}
}
