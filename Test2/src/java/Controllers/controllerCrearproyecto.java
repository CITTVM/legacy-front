
package Controllers;

import Application.Carrera;
import Application.Proyecto;
import DAO.CarreraDAO;
import DAO.ProyectoDAO;
import DAO.TrackDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.faces.convert.DateTimeConverter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jordan
 */
@WebServlet(name = "controllerCrearproyecto", urlPatterns = {"/controllerCrearproyecto"})
public class controllerCrearproyecto extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       try {
           
           UsuarioDAO usuariodao = new UsuarioDAO();           
          request.setAttribute("usuarios", usuariodao.findAll());
          
        } catch (Exception e) {
        }
                     
        
          request.getRequestDispatcher("/crearProyecto.jsp").forward(request, response);   
                
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
         Map<String, String> mapMensajes = new HashMap<>();      
         
         Proyecto proyecto = new Proyecto();
         
         String nombre= request.getParameter("nombre");
         if (nombre.isEmpty()) {
                mapMensajes.put("Nombre_proyecto", "Debe Ingresar Nombre!!");
            } else {
                proyecto.setNombre(nombre);
            }
         
         
         String descripcion=request.getParameter("descripcion");
         if (descripcion.isEmpty()) {
                mapMensajes.put("Descripcion_proyecto", "Debe Ingresar Descripcion!!");
            } else {
                proyecto.setDescripcion(descripcion);
            }
         
         
         //se debe mandar un tipo date a BD pendiente de parse*****
         String fecha=request.getParameter("fecha");         
         
     
         
         int idlider= Integer.parseInt(request.getParameter("lider"));
         
         if (idlider>0) {
            proyecto.setIdJefe(idlider);
        }else{
             mapMensajes.put("Lider", "Debe Seleccionar un Lider!!");
         }
         proyecto.setFechaInicio(new java.sql.Date(System.currentTimeMillis()) );
         
         if (mapMensajes.isEmpty()) {
            
             ProyectoDAO proyectodao = new ProyectoDAO();
             proyectodao.ingresarProyecto(proyecto);
             
        }else{
             request.getRequestDispatcher("/crearProyecto.jsp").forward(request, response); 
         }
         
       
         
            // ejemplo : request.setAttribute("lstPedidos", service.buscarPedidoProductoPedidoDetalle(rut));
             request.getRequestDispatcher("/crearProyecto.jsp").forward(request, response);  
        
        
        
        
        
        
        
        
        
        
    }

    

}
