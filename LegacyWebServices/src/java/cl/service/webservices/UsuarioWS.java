/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.UsuarioDAO;
import cl.model.pojos.Usuario;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author camilo
 */
@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {
    
    @WebMethod(operationName = "ListarUsuarios")
    public List<Usuario> ListarUsuarios() {
        UsuarioDAO usuariodao = new UsuarioDAO();
        List<Usuario> listaUsuarios = usuariodao.findAll();
        return listaUsuarios;
    }
    
}
