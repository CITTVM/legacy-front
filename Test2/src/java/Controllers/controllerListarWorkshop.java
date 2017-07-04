
package Controllers;

import DAO.WorkshopDAO;
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
@WebServlet(name = "controllerListarWorkshop", urlPatterns = {"/controllerListarWorkshop"})
public class controllerListarWorkshop extends HttpServlet { 
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        WorkshopDAO workshopdao = new WorkshopDAO();
        request.setAttribute("workshops", workshopdao.findAll());
        
        
        request.getRequestDispatcher("/listarWorkshops.jsp").forward(request, response);  
        
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    

}
