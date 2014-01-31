package com.crud.operations.model.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.crud.operations.model.User;

public class UserResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean success;
	private String message;
	private List<User> data;

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}
	
	public void setData(User data){
		List<User> tempList= new ArrayList<User>();
		tempList.add(data);		
		this.data = tempList;
	}

}
