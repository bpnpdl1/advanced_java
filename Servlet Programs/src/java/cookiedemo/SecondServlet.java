/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cookiedemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse  response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        
       Cookie ck[]=request.getCookies();
   

            out.println("\n Welcome "+ck[0].getValue());
            
       
      
       
       out.close();
        
       
        
    }
    
}
 