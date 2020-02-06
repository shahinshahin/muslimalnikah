package com.muslimalnikah.service;



import java.util.List;



import com.muslimalnikah.model.loggingUser;



public interface UserService {
	public void addUser(loggingUser p);
	public void updateUser(loggingUser p);
	public List<loggingUser> listUsers();
	public loggingUser getUserById(long id);
	public void removeUser(int id);

}
