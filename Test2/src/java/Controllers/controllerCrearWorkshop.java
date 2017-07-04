
package Controllers;

import Application.Workshop;
import DAO.WorkshopDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
@WebServlet(name = "controllerCrearWorkshop", urlPatterns = {"/controllerCrearWorkshop"})
public class controllerCrearWorkshop extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
         request.getRequestDispatcher("/crearWorkshop.jsp").forward(request, response); 
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         Map<String, String> mapMensajes = new HashMap<>();  
        
         
         Workshop workshop = new Workshop();
         
         
         String nombre= request.getParameter("nombre");
         if (nombre.isEmpty()) {
                mapMensajes.put("Nombre", "Debe Ingresar Nombre!!");
            } else {
                workshop.setNombre(nombre);
            }
         
         
         String descripcion=request.getParameter("descripcion");
         if (descripcion.isEmpty()) {
                mapMensajes.put("Descripcion", "Debe Ingresar Descripcion!!");
            } else {
                workshop.setDescripcion(descripcion);
            }
         
         String nombreInstructor= request.getParameter("nombreinstructor");
         if (nombreInstructor.isEmpty()) {
                mapMensajes.put("Nombre_Instructor", "Debe Ingresar Nombre del Instructor!!");
            } else {
                workshop.setNombreInstructor(nombreInstructor);
            }
         
          int cupos= Integer.parseInt(request.getParameter("cupos"));
         if (cupos<=0) {
                mapMensajes.put("Cupos", "Debe Ingresar Cupos para el Workshop!!");
            } else {
                workshop.setCupos(cupos);
            }
         workshop.setFecha(new java.sql.Date(System.currentTimeMillis()));
         workshop.setEstado(true);
         
         /*
        try {             
            
            
             SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");               
               String strfecha = request.getParameter("fecha");          
                
               Date fecha= formatter.parse(strfecha);                
                
                    if (fecha==null) {
                        mapMensajes.put("Fecha", "Debe Ingresar Fecha para el Workshop!!");
                    } else {
                         workshop.setFecha(fecha);
                    }     
                    
        } catch (Exception e) {
            mapMensajes.put("Fecha", "Problemas con Parse de fecha!!");
        }
         */
         
         
         
        if (mapMensajes.isEmpty()) {
            WorkshopDAO workshopdao= new WorkshopDAO();
            
            workshopdao.ingresarWorkshop(workshop);
            
            
             request.getRequestDispatcher("/crearWorkshop.jsp").forward(request, response); 
            
            
            
        }
        
        
        
         
    }

    

}
