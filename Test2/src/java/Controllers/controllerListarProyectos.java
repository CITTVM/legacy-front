
package Controllers;

import DAO.ProyectoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jordan
 */
@WebServlet(name = "controllerListarProyectos", urlPatterns = {"/controllerListarProyectos"})
public class controllerListarProyectos extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        ProyectoDAO proyectodao= new ProyectoDAO();
        request.setAttribute("proyectos", proyectodao.findAll());        
        
        request.getRequestDispatcher("/listarProyectos.jsp").forward(request, response);  
        
       
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
