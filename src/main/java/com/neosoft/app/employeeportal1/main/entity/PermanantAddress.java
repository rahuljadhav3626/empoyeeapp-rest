package com.neosoft.app.employeeportal1.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="permanantaddress")
public class PermanantAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
	@NotEmpty(message = "houseNo AtLeast Contain 2 charactor")
	@Size(min = 2, max = 30)
	private String houseNo;
	@NotEmpty(message = "appartment AtLeast Contain 2 charactor")
	@Size(min = 2, max = 30)
	private String appartment ;
	@NotEmpty(message = "street AtLeast Contain 2 charactor")
	@Size(min = 2, max = 30)
	private String street;
	@NotEmpty(message = "pincode AtLeast Contain 2 charactor")
	@Size(min = 2, max = 30)
	private String pincode ;
	@NotEmpty(message = "city AtLeast Contain 2 charactor")
	@Size(min = 2, max = 30)
	private String city;
	@NotEmpty(message = "state AtLeast Contain 2 charactor")
	@Size(min = 2, max = 30)
	private String state;
	//private boolean deleted = Boolean.FALSE;
}

