/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.PrestamoDAO;
import cl.model.pojos.Prestamo;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author camilo
 */
@WebService(serviceName = "PrestamoWS")
public class PrestamoWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarPrestamos")
    public List<Prestamo> ListarPrestamos() {
        PrestamoDAO prestamodao = new PrestamoDAO();
        List<Prestamo> listaPrestamos = prestamodao.findAll();
        return listaPrestamos;
    }
    
}
