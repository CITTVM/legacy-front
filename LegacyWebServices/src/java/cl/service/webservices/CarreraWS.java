/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.CarreraDAO;
import cl.model.pojos.Carrera;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author camilo
 */
@WebService(serviceName = "CarreraWS")
public class CarreraWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarCarreras")
    public List<Carrera> ListarCarreras() {
        CarreraDAO carreradao = new CarreraDAO();
        List<Carrera> listaCarreras = carreradao.findAll();
        return listaCarreras;
    }
    
}
