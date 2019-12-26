package com.muslimalnikah.list;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")

public class Nationality {
	@Id
	   @GeneratedValue
	   @Column(name = "id")
	
	private int nationality_id;

	
	@Column(name = "name")
	private String nationality_name;
	@Column(name = "sortname")
	private String nationality_sort_name;
	@Column(name = "phonecode")
	private String nationality_phonecode;

	public Nationality() {
		// TODO Auto-generated constructor stub
	}

	public int getNationality_id() {
		return nationality_id;
	}

	public void setNationality_id(int nationality_id) {
		this.nationality_id = nationality_id;
	}

	public String getNationality_name() {
		return nationality_name;
	}

	public void setNationality_name(String nationality_name) {
		this.nationality_name = nationality_name;
	}

	public String getNationality_sort_name() {
		return nationality_sort_name;
	}

	public void setNationality_sort_name(String nationality_sort_name) {
		this.nationality_sort_name = nationality_sort_name;
	}

	public String getNationality_phonecode() {
		return nationality_phonecode;
	}

	public void setNationality_phonecode(String nationality_phonecode) {
		this.nationality_phonecode = nationality_phonecode;
	}

	
	
	

}
