
package Database_preparedStatement;

import java.sql.*;
public class update_db {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        PreparedStatement pst=con.prepareStatement("UPDATE students SET name=?, address=? WHERE id=?");
        
        pst.setString(1, "umesh");
        pst.setString(2, "Ratnanagar");
        pst.setInt(3, 18);
        pst.executeUpdate();
        System.out.println("Successfully Updated");
        pst.close();
        con.close();
         }
         
    }

