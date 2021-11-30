package com.etiya.ReCapProject.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.colorchooser.ColorSelectionModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.ColorService;
import com.etiya.ReCapProject.business.constants.Messages;
import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import com.etiya.ReCapProject.business.dtos.ColorSearchListDto;
import com.etiya.ReCapProject.business.requests.colorRequests.CreateColorRequest;
import com.etiya.ReCapProject.business.requests.colorRequests.DeleteColorRequest;
import com.etiya.ReCapProject.business.requests.colorRequests.UpdateColorRequest;
import com.etiya.ReCapProject.core.utilities.business.BusinessRules;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.ErrorResult;
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
		return new SuccessDataResult<List<ColorSearchListDto>>(response, Messages.COLORLIST);
	}

	@Override
	public Result add(CreateColorRequest createColorRequest) {
		Result result = BusinessRules.run(existsColorName(createColorRequest.getColorName()));
		if (result != null) {
			return result;
		}
		Color color = modelMapperService.forRequest().map(createColorRequest, Color.class);
		this.colorDao.save(color);
		return new SuccessResult(Messages.COLORADD);
	}

	@Override
	public Result delete(DeleteColorRequest deleteColorRequest) {
		Result result = BusinessRules.run(isCheckColorExists(deleteColorRequest.getId()));
		if (result != null) {
			return result;
		}
		Color color = modelMapperService.forRequest().map(deleteColorRequest, Color.class);
		this.colorDao.delete(color);
		return new SuccessResult(Messages.COLORDELETE);
	}

	@Override
	public Result update(UpdateColorRequest updateColorRequest) {
		Result result = BusinessRules.run(isCheckColorExists(updateColorRequest.getId()));
		if (result != null) {
			return result;
		}
		Color color = modelMapperService.forRequest().map(updateColorRequest, Color.class);
		this.colorDao.save(color);
		return new SuccessResult(Messages.COLORUPDATE);
	}

	@Override
	public DataResult<ColorSearchListDto> getByColorId(int colorId) {
		Color color = this.colorDao.findById(colorId).get();
		ColorSearchListDto response = modelMapperService.forDto().map(color, ColorSearchListDto.class);
		return new SuccessDataResult<ColorSearchListDto>(response, Messages.COLORGET);
	}
	
	@Override
	public Result isCheckColorExists(int colorId) {
		var result = this.colorDao.existsById(colorId);
		if (!result) {
			return new ErrorResult(Messages.COLORNOTFOUND);
		}
		return new SuccessResult();
	}

	private Result existsColorName(String colorName) {
		var result = this.colorDao.existsByColorName(colorName);
		if (result) {
			return new ErrorResult(Messages.COLORERROR);
		}
		return new SuccessResult();
	}

}
