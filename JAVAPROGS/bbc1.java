import java.util.*;
import java.sql.*;
public class bbc1 {
    
    public static void main(String args[])throws Exception
    {    int flag=0;
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","password");
        Statement stmt = con.createStatement();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String y =s.trim();
        ResultSet rs= stmt.executeQuery("select * from bbc where email='"+y+"' ");
        while (rs.next())
        {
            System.out.print(rs.getString(1));
            flag=1;
        }
        if(flag==0)
        {
            System.out.print(y+"is  not in database");

        }
        con.close();


    }
}
