/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Application.Carrera;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;
/**
 *
 * @author camilo
 */
public class CarreraDAO {
    
    public void ingresar(Carrera carrera) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(carrera);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo registrar la carrera");
        }
    }
    
    public void modificar(Carrera carrera) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(carrera);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo modificar la carrera");
        }
    }

    public int consultar(int codigo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Carrera carrera = (Carrera) session.get(Carrera.class, codigo);
        if (carrera != null) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public List<Carrera> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Carrera");
        List<Carrera> lista = query.list();
        session.close();
        return lista;
    }
    
    public void eliminar(int codigo) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.delete(codigo);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo eliminar la carrera");
        }
    }
    
}
