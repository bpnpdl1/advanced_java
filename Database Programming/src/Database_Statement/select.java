
package Database_Statement;

import java.sql.*;
public class select {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        
        Statement st=con.createStatement();
        
          ResultSet rs=st.executeQuery("select*from students");

                  while(rs.next()){
                  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
                  
            
             }
        st.close();
        con.close();
    }
}
