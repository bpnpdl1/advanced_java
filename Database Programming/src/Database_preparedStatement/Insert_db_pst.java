
package Database_preparedStatement;

import java.sql.*;
public class Insert_db_pst {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        PreparedStatement pst=con.prepareStatement("INSERT INTO students VALUES(?,?,?,?)");
        pst.setInt(1, 18);
        pst.setString(2,"Harry");
        pst.setString(3,"Bhojad");
        pst.setInt(4,82);
        
        System.out.println("Successfully Inserted");
        
        pst.executeUpdate();
        pst.close();
        con.close();
        
        
        
    }
}
