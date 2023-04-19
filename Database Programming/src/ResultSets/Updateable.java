package ResultSets;

import java.sql.*;

public class Updateable {
    
    public static void main(String[] args) {
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/advanced_java", "root", "");
             Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = st.executeQuery("SELECT * FROM students")) {
            
            if (rs.next()) {
                rs.absolute(3);
                System.out.println(rs.getRow());
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                
                int inc = 20;
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                int marks = rs.getInt(3);
                
                System.out.println("Previous marks: " + marks);
                
                rs.updateInt(3, marks + inc);
                rs.updateString(2, "Kisan");
                rs.updateRow();
                
                System.out.println(rs.getRow());
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
