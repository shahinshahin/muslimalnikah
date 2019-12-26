package com.muslimalnikah.list;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_gender_type")
public class Gender {
	@Id
	   @GeneratedValue
	   @Column(name = "id")
	   private Long id;
	 @Column(name = "gender_id")
	private int gender_id;
	 @Column(name = "gender_name")
	private String gender_name;
	 
	public Gender() {
		// TODO Auto-generated constructor stub
	}

	public int getGender_id() {
		return gender_id;
	}

	public void setGender_id(int gender_id) {
		this.gender_id = gender_id;
	}

	public String getGender_name() {
		return gender_name;
	}

	public void setGender_name(String gender_name) {
		this.gender_name = gender_name;
	}

}
