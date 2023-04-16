   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HandleRequest extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String name=request.getParameter("un");
        
        out.println("<html><body>");
        out.println("Welcome " +name);
        out.println("</body></html>");
    }
            
}
