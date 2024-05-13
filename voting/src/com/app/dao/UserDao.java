package com.app.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.app.entities.User;

public interface UserDao {
//add a method for user's signin
	User signIn(String email, String password) throws SQLException;

	// add a method for getting user details(not admin) born between dates
	List<User> getUserDetails(Date begin, Date end) throws SQLException;
	// add a method for voter reg.
	String voterRegistration(User newVoter) throws SQLException;
	
	//add a method for deleting a user
	String deleteVoter(int voterId)throws SQLException;
	
	//add a method for changing password
	String changePassword(String email,String oldpass,String newpass)throws SQLException;
}
