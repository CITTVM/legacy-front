/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.ProyectoDAO;
import cl.model.pojos.Proyecto;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author camilo
 */
@WebService(serviceName = "ProyectoWS")
public class ProyectoWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarProyectos")
    public List<Proyecto> ListarProyectos() {
        ProyectoDAO proyectodao = new ProyectoDAO();
        List<Proyecto> listaProyectos = proyectodao.findAll();
        return listaProyectos;
    }
}
