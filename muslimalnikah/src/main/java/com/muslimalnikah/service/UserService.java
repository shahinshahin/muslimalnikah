package com.muslimalnikah.service;



import java.util.List;

import com.muslimalnikah.model.RegisterUser;
import com.muslimalnikah.model.loggingUser;



public interface UserService {
	public long addUser(loggingUser p);
	public void updateUser(loggingUser p);
	public List<loggingUser> listUsers();
	public loggingUser getUserById(int id);
	public loggingUser getUserByName(String name,String password);
	public void removeUser(int id);
	public long addregUser(RegisterUser p);
	  public boolean findUser(String uname, String upwd);
}
