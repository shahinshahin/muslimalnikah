package com.muslimalnikah.model;

import java.util.ArrayList;

import com.muslimalnikah.list.Gender;
import com.muslimalnikah.list.Nationality;
import com.muslimalnikah.list.Occupation;
import com.muslimalnikah.list.State;

public class GenricMaster {

	
	private ArrayList<Occupation> occupations;

	
	private ArrayList<State> states;

	
	private ArrayList<Gender> genders;

	
	private ArrayList<District> district;

	
	
	private ArrayList<Nationality> nationalities;

	public GenricMaster() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Occupation> getOccupations() {
		return occupations;
	}

	public void setOccupations(ArrayList<Occupation> occupations) {
		this.occupations = occupations;
	}

	public ArrayList<State> getStates() {
		return states;
	}

	public void setStates(ArrayList<State> states) {
		this.states = states;
	}

	public ArrayList<Gender> getGenders() {
		return genders;
	}

	public void setGenders(ArrayList<Gender> genders) {
		this.genders = genders;
	}

	public ArrayList<Nationality> getNationalities() {
		return nationalities;
	}

	public void setNationalities(ArrayList<Nationality> nationalities) {
		this.nationalities = nationalities;
	}
	

	
}
