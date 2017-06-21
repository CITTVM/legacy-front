/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.BoletinDAO;
import cl.model.pojos.Boletin;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jonathan
 */
@WebService(serviceName = "BoletinWS")
public class BoletinWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarBoletines")
    public List<Boletin> ListarBoletines() {
        BoletinDAO boletinesdao = new BoletinDAO();
        List<Boletin> listaBoletines = boletinesdao.findAll();
        return listaBoletines;
    }
    
}
