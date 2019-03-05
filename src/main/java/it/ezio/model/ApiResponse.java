package it.ezio.model;

import java.io.Serializable;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ApiResponse implements Serializable{
	
	private ResponseStatus status = new ResponseStatus();

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}}
