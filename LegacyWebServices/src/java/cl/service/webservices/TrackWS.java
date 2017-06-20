/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.TrackDAO;
import cl.model.pojos.Track;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author camilo
 */
@WebService(serviceName = "TrackWS")
public class TrackWS {
    
    @WebMethod(operationName = "ListarTracks")
    public List<Track> ListarTracks() {
        TrackDAO trackdao = new TrackDAO();
        List<Track> listaTracks = trackdao.findAll();
        return listaTracks;
    }
    
}
