/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.UsuarioDB;


public class LoginServlet extends HttpServlet {

 
   	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
               try {
                   response.setContentType("text/html;charset=UTF-8");
                   String nick = request.getParameter("nick");
                   String pass = request.getParameter("pass");
                   
                   if(UsuarioDB.comprobarUsuario(nick, pass)){
                       response(response,"Logueado");
                   }else{
                       response(response,"Datos errones");
                   }
               } catch (SQLException ex) {
                   Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
               }
		
	}
        
        private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}

 

}
