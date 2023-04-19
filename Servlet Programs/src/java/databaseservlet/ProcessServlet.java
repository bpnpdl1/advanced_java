/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class ProcessServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
            
            PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
               
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setString(3,address);
            
            int a=pst.executeUpdate();
            out.println(a+" Inserted Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
