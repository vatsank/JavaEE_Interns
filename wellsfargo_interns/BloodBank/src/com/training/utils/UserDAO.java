package com.training.utils;
import java.sql.*;

public class UserDAO {

	private Connection con;

	public UserDAO() {
		super();
		con = MySqlConnection.getConnection();
	}
	
	public int updatePassWord(String email, String passWordToChange){
		
		String sql ="update users set password = ? where email =?";
		int rowsUpdated = 0;
		PreparedStatement pstmt = null; 
		try {
			 
			 pstmt = con.prepareStatement(sql);
			 
			 pstmt.setString(1, passWordToChange);
			 pstmt.setString(2, email);
			 
			 rowsUpdated = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowsUpdated;
	}
	
}
