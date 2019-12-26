package com.muslimalnikah.list;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_occupation")

public class Occupation {
	@Id
	   @GeneratedValue
	   @Column(name = "id")
	   private Long id;
	 @Column(name = "occupation_code")
	private int occupation_code;
	 @Column(name = "occupation_name")
	private String occupation_name;

	public Occupation() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getOccupation_code() {
		return occupation_code;
	}

	public void setOccupation_code(int occupation_code) {
		this.occupation_code = occupation_code;
	}

	public String getOccupation_name() {
		return occupation_name;
	}

	public void setOccupation_name(String occupation_name) {
		this.occupation_name = occupation_name;
	}

}
