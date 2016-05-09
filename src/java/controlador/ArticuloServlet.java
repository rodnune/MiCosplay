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
import modelo.Articulo;
import modelo.ArticuloDB;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class ArticuloServlet extends HttpServlet {

    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String nombre = request.getParameter("nombre");
            String precioString = request.getParameter("precio");
            double precio = Double.parseDouble(precioString);
            String descripcion = request.getParameter("descripcion");  
            HttpSession session = (HttpSession) request.getSession();
            Usuario usuario =  (Usuario) session.getAttribute("user");            

           
            
        try {
             Articulo article = new Articulo(nombre,precio,descripcion,usuario);
            ArticuloDB.insertarArticulo(article);
            HttpSession sessionArticle = request.getSession();
                        sessionArticle.setAttribute("article", article);
                        
                         String url = "/catalogoPrincipal.jsp";
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
                    dispatcher.forward(request, response);
                        
        } catch (SQLException ex) {
            Logger.getLogger(ArticuloServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArticuloServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

}
