package com.muslimalnikah.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MemberDetailModel {
	private static final long serialVersionUID = -3465813074586302847L;
	 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    @Column
//    private byte[] uploadImage;
    @JsonIgnore
	private MultipartFile uploadFile;

    @Column
    private String name;
 
    @Column
    private String lastname;
    @Column
    private String mothername;
    @Column
    private String fathername;
    @Column
    private String email;
    @Column
    private String mobilenumber;
 
    @Column
    private String address;
 
 
    
    @Column
    private String dateofbirth;
    @Column
    private String occupation_id;
    @Column
    private String occupation_name;
    @Column
    private String gender_id;
    @Column
    private String gender_name;
//    @Column
//    private String marrital_id;
//    @Column
//    private String marrital_status;
//    @Column
//    private String qualification_id;
//    @Column
//    private String qualification_name;
    @Column
    private String state_id;
    @Column
    private String state_name;
//    @Column
//    private String district_id;
//    @Column
//    private String district_name;
//    @Column
//    private String nationality_id;
    @Column
    private String nationality_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public byte[] getUploadImage() {
//		return uploadImage;
//	}
//	public void setUploadImage(byte[] uploadImage) {
//		this.uploadImage = uploadImage;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender_id() {
		return gender_id;
	}
	public void setGender_id(String gender_id) {
		this.gender_id = gender_id;
	}
	public String getGender_name() {
		return gender_name;
	}
	public void setGender_name(String gender_name) {
		this.gender_name = gender_name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getNationality_name() {
		return nationality_name;
	}
	public void setNationality_name(String nationality_name) {
		this.nationality_name = nationality_name;
	}
	public String getOccupation_id() {
		return occupation_id;
	}
	public void setOccupation_id(String occupation_id) {
		this.occupation_id = occupation_id;
	}
	public String getOccupation_name() {
		return occupation_name;
	}
	public void setOccupation_name(String occupation_name) {
		this.occupation_name = occupation_name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
	
}
