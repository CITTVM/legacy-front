
package Controllers;

import Application.InscripcionesWorkshop;
import DAO.InscripcionesDAO;
import DAO.WorkshopDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jordan
 */
@WebServlet(name = "controllerCrearInscripcion", urlPatterns = {"/controllerCrearInscripcion"})
public class controllerCrearInscripcion extends HttpServlet {

    
    int id =0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        id = Integer.parseInt(request.getParameter("id"));
        
        
        request.getRequestDispatcher("/crearInscripcion.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, String> mapMensajes = new HashMap<>();  
        InscripcionesWorkshop inscripcion = new InscripcionesWorkshop();
        
        
        
         String nombre= request.getParameter("nombres");
         if (nombre.isEmpty()) {
                mapMensajes.put("Nombre", "Debe Ingresar Nombre!!");
            } else {
                inscripcion.setNombreAsistente(nombre);
            }
         
         
         String apellidos= request.getParameter("apellidos");
         if (apellidos.isEmpty()) {
                mapMensajes.put("Apellidos", "Debe Ingresar Apellidos!!");
            } else {
                inscripcion.setApellidosAsistente(apellidos);
            }
         
         String rut = request.getParameter("rut");
        if (rut.isEmpty()) {
                mapMensajes.put("Rut", "Debe Ingresar Rut!!");
            } else {
                inscripcion.setRutAsistente(rut);
            }
        inscripcion.setEstado(true);
        inscripcion.setFecha(new java.sql.Date(System.currentTimeMillis()));
       
       // int id = Integer.parseInt(request.getParameter("id"));
        
       
        if (id!=0) {
            inscripcion.setIdWorkshop(id);
        }else{
           mapMensajes.put("ID", "No se encuentra Id del Workshop seleccionado"); 
        }
        
        if (mapMensajes.isEmpty()) {
            InscripcionesDAO inscripciondao = new InscripcionesDAO();
            inscripciondao.ingresarInscrito(inscripcion);
            
            WorkshopDAO workshopdao = new WorkshopDAO();
            request.setAttribute("workshops", workshopdao.findAll());
            
            request.getRequestDispatcher("/listarWorkshops.jsp").forward(request, response); 
          
        }
        
        
    }

}
