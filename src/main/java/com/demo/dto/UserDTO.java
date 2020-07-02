package com.demo.dto;

import java.io.Serializable;

/**
 * UserDTO
 */
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	// =================================================
	// variables
	// =================================================
	private long id;
	private String name;
	private String phone;

	// =================================================
	// Constructors
	// =================================================
	public UserDTO() {
		super();
	}

	public UserDTO(long id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	// =================================================
	// Accessors
	// =================================================

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
