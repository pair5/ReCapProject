package com.etiya.ReCapProject.ws;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.ReCapProject.business.abstracts.CarService;
import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import com.etiya.ReCapProject.business.requests.carRequests.CreateCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.DeleteCarRequest;
import com.etiya.ReCapProject.business.requests.carRequests.UpdateCarRequest;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

	private CarService carService;

	public CarsController(CarService carService) {
		super();
		this.carService = carService;
	}

	@PostMapping("/add")
	public Result add(CreateCarRequest createCarRequest) {

		return this.carService.add(createCarRequest);
	}

	@PutMapping("/update")
	public Result update(UpdateCarRequest updateCarRequest) {
		return this.carService.update(updateCarRequest);

	}

	@DeleteMapping("/delete")
	public Result delete(DeleteCarRequest deleteCarRequest) {
		return this.carService.delete(deleteCarRequest);

	}

	@GetMapping("/getAll")
	public DataResult<List<CarSearchListDto>> getAll() {
		return this.carService.getAll();
	}
	@GetMapping("/getCarWithBrandAndColorDetails")
	public DataResult<List<CarDetail>> getCarWithBrandAndColorDetails() {
		return this.carService.getCarWithBrandAndColorDetails();
	}

	@GetMapping("/getCar")
	public DataResult<CarSearchListDto> getCar(int id) {
		return this.carService.getById(id);
	}

}
