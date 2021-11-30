package com.etiya.ReCapProject.business.concretes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.BrandService;
import com.etiya.ReCapProject.business.abstracts.CarService;
import com.etiya.ReCapProject.business.abstracts.ColorService;
import com.etiya.ReCapProject.business.constants.Messages;
import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import com.etiya.ReCapProject.business.requests.carRequests.CreateCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.DeleteCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.UpdateCarRequest;
import com.etiya.ReCapProject.core.utilities.business.BusinessRules;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.ErrorDataResult;
import com.etiya.ReCapProject.core.utilities.results.ErrorResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessDataResult;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.CarDao;
import com.etiya.ReCapProject.entities.concretes.Car;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarBrandDetail;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarColorDetail;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail;

@Service
public class CarManager implements CarService {

	private CarDao carDao;
	private ModelMapperService modelMapperService;
	private ColorService colorService;
	private BrandService brandService;

	@Autowired
	public CarManager(CarDao carDao, ModelMapperService modelMapperService, ColorService colorService,
			BrandService brandService) {
		super();
		this.carDao = carDao;
		this.modelMapperService = modelMapperService;
		this.colorService = colorService;
		this.brandService = brandService;
	}

	@Override
	public DataResult<List<CarSearchListDto>> getAll() {
		List<Car> result = this.carDao.findAll();
		List<CarSearchListDto> response = result.stream()
				.map(car -> modelMapperService.forDto().map(car, CarSearchListDto.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<CarSearchListDto>>(response, Messages.CARLIST);
	}

	@Override
	public Result add(CreateCarRequest createCarRequest) {
		Result result = BusinessRules.run(isColorIdExists(createCarRequest.getColorId()),
				isBrandIdExists(createCarRequest.getBrandId()));
		if (result != null) {
			return result;
		}
		Car car = modelMapperService.forRequest().map(createCarRequest, Car.class);
		this.carDao.save(car);
		return new SuccessResult(Messages.CARADD);
	}

	@Override
	public Result update(UpdateCarRequest updateCarRequest) {
		Result result = BusinessRules.run(isCarIdExists(updateCarRequest.getId())
				,isBrandIdExists(updateCarRequest.getBrandId())
				,isColorIdExists(updateCarRequest.getColorId()));
		if (result != null) {
			return result;
		}
		Car car = modelMapperService.forRequest().map(updateCarRequest, Car.class);
		this.carDao.save(car);
		return new SuccessResult(Messages.CARUPDATE);
	}

	@Override
	public Result delete(DeleteCarRequest deleteCarRequest) {
		Result result = BusinessRules.run(isCarIdExists(deleteCarRequest.getId()));
		if (result != null) {
			return result;
		}
		Car car = modelMapperService.forRequest().map(deleteCarRequest, Car.class);
		this.carDao.delete(car);
		return new SuccessResult(Messages.CARDELETE);
	}

	@Override
	public DataResult<CarSearchListDto> getById(int carId) {
		var car = this.carDao.getById(carId);

		try {
			if (car == null) {
				return new ErrorDataResult<CarSearchListDto>(Messages.CARNOTFOUND,null);
			}
		} catch (Exception e) {
			return new ErrorDataResult<CarSearchListDto>(null);
		}
		CarSearchListDto response = modelMapperService.forDto().map(car, CarSearchListDto.class);
		return new SuccessDataResult<CarSearchListDto>(response, "Id'ye göre araba getirildi.");
	}

	@Override
	public DataResult<List<CarDetail>> getCarWithBrandAndColorDetails() {

		return new SuccessDataResult<List<CarDetail>>(this.carDao.CarWithBrandAndColorDetails());
	}

	@Override
	public DataResult<List<CarBrandDetail>> getByBrandId(int brandId) {
		Result existResult = brandService.existsBrandId(brandId);
		if (!existResult.isSuccess()) {
			return new ErrorDataResult(Messages.BRANDNOTFOUND);
		}
		List<Car> cars = this.carDao.getByBrand_Id(brandId);
		List<CarBrandDetail> result = cars.stream()
				.map(car -> modelMapperService.forDto().map(car, CarBrandDetail.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<CarBrandDetail>>(result);
	}

	@Override
	public DataResult<List<CarColorDetail>> getByColorId(int colorId) {
		Result existColor = colorService.isCheckColorExists(colorId);
		if (!existColor.isSuccess()) {
			return new ErrorDataResult(Messages.COLORNOTFOUND);
		}
		List<Car> cars = this.carDao.getByColor_Id(colorId);
		if (cars == null) {
			return new ErrorDataResult<List<CarColorDetail>>(Messages.COLORNOTFOUND, null);
		}
		List<CarColorDetail> result = cars.stream()
				.map(car -> modelMapperService.forDto().map(car, CarColorDetail.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<CarColorDetail>>(result);

	}
	
	private Result isCarIdExists(int carId) {
		var result = this.carDao.existsById(carId);
		if (!result) {
			return new ErrorResult(Messages.CARNOTFOUND);
		}
		return new SuccessResult();
		
	}
	

	private Result isBrandIdExists(int brandId) {
		var result = this.brandService.existsBrandId(brandId);
		if (!result.isSuccess()) {
			return new ErrorResult(Messages.BRANDNOTFOUND);
		}
		return new SuccessResult();
	}

	private Result isColorIdExists(int colorId) {
		var result = this.colorService.isCheckColorExists(colorId);
		if (!result.isSuccess()) {
			return new ErrorResult(Messages.COLORNOTFOUND);
		}
		return new SuccessResult();
	}

	@Override
	public DataResult<List<CarDetail>> getAvailableCars() {
		// refactor edilecek
		List<CarDetail> carDetail = this.carDao.getAllCarMaintenances();
		if (carDetail == null) {
			return new ErrorDataResult<List<CarDetail>>(null);
		}
		return new SuccessDataResult<List<CarDetail>>(carDetail);
	}

	@Override
	public Result isCarExists(int carId) {
		var car = this.carDao.existsById(carId);
		if (!car) {
			return new ErrorResult();
		}
		return new SuccessResult();
	}
}
