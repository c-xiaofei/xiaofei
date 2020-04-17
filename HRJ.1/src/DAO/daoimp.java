package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Uiti.UT;

public class daoimp implements dao{
	private static final java.sql.Statement DBConnection = null;
	@Override
	public dao cun(String name,String possword) {
		
		boolean asd = false;
		
		
		try {
			Connection conn;
			UT U =new UT();
			
			conn = U.getConn();
			String sql="insert into aaa(name,possword) values (?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, possword);
			
			ps.executeUpdate();
		
			ps.close();
			conn.close();
			System.out.println("创建用户");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
