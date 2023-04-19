
package sessions;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
 
 HttpSession session=request.getSession();
 String name=(String)session.getAttribute("un");
 
 out.println(name);
 
             } 
    
}
