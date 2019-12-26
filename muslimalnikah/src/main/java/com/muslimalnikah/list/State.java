package com.muslimalnikah.list;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states")

public class State {
	@Id
	   @GeneratedValue	 
	   
	 @Column(name = "id")

	private String state_code;
	 @Column(name = "name")

	private String state_name;
	 @Column(name = "contry_id")

		private String state_country_name;

	public State() {
		// TODO Auto-generated constructor stub
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

}
