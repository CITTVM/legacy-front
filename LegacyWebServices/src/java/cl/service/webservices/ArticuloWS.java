/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.ArticuloDAO;
import cl.model.pojos.Articulo;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jordan Silva O
 */
@WebService(serviceName = "ArticuloWS")
public class ArticuloWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarArticulos")
    public List<Articulo> ListarArticulos() {
        ArticuloDAO articuloDAO = new ArticuloDAO();
        List<Articulo> listaArticulos = articuloDAO.findAll();
        return listaArticulos;
    }
}
