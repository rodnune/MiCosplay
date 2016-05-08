
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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import modelo.UsuarioDB;


public class AjustesServlet extends HttpServlet {

 
   	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            
            HttpSession session = (HttpSession) request.getSession();
            Usuario usuario =  (Usuario) session.getAttribute("user");
            String newPassword = (String) request.getParameter("newPassword");
            String newDescription = (String) request.getParameter("nDescription");
            usuario.setPass(newPassword);
            usuario.setDesc(newDescription);
               try {
                   UsuarioDB.actualizarPassword(usuario.getNick(), usuario.getPass());
                   UsuarioDB.actualizarDescripcion(usuario.getNick(), usuario.getDesc());
                   String url = "/login.html";
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
                    dispatcher.forward(request, response);
             
               } catch (SQLException ex) {
                   Logger.getLogger(AjustesServlet.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(AjustesServlet.class.getName()).log(Level.SEVERE, null, ex);
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

