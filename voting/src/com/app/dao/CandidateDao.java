package com.app.dao;

import java.sql.SQLException;

import com.app.entities.Candidate;
import com.app.entities.User;

public interface CandidateDao {
	//add a method for user's signin
	User signIn(String email, String password) throws SQLException;
	
	//add method for candidateVotes
	String candidatesVotes(int id,String email,String passwd)throws SQLException;
}
