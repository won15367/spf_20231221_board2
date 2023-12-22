package com.won15367.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import javax.sql.DataSource;

public class BoardDao {
	
	DataSource dataSource;
	
	public BoardDao() {
		
		try {
			Context context = new InitialLdapContext();
			context.lookup("java:comp/env/jdbc/oracledb");
		} catch (NamingException e) {
			e.printStackTrace();
		}
				
	}
	
	public void write(String bname, String btitle, String bcontent) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "insert int fboard(bid, bname, btitle, bcontent, bhit) values ( fboard_dwq.nestval, ?, ?, ?, 0)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			if(pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
			} catch (Exception e){
				
			}
		}
		
	}
}
