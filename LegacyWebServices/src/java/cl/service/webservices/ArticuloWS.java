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
 * @author Jonathan
 */
@WebService(serviceName = "ArticuloWS")
public class ArticuloWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarArticulos")
    public List<Articulo> ListarArticulos() {
        ArticuloDAO articulosdao = new ArticuloDAO();
        List<Articulo> listaArticulos = articulosdao.findAll();
        return listaArticulos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "observacion") String observacion, @WebParam(name = "marca") String marca, @WebParam(name = "modelo") String modelo, @WebParam(name = "numero_serie") String numero_serie, @WebParam(name = "estado") boolean estado, @WebParam(name = "id_track") int id_track) {
        ArticuloDAO articulodao = new ArticuloDAO();
        Articulo articulo = new Articulo();
        System.out.println(descripcion);
        articulo.setIdArticulo(null);
        articulo.setDescripcion(descripcion);
        articulo.setEstado(estado);
        articulo.setIdTrack(id_track);
        articulo.setMarca(marca);
        articulo.setModelo(modelo);
        articulo.setNombre(nombre);
        articulo.setNumeroSerie(numero_serie);
        articulo.setObservacion(observacion);
        articulodao.ingresar(articulo);
        return null;
    }
    
    
}
