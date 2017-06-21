
package Controllers;

import Application.Articulo;
import DAO.ArticuloDAO;
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
@WebServlet(name = "controllerCrearArticulo", urlPatterns = {"/controllerCrearArticulo"})
public class controllerCrearArticulo extends HttpServlet {

   
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         Map<String, String> mapMensajes = new HashMap<>(); 
        Articulo articulo=new Articulo();
        articulo.setCategoria(" ");
        articulo.setDescripcion(" ");
        articulo.setEstado(true);
        articulo.setIdTrack(1);
        articulo.setMarca(" ");
        articulo.setNombre(" ");
        articulo.setIdArticulo(null);
        
        
         String nombre= request.getParameter("nombre");
         if (nombre.isEmpty()) {
                mapMensajes.put("Nombre_Articulo", "Debe Ingresar Nombre!!");
            } else {
                articulo.setNombre(nombre);
            }
         
        String descripcion= request.getParameter("descripcion");
         if (descripcion.isEmpty()) {
                mapMensajes.put("Descripcion_Articulo", "Debe Ingresar Descripcion!!");
            } else {
                articulo.setDescripcion(descripcion);
            }
        
         String observacion= request.getParameter("observacion");
         if (observacion.isEmpty()) {
                mapMensajes.put("Observacion", "Debe Ingresar observacion!!");
            } else {
                articulo.setObservacion(observacion);
            }
        
         String marca= request.getParameter("marca");
         if (marca.isEmpty()) {
                mapMensajes.put("Marca", "Debe Ingresar marca!!");
            } else {
                articulo.setMarca(marca);        
           }
         String modelo= request.getParameter("modelo");
         if (modelo.isEmpty()) {
                mapMensajes.put("Modelo", "Debe Ingresar modelo!!");
            } else {
                articulo.setModelo(modelo);
                
            }
         
         String numserie= request.getParameter("numeroserie");
         if (numserie.isEmpty()) {
                mapMensajes.put("NumSerie", "Debe Ingresar numero de serie");
            } else {
                articulo.setNumeroSerie(numserie);
                
            }
         
    //al crear articulo de manera predeterminada esta disponible
         articulo.setEstado(true);
         
         
         
         String categoria= request.getParameter("categoria");
         if (categoria.isEmpty()) {
                mapMensajes.put("Categoria", "Debe Ingresar categoria");
            } else {
                articulo.setCategoria(categoria);
            }
         
         
         if (mapMensajes.isEmpty()) {
                
             ArticuloDAO articuloDao= new ArticuloDAO();
             
             articuloDao.ingresar(articulo);
             
             request.getRequestDispatcher("/crearArticulo.jsp").forward(request, response);
             
             
            }
         
}
}
