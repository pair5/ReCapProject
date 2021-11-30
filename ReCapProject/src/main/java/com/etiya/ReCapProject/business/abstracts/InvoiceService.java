package com.etiya.ReCapProject.business.abstracts;

import java.util.List;

import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;

public interface InvoiceService {
//	DataResult<> getAll();
	Result add();
	Result delete();
	Result update();
}
