package com.etiya.ReCapProject.dataAccess.abstracts;

import java.util.List;

import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.etiya.ReCapProject.entities.concretes.Car;
import com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail;

public interface CarDao extends JpaRepository<Car, Integer> {

	@Query("Select new com.etiya.ReCapProject.entities.concretes.complexTypes.CarDetail "
			+ "(c.id,b.brandName,co.colorName,c.dailyPrice,c.description)"
			+ "From Car c Inner Join c.brand b Inner Join c.color co ")
	List<CarDetail> CarWithBrandAndColorDetails();

	List<Car> getByBrand_Id(int brandId);

	List<Car> getByColor_Id(int colorId);

//updated
	List<CarDetail> getByBrand_BrandName(String brandName);

	@Query("Select new com.etiya.ReCapProject.business.dtos.CarSearchListDto" + "(c.id ,c.brand.id,c.color.id,c.modelYear,c.dailyPrice,c.description,c.findexScore) "
			+ "From Car c Left Join  c.carMaintenances cm WHERE (cm.returnDate is not null AND cm.returnDate is null) or (cm.returnDate is null AND cm.returnDate is null)")
	List<CarSearchListDto> getAllWithoutMaintenanceOfCar();


}
