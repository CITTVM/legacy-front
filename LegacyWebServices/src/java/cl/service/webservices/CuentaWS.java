/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.service.webservices;

import cl.model.dao.CuentaDAO;
import cl.model.pojos.Cuenta;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author camilo
 */
@WebService(serviceName = "CuentaWS")
public class CuentaWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ListarCuentas")
    public List<Cuenta> ListarCuentas() {
        CuentaDAO cuentadao = new CuentaDAO();
        List<Cuenta> listaCuentas = cuentadao.findAll();
        return listaCuentas;
    }
    
}
