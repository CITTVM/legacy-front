/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.pojos.InscripcionesWorkshop;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;
/**
 *
 * @author camilo
 */
public class InscripcionesDAO {
    
    public void ingresarInscrito(InscripcionesWorkshop inscrito) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(inscrito);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo registrar la inscripcion");
        }
    }
    
    public void modficarInscrito(InscripcionesWorkshop inscrito) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(inscrito);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo modificar la inscripcion");
        }
    }

    public int consultarInscrito(int codigo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        InscripcionesWorkshop inscrito = (InscripcionesWorkshop) session.get(InscripcionesWorkshop.class, codigo);
        if (inscrito != null) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public List<InscripcionesWorkshop> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from InscripcionesWorkshop");
        List<InscripcionesWorkshop> lista = query.list();
        session.close();
        return lista;
    }
    
}
