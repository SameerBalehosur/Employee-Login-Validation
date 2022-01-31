package com.te.validation.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class User implements Serializable {
	@Id
	private String emailAddress;
	private String password;

}
