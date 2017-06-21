
package Controllers;

import Application.Track;
import DAO.CarreraDAO;
import DAO.TrackDAO;
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
        
        String nameLider = request.getParameter("lider");
        //nameLider = nombre+" "+apelPat
         //consultar id con el nombre para luego enviar el id a bd
        track.setIdLider(1);                   
                
                
        
        
        
        if (mapMensajes.isEmpty()) {
                
                 TrackDAO trackDao= new TrackDAO();
                 trackDao.ingresarTrack(track);
             
             request.getRequestDispatcher("/crearTrack.jsp").forward(request, response);
        
           
        
        }   
    }

    
}
