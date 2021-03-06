/*
 * Copyright 2016 Mindfire Solutions
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mindfire.bicyclesharing.dto;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * SetPasswordDTO class is used for taking data from the setPassword view
 * 
 * @author mindfire
 * @version 1.0
 * @since 10/03/2016
 */
public class SetPasswordDTO {

	@Email
	@NotEmpty
	private String email;

	@NotEmpty
	@Pattern(regexp = "[^ \t\n\f\r]{4,16}")
	private String password;

	@NotEmpty
	@Pattern(regexp = "[^ \t\n\f\r]{4,16}")
	private String cnfPassword;

	/**
	 * @return the cnfPassword
	 */
	public String getCnfPassword() {
		return cnfPassword;
	}

	/**
	 * @param cnfPassword
	 *            the cnfPassword to set
	 */
	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
