
package Database_preparedStatement;

import java.sql.*;
public class select_db {
    public static void main(String[] args) throws Exception {
       Class.forName("com.mysql.cj.jdbc.Driver");
        
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
       PreparedStatement pst=con.prepareStatement("SELECT*FROM students");
        
       ResultSet rs=pst.executeQuery();
        while(rs.next()){
                  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
             }

         pst.close();
        con.close();
       
        
        
    }
}
