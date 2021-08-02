package com.neosoft.app.employeeportal1.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
//@SQLDelete(sql = "UPDATE employee SET deleted = true WHERE id=?")
//@FilterDef(name = "deletedProductFilter", parameters = @ParamDef(name = "isDeleted", type = "boolean"))
//@Filter(name = "deletedProductFilter", condition = "deleted = :isDeleted")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	@NotEmpty(message = "Name AtLeast Contain 2 charactor")
	@Size(min = 2, max = 30)
	private String firstName;
	@NotEmpty(message = "Surname alteast Contain 2 Charactor ")
	@Size(min = 2, max = 30)
	private String surname;
	@NotEmpty
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private String dateOfBirth;
	@NotEmpty
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private String dateOfJoining;
	/*
	 * @OneToOne(cascade = CascadeType.ALL) private LocalAddress localAddress;
	 * 
	 * @OneToOne(cascade = CascadeType.ALL) private PermanantAddress
	 * permanantAddress;
	 */
	@NotEmpty(message = "PanNumber Should Contain atleast 5 Charactor")
	@Size(min = 5, max = 8)
	private String panNumber;
//	@NotEmpty(message = "Adhar should Atleast Contain Letter")
//	@Size(min = 5, max = 12)
	private long adharCard;
	//@NotEmpty(message = " ")
	//@Size(min = 8, max = 10)
	private String passportNo;
	//@NotEmpty(message = " ")
	//@Size(min = 2, max = 30)
	private String placeOfWorking;
	private long mobileNo;

}
