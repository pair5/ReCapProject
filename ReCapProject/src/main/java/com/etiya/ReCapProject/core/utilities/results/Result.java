package com.etiya.ReCapProject.core.utilities.results;

public class Result {

	private boolean success;
	private String message;


	public Result(boolean success) {
		this.success = success;
	}

	public Result(boolean success, String message) {
		this.success = success;
		this.message = message;
	}


	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		if (get(this.message) == null){
			return this.message;
		}
		return get(this.message);
	}
	
	private String get(String message){
		return LanguageSelector.languageSelector(message);
	}
}
