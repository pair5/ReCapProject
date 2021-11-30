package com.etiya.ReCapProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.etiya.ReCapProject.entities.concretes.Car;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail;

public interface CarDao extends JpaRepository<Car, Integer> {

	@Query("Select new com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail "
			+ "(c.id,b.brandName,co.colorName,c.dailyPrice)" + "From Car c Inner Join c.brand b Inner Join c.color co ")
	List<CarDetail> CarWithBrandAndColorDetails();

	List<Car> getByBrand_Id(int brandId);

	List<Car> getByColor_Id(int colorId);

	List<CarDetail> getByBrand_BrandName(String brandName);

//	@Query("Select new com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail "
//			+ "(c.id,b.brandName,co.colorName,c.dailyPrice)" 
//			+ "From Car c Inner Join c.brand b Inner Join c.color co left join c.carMaintenances m m.car.carId=c.id and m.returnDate is null")
//	List<CarDetail> getAvaliableCars();


}
