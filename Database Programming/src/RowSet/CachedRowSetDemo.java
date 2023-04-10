/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RowSet;

import java.sql.*;
import javax.sql.rowset.*;
public class CachedRowSetDemo {
    public static void main(String[] args) throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select*from students");
        
        RowSetFactory rsf=RowSetProvider.newFactory();
        CachedRowSet crs=rsf.createCachedRowSet();
        crs.populate(rs);
        

        
        while(crs.next()){
            System.out.println(crs.getInt(1)+" "+crs.getString(2)+" "+crs.getString(3));
        }
             
        stmt.close();
        con.close();
        
    }
}
