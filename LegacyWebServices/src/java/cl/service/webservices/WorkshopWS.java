/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

/**
 *
 * @author camilo
 */

import cl.model.dao.WorkshopDAO;
import cl.model.pojos.Workshop;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WorkshopWS")
public class WorkshopWS {
    
    @WebMethod(operationName = "ListarWorkshops")
    public List<Workshop> ListarArticulos() {
        WorkshopDAO workshopdao = new WorkshopDAO();
        List<Workshop> listaWorkshops = workshopdao.findAll();
        return listaWorkshops;
    }
    
}
