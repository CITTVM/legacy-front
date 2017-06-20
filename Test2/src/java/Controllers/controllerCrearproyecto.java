
package Controllers;

import Application.Carrera;
import Application.Proyecto;
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
        
       // List<String> lstLideres =
                
        
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
         
         
         /*   --No se rescata ya que predeterminado el proyecto esta activo , pero este puede ser dado de baja al ser terminado
         
         String strEstado = request.getParameter("estado");
         if(strEstado.isEmpty()){
             mapMensajes.put("Estado_proyecto", "Debe Selecciona Estado!!");
         }else{
             Boolean estado=  Boolean.getBoolean(strEstado)  ;
             proyecto.setEstado(estado);
         }
         */
         
         
         String nameLider= request.getParameter("lider");
        //nameLider = nombre+" "+apelPat
         //consultar id con el nombre para luego enviar el id a bd
       
         
         
         
         
       
         
            // ejemplo : request.setAttribute("lstPedidos", service.buscarPedidoProductoPedidoDetalle(rut));
             request.getRequestDispatcher("/crearProyecto.jsp").forward(request, response);  
        
        
        
        
        
        
        
        
        
        
    }

    

}
