package com.etiya.ReCapProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.etiya.ReCapProject.entities.concretes.Car;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarBrandDetail;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail;

public interface CarDao extends JpaRepository<Car, Integer> {

	@Query("Select new com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail "
			+ "(c.id,b.brandName,co.colorName,c.dailyPrice)" + "From Car c Inner Join c.brand b Inner Join c.color co ")
	List<CarDetail> CarWithBrandAndColorDetails();

	List<Car> getByBrand_Id(int brandId);

	List<Car> getByColor_Id(int colorId);

	List<CarDetail> getByBrand_BrandName(String brandName);

	@Query(value = "Select new com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail"
			+ "(cars.id, brands.brand_name, colors.color_name, c.daily_price)"
			+ "inner join colors" 
			+ "on cars.color_id=colors.color_id" 
			+ "inner join brands"
			+ "on cars.brand_id=brands.id" 
			+ "left join car_maintenances"
			+ "on cars.id=car_maintenances.car_id" 
			+ "where car_maintenances.car_id is null", nativeQuery = true)
	List<CarDetail> getAllCarMaintenances();

}
