/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.PrestamoDAO;
import cl.model.pojos.Prestamo;
import java.util.Date;
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
    
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "fechaInicio") Date fechaInicio, @WebParam(name = "fechaTermino") Date fechaTermino, @WebParam(name="estado") boolean estado, @WebParam(name = "rutSolicitante") String rutSolicitante, @WebParam(name = "nombreSolicitante") String nombreSolicitante, @WebParam(name = "apellidosSolicitante") String apellidosSolicitante, @WebParam(name = "idEncargado") int idEncargado){
        PrestamoDAO prestamodao = new PrestamoDAO();
        Prestamo prestamo = new Prestamo();
        System.out.println("Préstamo para "+rutSolicitante);
        prestamo.setFechaInicio(fechaInicio);
        prestamo.setFechaTermino(fechaTermino);
        prestamo.setEstado(estado);
        prestamo.setRutSolicitante(rutSolicitante);
        prestamo.setNombreSolicitante(nombreSolicitante);
        prestamo.setApellidosSolicitante(apellidosSolicitante);
        prestamo.setIdEncargado(idEncargado);
        prestamodao.ingresarPrestamo(prestamo);
        return null;
    }
    
   @WebMethod(operationName = "modificar")
    public String modificar(@WebParam(name="estado") boolean estado){
        PrestamoDAO prestamodao = new PrestamoDAO();
        Prestamo prestamo = new Prestamo();
        System.out.println("Se actualizó el estado del préstamo");
        prestamo.setFechaInicio(prestamo.getFechaInicio());
        prestamo.setFechaTermino(prestamo.getFechaTermino());
        prestamo.setEstado(estado);
        prestamo.setRutSolicitante(prestamo.getRutSolicitante());
        prestamo.setNombreSolicitante(prestamo.getNombreSolicitante());
        prestamo.setApellidosSolicitante(prestamo.getApellidosSolicitante());
        prestamo.setIdEncargado(prestamo.getIdEncargado());
        prestamodao.modificarPrestamo(prestamo);
        return null;
    }
}
