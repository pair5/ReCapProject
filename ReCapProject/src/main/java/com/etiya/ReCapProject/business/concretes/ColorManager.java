package com.etiya.ReCapProject.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.colorchooser.ColorSelectionModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.ColorService;
import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import com.etiya.ReCapProject.business.dtos.ColorSearchListDto;
import com.etiya.ReCapProject.business.requests.colorRequests.CreateColorRequest;
import com.etiya.ReCapProject.business.requests.colorRequests.DeleteColorRequest;
import com.etiya.ReCapProject.business.requests.colorRequests.UpdateColorRequest;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessDataResult;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.ColorDao;
import com.etiya.ReCapProject.entities.concretes.Car;
import com.etiya.ReCapProject.entities.concretes.Color;

@Service
public class ColorManager implements ColorService {

	private ColorDao colorDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public ColorManager(ColorDao colorDao, ModelMapperService modelMapperService) {
		super();
		this.colorDao = colorDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<ColorSearchListDto>> getAll() {
		List<Color> result = this.colorDao.findAll();
		List<ColorSearchListDto> response = result.stream()
				.map(color -> modelMapperService.forDto().map(color, ColorSearchListDto.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<ColorSearchListDto>>(response, "Arabalar listelendi.");
	}

	@Override
	public Result add(CreateColorRequest createColorRequest) {

		Color result = modelMapperService.forRequest().map(createColorRequest, Color.class);
		this.colorDao.save(result);
		return new SuccessResult("Renk eklendi.");
	}

	@Override
	public Result delete(DeleteColorRequest deleteColorRequest) {
		Color color= modelMapperService.forRequest().map(deleteColorRequest, Color.class);
		this.colorDao.delete(color);
		return new SuccessResult("Silindi.");
	}

	@Override
	public Result update(UpdateColorRequest updateColorRequest) {
		Color color= modelMapperService.forRequest().map(updateColorRequest, Color.class);
		this.colorDao.save(color);
		return new SuccessResult("Liste güncellendi.");
	}

	@Override
	public DataResult<ColorSearchListDto> getByColorId(int colorId) {
		Color color = this.colorDao.findById(colorId).get();
		ColorSearchListDto response = modelMapperService.forDto().map(color ,ColorSearchListDto.class);
		return new SuccessDataResult<ColorSearchListDto>(response,"Id'ye göre araba getirildi.");
	}

}
