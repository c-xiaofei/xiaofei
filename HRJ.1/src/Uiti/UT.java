package Uiti;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UT {
	 // JDBC 椹卞姩鍚嶅強鏁版嵁搴� URL
		static final String JDBC ="com.mysql.jdbc.Driver";
		static final String URL="jdbc:mysql://localhost:3306/test";
		static String username="root";
		static String pwd="root";
		public static Connection getConn() throws SQLException{
			//绫诲姞杞藉櫒鍔犺浇椹卞姩绫�
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection(URL,username, pwd);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			return null;
			};
			public static void closeConn(Connection conn) {
				try {
					if(conn!=null && !conn.isClosed()){}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
				
			}
}

