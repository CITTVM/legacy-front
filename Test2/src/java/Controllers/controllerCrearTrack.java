
package Controllers;

import Application.Track;
import DAO.CarreraDAO;
import DAO.TrackDAO;
import DAO.UsuarioDAO;
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
@WebServlet(name = "controllerCrearTrack", urlPatterns = {"/controllerCrearTrack"})
public class controllerCrearTrack extends HttpServlet {

    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
           
           UsuarioDAO usuariodao = new UsuarioDAO();           
          request.setAttribute("usuarios", usuariodao.findAll());
          
        } catch (Exception e) {
        }
                     
        
          request.getRequestDispatcher("/crearTrack.jsp").forward(request, response);   
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Map<String, String> mapMensajes = new HashMap<>(); 
        
        
        Track track = new Track();
        
        String nombre= request.getParameter("nombre");
         if (nombre.isEmpty()) {
                mapMensajes.put("Nombre_track", "Debe Ingresar Nombre!!");
            } else {
                track.setNombre(nombre);
            }
         
         
        String descripcion = request.getParameter("descripcion");
        if(descripcion.isEmpty()){
            mapMensajes.put("Descripcion_track", "Debe Ingresar Descripcion!!");
        }else{
            track.setDescripcion(descripcion);            
        }
        
        
         int idlider= Integer.parseInt(request.getParameter("lider"));
         
         if (idlider>0) {
            track.setIdLider(idlider);
        }else{
             mapMensajes.put("Lider", "Debe Seleccionar un Lider!!");
         }                  
                
                
        
        
        
        if (mapMensajes.isEmpty()) {
                
                 TrackDAO trackDao= new TrackDAO();
                 trackDao.ingresarTrack(track);
             
             request.getRequestDispatcher("/crearTrack.jsp").forward(request, response);
        
           
        
        }   
    }

    
}
