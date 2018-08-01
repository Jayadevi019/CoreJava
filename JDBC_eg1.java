import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class JDBC_eg1 {
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
		//System.out.println("Enter the name");
		//ename=br.readLine();
		String sql="Insert into emp1 values(?,?,?)";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setInt(1,123);
        pstmt.setString(2,"Guru");
        pstmt.setInt(3,1229);
        
        pstmt.addBatch();
        pstmt.setInt(1,234);
        pstmt.setString(2,"Mahe");
        pstmt.setInt(3,1319);
        
        pstmt.addBatch();
        
        
        int x[]=pstmt.executeBatch();
        
        //int rowsAffected=pstmt.executeUpdate();
        
//        System.out.println(rowsAffected);
//        if(rowsAffected<=0)
        if (x.length>0)
        {
        	System.out.println("Inserted successfully");
        }
        else
        {
        	System.out.println("Nothing inserted");
        }
        pstmt.close();
        con.close();
        
        
       
      }
      }