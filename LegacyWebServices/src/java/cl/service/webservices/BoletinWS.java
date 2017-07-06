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
    
    /**
     * Metodo para hacer ingresos de nuevos boletines al servicio landing legacy.
     * @param boletin
     * @return 
     */
    @WebMethod(operationName = "AgregarBoletin")
    public boolean AgregarBoletin(Boletin boletin) {
        BoletinDAO boletindao = new BoletinDAO();
        try {
            boletindao.ingresar(boletin);
            return true;
        } catch (Exception e) {
            String razon = e.toString();
            return false;
        }
    }
    
    /**
     * Metodo para hacer modificaciones de boletines existentes del servicio 
     * landing legacy.
     * @param boletin
     * @return 
     */
    @WebMethod(operationName = "ModificarBoletin")
    public boolean ModificarBoletin(Boletin boletin) {
        BoletinDAO boletindao = new BoletinDAO();
        try {
            boletindao.modificar(boletin);
            return true;
        } catch (Exception e) {
            String razon = e.toString();
            return false;
        }
    }
    
    /**
     * Metodo para hacer eliminaciones de boletines existentes del servicio 
     * landing legacy.
     * @param codigo
     * @return 
     */
    @WebMethod(operationName = "EliminarBoletin")
    public boolean EliminarBoletin(int codigo) {
        BoletinDAO boletindao = new BoletinDAO();
        try {
            Boletin boletinAEliminar = boletindao.consultar(codigo);
            boletindao.eliminar(codigo);
            return true;
        } catch (Exception e) {
            String razon = e.toString();
            return false;
        }
    }
    
    /**
     * Metodo para hacer consulta de un boletin existente del servicio 
     * landing legacy.
     * @param codigo
     * @return 
     */
    @WebMethod(operationName = "BuscarUnBoletin")
    public boolean BuscarUnBoletin(int codigo) {
        BoletinDAO boletindao = new BoletinDAO();
        try {
            boletindao.consultar(codigo);
            return true;
        } catch (Exception e) {
            String razon = e.toString();
            return false;
        }
    }
}
