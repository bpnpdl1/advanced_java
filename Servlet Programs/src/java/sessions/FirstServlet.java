/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessions;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String name=request.getParameter("un");
        
        HttpSession session=request.getSession();
        session.setAttribute("un",name);
    
        out.println("<form action='Session_SecondServlet' method='post' ><br>");
        out.println("<input type='submit' value='go'>");
        out.println("</form>");
    }
    
}
