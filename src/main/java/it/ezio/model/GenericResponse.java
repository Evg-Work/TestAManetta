package it.ezio.model;

public class GenericResponse extends ApiResponse{

	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
