/**
 * 
 */
package com.users.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * User bean
 * @author Santhosh
 *
 */

@Entity
@Table(name = "users")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@NotEmpty(message = "First name cannot be null for a user")
	@Pattern(regexp = "^.*[A-Za-z].*$", message = "User name cannot contain numbers and special characters.")
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@NotNull
	@Email(message="Please provide a valid Email address")
	@Column(name = "email_id")
	private String emailId;

	@Column(name = "created_ts")
	private Timestamp createdTs;

	@Column(name = "updated_ts")
	private Timestamp updatedTs;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Timestamp getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}

	public Timestamp getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(Timestamp updatedTs) {
		this.updatedTs = updatedTs;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
