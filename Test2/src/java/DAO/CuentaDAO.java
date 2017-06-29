/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Application.Cuenta;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;
/**
 *
 * @author camilo
 */
public class CuentaDAO {
    
    public void ingresar(Cuenta cuenta) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(cuenta);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo registrar la cuenta");
        }
    }
    
    public void modificar(Cuenta cuenta) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(cuenta);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo modificar la cuenta");
        }
    }

    public int consultar(int codigo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Cuenta cuenta = (Cuenta) session.get(Cuenta.class, codigo);
        if (cuenta != null) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public List<Cuenta> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Cuenta");
        List<Cuenta> lista = query.list();
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
            throw new RuntimeException("No se pudo eliminar la cuenta");
        }
    }
    
    
    
    public List<Cuenta> find(String name) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Cuenta where Nickname='"+name+"'");
        List<Cuenta> cuenta =  query.list();
        session.close();
        return cuenta;
    }
    
}
