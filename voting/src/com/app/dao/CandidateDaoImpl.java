package com.app.dao;

import java.sql.*;

import com.app.entities.User;

public class CandidateDaoImpl implements CandidateDao {
	private Connection cn;
	private PreparedStatement pst1,pst2,pst3;
	
	
	//add ctor 
	public CandidateDaoImpl()throws SQLException
	{
		//get connection from db utils
		cn = openConnection();
		
		// pst1 : sign in
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		
		//pst2: candidatesVotes
		pst2=cn.prepareStatement("update candidates set votes=votes+1 where id=?");
		
		//update in users after voting
		pst3=cn.prepareStatement("update users set status=1 where email=? and password=?");
		
	}
	
	@Override
	public Users signIn(String email, String password) throws SQLException {
		// 1. set IN params
		pst1.setString(1, email);
		pst1.setString(2, password);
		// 2. exec query
		try (ResultSet rst = pst1.executeQuery()) {
			// rst cursor : before the 1st row
			
			if (rst.next()) // => successful login
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), email, password, rst.getDate(6),
						rst.getBoolean(7), rst.getString(8));
		}
		return null;
	}
	
	@Override
	public String candidatesVotes(int id,String email,String password)throws SQLException
	{
		pst2.setInt(1, id);
		pst3.setString(1, email);
		pst3.setString(2, password);
		
		pst2.executeUpdate();
		int rows=pst2.executeUpdate();
		if(rows==1)
			return "Voting casted successfully!!!";
		return "Voting failed!!!";
	}

	// add clean up method to close DB resources
		public void cleanUp() throws SQLException {
			System.out.println("user dao cleaned up");
			if (pst1 != null)
				pst1.close();
			if (pst2 != null)
				pst2.close();
			if (pst3 != null)
				pst3.close();
			
			closeConnection();
		}

	
}
