package com.web.hospital.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;


public class Account {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.Account.id
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.Account.username
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	@Size(min=6, message = "Ít nhất 6 kí tự")
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.Account.password
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	@Size(min=6, message = "Ít nhất 6 kí tự")
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.Account.role
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	private String role;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dbo.Account.name
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	@Size(min=2,message = "Ít nhất 2 kí tự")
	private String name;

	private String oldPassword;
	private String newPassword;
	private String confirmPassword;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.Account.id
	 * @return  the value of dbo.Account.id
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.Account.id
	 * @param id  the value for dbo.Account.id
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.Account.username
	 * @return  the value of dbo.Account.username
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.Account.username
	 * @param username  the value for dbo.Account.username
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.Account.password
	 * @return  the value of dbo.Account.password
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.Account.password
	 * @param password  the value for dbo.Account.password
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.Account.role
	 * @return  the value of dbo.Account.role
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.Account.role
	 * @param role  the value for dbo.Account.role
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dbo.Account.name
	 * @return  the value of dbo.Account.name
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dbo.Account.name
	 * @param name  the value for dbo.Account.name
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	public void setName(String name) {
		this.name = name;
	}

	private String repassword;

    public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}