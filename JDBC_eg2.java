import java.sql.*;
public class JDBC_eg2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uname="scott";
		String upass="tiger";
		Connection con=DriverManager.getConnection(url,uname,upass);
		String sql="{?=call Big1(?,?)}";
		CallableStatement cs=con.prepareCall(sql);
		cs.registerOutParameter(1,Types.INTEGER);
		cs.setInt(2, 13);
		cs.setInt(3, 19);
	    boolean eg=cs.execute();
	    System.out.println("Executed Sucessfully");
	    System.out.println("Biggest no is "+cs.getInt(1));
        cs.close();
        con.close();
		}
		catch(ClassNotFoundException cc) 
		{
			
		}
		catch(SQLException ss) 
		{
			
		}
	}

}
