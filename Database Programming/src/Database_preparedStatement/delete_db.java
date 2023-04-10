
package Database_preparedStatement;

import java.sql.*;
public class delete_db {
    public static void main(String[] args) throws Exception {
          Class.forName("com.mysql.cj.jdbc.Driver");
        
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        PreparedStatement pst=con.prepareStatement("DELETE FROM students WHERE id=?");
        pst.setInt(1, 6);
     
        pst.executeUpdate();
          System.out.println("Successfully Delete");
        pst.close();
        con.close();
    }
}
