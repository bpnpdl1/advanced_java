/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cookiedemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String name=request.getParameter("un");
        out.println("Hello "+name);
        
        Cookie ck=new Cookie("n",name);
        response.addCookie(ck);
        
        out.println("<form action='SecondServlet' method='post'>");
        out.println("<input type='submit' value='go'>");
        out.println("</form>");
        
       
    }
}
