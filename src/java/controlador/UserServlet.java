package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author Usuario
 */
public class UserServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
              String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String nick = request.getParameter("nick");
            String localidad = request.getParameter("localidad");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
          
                   if(!UsuarioDB.comprobarNick(nick, password)){
                        Usuario user = new Usuario(nombre,apellidos,nick,localidad,email,password);
                        HttpSession session = request.getSession();
                        session.setAttribute("user", user);
                       String url = "/perfil.jsp";
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
                    dispatcher.forward(request, response);
                   }else{
                       response.sendRedirect("login.html");
                   }  } catch (SQLException ex) {
                   Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
               }
    }
}
    
    



