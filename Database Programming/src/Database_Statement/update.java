
package Database_Statement;

import java.sql.*;
public class update {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        
        Statement st=con.createStatement();
        String upQuery="UPDATE students SET name='Govinda' WHERE id=2";
         st.executeUpdate(upQuery);
                System.out.println("Updated Succesfully");
        st.close();
        con.close();
    }
}
