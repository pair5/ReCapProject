package com.etiya.ReCapProject.business.concretes;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.CarService;
import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import com.etiya.ReCapProject.business.requests.carRequests.CreateCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.DeleteCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.UpdateCarRequest;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessDataResult;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.CarDao;
import com.etiya.ReCapProject.entities.concretes.Car;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail;

@Service
public class CarManager implements CarService {

	private CarDao carDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public CarManager(CarDao carDao, ModelMapperService modelMapperService) {
		super();
		this.carDao = carDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<CarSearchListDto>> getAll() {
		List<Car> result = this.carDao.findAll();
		List<CarSearchListDto> response = result.stream()
				.map(car -> modelMapperService.forDto().map(car, CarSearchListDto.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<CarSearchListDto>>(response, "Arabalar listelendi.");
	}

	@Override
	public Result add(CreateCarRequest createCarRequest) {
		Car result = modelMapperService.forRequest().map(createCarRequest, Car.class);
		this.carDao.save(result);
		return new SuccessResult("Araba eklendi.");
	}

	@Override
	public Result update(UpdateCarRequest updateCarRequest) {
		Car car = modelMapperService.forRequest().map(updateCarRequest, Car.class);
		this.carDao.save(car);
		return new SuccessResult("Liste güncellendi.");
	}

	@Override
	public Result delete(DeleteCarRequest deleteCarRequest) {
		Car car = modelMapperService.forRequest().map(deleteCarRequest, Car.class);
		this.carDao.delete(car);
		return new SuccessResult("Araba çıkartıldı.");
	}

	@Override
	public DataResult<CarSearchListDto> getById(int carId) {
		Car car = this.carDao.findById(carId).get();
		CarSearchListDto response = modelMapperService.forDto().map(car, CarSearchListDto.class);
		return new SuccessDataResult<CarSearchListDto>(response, "Id'ye göre araba getirildi.");
	}

	@Override
	public DataResult<List<CarDetail>> getCarWithBrandAndColorDetails() {
		
//		List<Car> result = this.carDao.findAll();
//		List<CarDetail> response = result.stream().map(car -> modelMapperService.forDto().map(car, CarDetail.class)).collect(Collectors.toList());
//		return new SuccessDataResult<List<CarDetail>>(response);
		return new SuccessDataResult<List<CarDetail>>(this.carDao.CarWithBrandAndColorDetails());
	}
}
