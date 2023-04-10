
package Database_Statement;

import java.sql.*;
public class Insert {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        Statement st=con.createStatement();
        
          st.executeUpdate("INSERT INTO students(name,address,marks) VALUES('Suresh','Gaindakot',39)");
          System.out.println("Inserted Succesfully");
         st.close();
         con.close();
        
    }
}
