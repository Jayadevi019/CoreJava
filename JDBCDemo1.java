import java.sql.*;
public class JDBCDemo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			//Loading any class manually
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Unable to locate the Driver");
			 System.out.println(e1.getCause());
			 System.out.println(e1.getMessage());
		}
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uname="scott";
		String upass="tiger";
		try 
		{
		Connection con=DriverManager.getConnection(url,uname,upass);
		System.out.println("Connection Sucessfull");
		}
		catch(SQLException e)
		{
			System.out.println("Could Not connect..Some Problem");
		    System.out.println(e.getCause());
		    System.out.println(e.getMessage());
		}
	}
}
