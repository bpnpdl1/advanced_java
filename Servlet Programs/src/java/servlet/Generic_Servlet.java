/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import java.io.*;
import javax.servlet.*;
public class Generic_Servlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    out.println("<html><body>");
    out.println("<b>Hello Generic Servlet");
    out.println("</body></html>");
        
    }
   
    
}
