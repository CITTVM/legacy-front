/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.InscripcionesDAO;
import cl.model.pojos.InscripcionesWorkshop;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author camilo
 */
@WebService(serviceName = "InscripcionesWS")
public class InscripcionesWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarInscripcionesWorkshop")
    public List<InscripcionesWorkshop> ListarInscripciones() {
        InscripcionesDAO inscripcionesdao = new InscripcionesDAO();
        List<InscripcionesWorkshop> listaInscripciones = inscripcionesdao.findAll();
        return listaInscripciones;
    }
    
}
