/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database_Statement;



import java.sql.*;
public class delete {
        public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        Statement st=con.createStatement();
        
          st.executeUpdate("DELETE FROM students WHERE id=1");
          System.out.println("Deteted Succesfully");
         st.close();
         con.close();
        
    }
}
