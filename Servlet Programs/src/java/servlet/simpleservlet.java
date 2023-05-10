 package servlet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class simpleservlet extends HttpServlet{
    
        public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html> <body>");
        out.println("My First App");
        out.println("</body> </html>");
        out.close();
    }
        
    }
