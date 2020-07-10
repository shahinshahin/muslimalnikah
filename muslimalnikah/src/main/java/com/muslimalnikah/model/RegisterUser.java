package com.muslimalnikah.model;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "registeredusers2")
@SecondaryTable(name = "loginuser", pkJoinColumns =@javax.persistence.PrimaryKeyJoinColumn (name = "userid", referencedColumnName = "id"))
public class RegisterUser implements Serializable {
 
    private static final long serialVersionUID = -3465813074586302847L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )   
    private int id;
//    @Column
//    private byte[] uploadImage;
// 
    @Column(table = "loginuser")
    private String username;
    @Column(table = "loginuser")
    private String password;
    @Column
    private String confirmpassword;
    @Column(table = "loginuser")
    private String email;
 
    @Column
    private String address;
 
    @Column
    private String mobile;
    
    
	

    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
	
    
 
    
}