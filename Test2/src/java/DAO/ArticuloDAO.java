/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Application.Articulo;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;

/**
 *
 * @author Jordan Silva O
 */
public class ArticuloDAO {

    public void ingresar(Articulo articulo) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(articulo);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo guardar el articulo");
        }
    }
    
    public void modificar(Articulo articulo) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(articulo);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo modificar el articulo");
        }
    }

    public Articulo consultar(int codigo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Articulo articulo = (Articulo) session.get(Articulo.class, codigo);
        if (articulo != null) {
            return articulo;
        } else {
            return null;
        }
    }
    
    public List<Articulo> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Articulo");
        List<Articulo> lista = query.list();
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
            throw new RuntimeException("No se pudo eliminar el articulo");
        }
    }
    
}
