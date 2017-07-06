/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Application.Cuenta;
import DAO.CuentaDAO;
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
import javax.servlet.http.HttpSession;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author jordan
 */
@WebServlet(name = "controllerLogin", urlPatterns = {"/controllerLogin"})
public class controllerLogin extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Map<String, String> mapMensajes = new HashMap<>(); 
        CuentaDAO account= new CuentaDAO();
       
       
       String username= request.getParameter("user-name");
       String pass = request.getParameter("password");
       
       
       
         if (username.isEmpty()) {
                mapMensajes.put("Correo", "Debe Ingresar correo !!");
            }       
         if(pass.isEmpty()){
             mapMensajes.put("Password", "Debe Ingresar Password!!");
         }
       
        if(mapMensajes.isEmpty()){
            
        List<Cuenta> cuenta = account.find(username);
            
           Cuenta BDuser=new Cuenta();
            
            for(Cuenta cuen : cuenta){
                
                BDuser.setIdCuenta(cuen.getIdCuenta());
                BDuser.setNickname(cuen.getNickname());
                BDuser.setPass(cuen.getPass());
                BDuser.setTipoCuenta(cuen.getTipoCuenta());           
                
            }
            
            try {
                
               
            if (BDuser.getNickname().equalsIgnoreCase(username)&&BDuser.getPass().equals(pass)) {               
                

               HttpSession session = request.getSession();
               session.setAttribute("usuarioActivo", BDuser);
                
               /* 
                switch (BDuser.getTipoCuenta()) {
                    case "Administrador":
                        request.getRequestDispatcher("/adminnistracionLobby.jsp").forward(request, response);
                        break;
                    case "Coordinador":
                        
                        request.getRequestDispatcher("/coordinadorLobby.jsp").forward(request, response);
                        break;
                    case "Jefe":
                        request.getRequestDispatcher("/adminCarreraLobby.jsp").forward(request, response);
                        break;
                    case "Basico":
                        request.getRequestDispatcher("/integranteLobby.jsp").forward(request, response);
                        break;
                    default:
                        request.getRequestDispatcher("/login.jsp").forward(request, response);
                }
                */
               
               String tipoCuenta =BDuser.getTipoCuenta();
               
                if (tipoCuenta.equalsIgnoreCase("Basico")) {
                   // request.getRequestDispatcher("/integrante/integranteLobby.jsp").forward(request, response);
                response.sendRedirect("/Test2/integrante/integranteLobby.jsp");
                }else if (tipoCuenta.equalsIgnoreCase("jefe")) {
                    response.sendRedirect("/Test2/integrante/adminCarreraLobby.jsp");
                }else if (tipoCuenta.equalsIgnoreCase("coordinador")) {
                    response.sendRedirect("/Test2/integrante/coordinadorLobby.jsp");
                }else if (tipoCuenta.equalsIgnoreCase("administrador")) {
                    response.sendRedirect("/Test2/integrante/adminnistracionLobby.jsp");
                }else{
                    response.sendRedirect("/login.jsp");
                }
               
               
               
               
            }
            
            
            
        
                
                
                
            } catch (Exception e) {
                
                String razon = e.toString();
                
            }
           
 
         
    
        
        
    }

    
    

}
}



/*
It should be

session.getAttribute("usuarioActivo")




I suggest you to use JavaServer Pages Standard Tag Library or Expression Language instead of Scriplet that is more easy to use and less error prone.


${sessionScope.MyAttribute}


or


//no es necesaria est linea ya que esta lista en todos los jsp para que funcionencon jstl
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:out value="${sessionScope.usuarioActivo}" />



you can try ${usuarioActivo}, ${sessionScope['usuarioActivo']} as well.




*/