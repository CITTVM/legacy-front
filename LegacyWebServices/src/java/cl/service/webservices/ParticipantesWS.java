/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.ParticipantesDAO;
import cl.model.pojos.ParticipantesProyectos;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author camilo
 */
@WebService(serviceName = "ParticipanteWS")
public class ParticipantesWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarParticipantesProyectos")
    public List<ParticipantesProyectos> ListarParticipantes() {
        ParticipantesDAO participantesdao = new ParticipantesDAO();
        List<ParticipantesProyectos> listaParticipantes = participantesdao.findAll();
        return listaParticipantes;
    }
    
}
