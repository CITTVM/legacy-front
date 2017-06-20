/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.DetallePrestamoDAO;
import cl.model.pojos.DetallePrestamo;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author camilo
 */
@WebService(serviceName = "DetallePrestamoWS")
public class DetallePrestamoWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarDetallePrestamo")
    public List<DetallePrestamo> ListarDetalles() {
        DetallePrestamoDAO detalledao = new DetallePrestamoDAO();
        List<DetallePrestamo> listaDetalles = detalledao.findAll();
        return listaDetalles;
    }
    
}
