package com.etiya.ReCapProject.business.abstracts;

import java.util.List;

import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import com.etiya.ReCapProject.business.requests.carRequests.CreateCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.DeleteCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.UpdateCarRequest;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.entities.concretes.Car;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarBrandDetail;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarColorDetail;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail;

public interface CarService {
	DataResult<List<CarSearchListDto>> getAll();
	Result add(CreateCarRequest createCarRequest);
	Result update(UpdateCarRequest updateCarRequest);
	Result delete(DeleteCarRequest deleteCarRequest);
	
	 DataResult<CarSearchListDto>  getById(int carId);
	
	DataResult<List<CarDetail>> getCarWithBrandAndColorDetails();
	Result isCarExists(int id);
	
	DataResult<List<CarBrandDetail>> getByBrandId(int brandId);
	
	DataResult<List<CarColorDetail>> getByColorId(int colorId);
	
	DataResult<List<Car>> getAvailableCars();
	
}
