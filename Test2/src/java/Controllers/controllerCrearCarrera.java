package Controllers;

import Application.Carrera;
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
@WebServlet(urlPatterns = {"/controllerCrearCarrera"})
public class controllerCrearCarrera extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         Map<String, String> mapMensajes = new HashMap<>();      
         
         Carrera carrera = new Carrera();
         String nombre= request.getParameter("nombre");
         if (nombre.isEmpty()) {
                mapMensajes.put("Nombre_carrera", "Debe Ingresar Nombre!!");
            } else {
                carrera.setNombre(nombre);
            }
         String escuela=request.getParameter("escuela");
         if (escuela.isEmpty()) {
                mapMensajes.put("Escuela_carrera", "Debe Ingresar Escuela!!");
            } else {
                carrera.setEscuela(escuela);
            }
         
       
         
            // ejemplo : request.setAttribute("lstPedidos", service.buscarPedidoProductoPedidoDetalle(rut));
             request.getRequestDispatcher("/crearCarrera.jsp").forward(request, response);    
         
    }

 

}
