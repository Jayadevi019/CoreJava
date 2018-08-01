import java.sql.*;
public class JDBCDemo2 {
      public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			//Loading any class manually
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1)
		{
			System.out.println("Unable to locate the Driver");
			 System.out.println(e1.getCause());
			 System.out.println(e1.getMessage());
		}
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uname="scott";
		String upass="tiger";
		Connection con=null;
		try 
		{
	    con=DriverManager.getConnection(url,uname,upass);
		System.out.println("Connection Sucessfull");
		}
		catch(SQLException e)
		{
			System.out.println("Could Not connect..Some Problem");
		    System.out.println(e.getCause());
		    System.out.println(e.getMessage());
		}
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from employee");
		while(rs.next())
		{
			String name=rs.getString(1);
			String salary=rs.getString(2);
			String department=rs.getString(3);
			System.out.println(name+""+salary+""+"      "+department+"");
		}
		// close all resources
		rs.close();
		stmt.close();
		con.close();
	}
}
