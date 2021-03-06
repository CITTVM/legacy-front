
package Controllers;

import Application.Carrera;
import Application.Cuenta;
import Application.Usuario;
import DAO.CarreraDAO;
import DAO.CuentaDAO;
import DAO.TrackDAO;
import DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.rmi.server.Dispatcher;

/**
 *
 * @author jordan
 */
@WebServlet(name = "controllerCrearCuenta", urlPatterns = {"/controllerCrearCuenta"})
public class controllerCrearCuenta extends HttpServlet {

    
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
          CarreraDAO carreradao= new CarreraDAO();
          request.setAttribute("carreras", carreradao.findAll());
          TrackDAO trackdao= new TrackDAO();
          request.setAttribute("tracks", trackdao.findAll());
        } catch (Exception e) {
        }
                     
        
          request.getRequestDispatcher("/crearCuenta.jsp").forward(request, response);   
          
          
          
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Map<String, String> mapMensajes = new HashMap<>(); 
        
        Cuenta cuenta= new Cuenta();
        
        String username= request.getParameter("user-name");
         if (username.isEmpty()) {
                mapMensajes.put("Nombre de usuario", "Debe Ingresar correo !!");
            } else {
                cuenta.setNickname(username);
            }
         String pass = request.getParameter("password");
         String pass2= request.getParameter("password-repeat");
         
         if(pass.isEmpty()){
             mapMensajes.put("Password", "Debe Ingresar Password!!");
         }
         if(pass2.isEmpty()){
             mapMensajes.put("Reingresar Password", "Debe Re-Ingresar Password!!");
         }
         if(pass.equalsIgnoreCase(pass2)){
            cuenta.setPass(pass2);
         }else{
            mapMensajes.put("Password No coincide", "Password debe coincidir!!"); 
         }
         
         String tipoCuenta="Basico";
         
         cuenta.setTipoCuenta(tipoCuenta);
         
         
         Usuario usuario=new Usuario();
         String rut=request.getParameter("rut");
         if(rut.isEmpty()){
            mapMensajes.put("Rut", "Debe Ingresar su rut !!");  
         }else{
             usuario.setRut(rut);
         }
         
         String nombre=request.getParameter("nombre");
         if(nombre.isEmpty()){
            mapMensajes.put("Nombre", "Debe Ingresar su Nombre !!");  
         }else{
             usuario.setNombre(nombre);
         }
         
         String apelpat=request.getParameter("apelpat");
         if(apelpat.isEmpty()){
            mapMensajes.put("ApellidoPaterno", "Debe Ingresar su Apellido paterno !!");  
         }else{
             usuario.setApellidoPaterno(apelpat);
         }
         
         String apelmat=request.getParameter("apelmat");
         if(apelmat.isEmpty()){
            mapMensajes.put("ApellidoMaterno", "Debe Ingresar su Apellido Materno !!");  
         }else{
             usuario.setApellidoMaterno(apelmat);
         }
         
         
         int carrera=Integer.parseInt(request.getParameter("carrera"));
         if (carrera >0) {
            usuario.setIdCarrera(carrera);
        }else{
             mapMensajes.put("Carrera", "Debe Ingresar una Carrera !!"); 
         }         
         
        
         int track=Integer.parseInt(request.getParameter("track"));
         if (track>0) {
            usuario.setIdTrack(track);
        }else{
             mapMensajes.put("Track", "Debe Ingresar un Track !!"); 
         }         
         
         
                  
         if (mapMensajes.isEmpty()) {
               CuentaDAO cuentaDao= new CuentaDAO();
               cuentaDao.ingresar(cuenta); 
               
               
               
              
                       
                       
                       
                       
               UsuarioDAO usuarioDao = new UsuarioDAO();
             List<Cuenta> cuen= cuentaDao.find(username);
             for (Cuenta cu:cuen) {
                 usuario.setIdCuenta(cu.getIdCuenta());
             }
               usuarioDao.ingresarUsuario(usuario);
               
               
               
             
             request.getRequestDispatcher("/crearCuenta.jsp").forward(request, response);
         
         
         
         
        
    }else{
             
            request.getRequestDispatcher("/crearCuenta.jsp").forward(request, response); 
         }

    

}
}
