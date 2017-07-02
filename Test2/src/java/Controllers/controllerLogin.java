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
    
            if (BDuser.getNickname().equalsIgnoreCase(pass)&&BDuser.getPass().equals(pass)) {
                switch (BDuser.getTipoCuenta()) {
                    case "Administrador":
                        request.getRequestDispatcher("/admin.jsp").forward(request, response);
                        break;
                    case "Coordinador":
                        
                        request.getRequestDispatcher("/coordinador.jsp").forward(request, response);
                        break;
                    case "Jefe":
                        request.getRequestDispatcher("/jefe.jsp").forward(request, response);
                        break;
                    case "Basico":
                        request.getRequestDispatcher("/basic.jsp").forward(request, response);
                        break;
                    default:
                        request.getRequestDispatcher("/login.jsp").forward(request, response);
                }
            }
            
            
            
        }else{
            
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        
        
    }

    
    

}
