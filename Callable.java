import java.sql.*;

public class Callable {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String jdbcURL = "jdbc:oracle:thin:127.0.0.1:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcURL, username, password);

			String sql = "{?=call Big1(?,?)}";

			CallableStatement cstmt = con.prepareCall(sql);

			cstmt.registerOutParameter(1, Types.INTEGER);

			cstmt.setInt(2, 25);
			cstmt.setInt(3, 125);

			boolean ex = cstmt.execute();

			System.out.println("SQL function is executed successfully");
			System.out.println("Biggest num is" + cstmt.getInt(1));

			cstmt.close();
			con.close();
			
		} catch (ClassNotFoundException cc)
		{
			System.out.println("Catch block 1");
		}
		catch (SQLException se) 
		{	
			System.out.println("Catch block 2");
		}
	}
}
