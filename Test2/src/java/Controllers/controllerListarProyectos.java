
package Controllers;

import Application.ParticipantesProyectos;
import Application.Usuario;
import DAO.ParticipantesDAO;
import DAO.ProyectoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        request.setAttribute("proyectos", proyectodao.findAllCustom());        
        
        request.getRequestDispatcher("/listarProyectos.jsp").forward(request, response);  
        
       
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Map<String, String> mapMensajes = new HashMap<>(); 
        ParticipantesProyectos participante = new ParticipantesProyectos();
        
        
        HttpSession session = request.getSession();
       Usuario usuarioActivo= (Usuario) session.getAttribute("usuarioActivo");
       
       
       int id = Integer.parseInt(request.getParameter("id"));
        if (id>0) {
            participante.setIdProyecto(id);
                      
        }else{
            mapMensajes.put("ID_Proyecto", "No se puede verificar el id del proyecto seleccionado!!");
        }
        
        
        if (usuarioActivo.getIdUsuario()!=null) {
            participante.setIdUsuario(usuarioActivo.getIdUsuario());
        }else{
            mapMensajes.put("ID_Usuario", "No se puede verificar el id del Usuario seleccionado!!");
 
        }
       
        
        if (mapMensajes.isEmpty()) {
            
            
            ParticipantesDAO participantedao = new ParticipantesDAO();
             participantedao.ingresarParticipante(participante);
            
            request.getRequestDispatcher("/listarProyectos.jsp").forward(request, response); 
            
            
        }
        
    }


}
