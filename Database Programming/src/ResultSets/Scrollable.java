
package ResultSets;

import java.sql.*;

public class Scrollable {
    
    public  static void main(String[] args){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/advanced_java", "root", "");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from students");
            
            rs.absolute(1);
            System.out.println(rs.getRow());
            while(rs.next()){
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            rs.first();
            System.out.println(rs.getRow());
            
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        
    }
    
}
