
package Controllers;

import DAO.ArticuloDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shadoword
 */
@WebServlet(name = "controllerListarArticulo", urlPatterns = {"/controllerListarArticulo"})
public class controllerListarArticulo extends HttpServlet {

  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArticuloDAO  articuloDao = new ArticuloDAO();
        
        request.setAttribute("articulos", articuloDao.findAll());     
              
                
       request.getRequestDispatcher("/listarArticulo.jsp").forward(request, response);  
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
    }

    
    

}
