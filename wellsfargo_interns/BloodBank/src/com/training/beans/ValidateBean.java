package com.training.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.utils.MySqlConnection;

public class ValidateBean {
                           
	private String userName;
	private String passWord;
	
	public ValidateBean() {
		super();
	System.out.println("Constructor called");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("set userName called"+ userName);
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		System.out.println("set Password called"+ passWord);

		this.passWord = passWord;
	}
	
	public boolean validate() {
		boolean result = false;
		Connection con = null;
		
		 PreparedStatement pstmt = null;
		try {
		
			String sql = "select * from users where userName =? and passWord=?";
			
			 con = MySqlConnection.getConnection();
			
			  pstmt = con.prepareStatement(sql);
			 
			     pstmt.setString(1, this.userName);
			     pstmt.setString(2, this.passWord);
			     
			 ResultSet rs = pstmt.executeQuery();
			 
			   if(rs.next()) {
				   result = true;
			   }
		} catch (SQLException e) {
			
		}
		 finally {
			    try {
					pstmt.close();
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			    
		 } 
					
		
		return result;
	}
	
}
