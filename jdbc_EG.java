import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class jdbc_EG {
      public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			//Loading any class manually
			Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uname="scott";
		String upass="tiger";
		Connection con=null;
		con=DriverManager.getConnection(url,uname,upass);
		String ename="";
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the name");
		ename=br.readLine();
		String sql="Delete from emp1 where trim(ename)=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1,ename);
     
        int rowsAffected=pstmt.executeUpdate();
        System.out.println(rowsAffected);
        if(rowsAffected<=0)
        {
        	System.out.println("Not Deleted");
        }
        else
        {
        	System.out.println("Deleted");
        }
        pstmt.close();
        con.close();
        
        
       
      }
      }