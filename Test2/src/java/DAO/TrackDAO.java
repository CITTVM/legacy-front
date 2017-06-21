/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Application.Track;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author camilo
 */
public class TrackDAO {
    
    public void ingresarTrack(Track track) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(track);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo guardar el articulo");
        }
    }
    
    public void modificarTrack(Track track) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(track);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo modificar el track");
        }
    }

    public int consultarTrack(int codigo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Track track = (Track) session.get(Track.class, codigo);
        if (track != null) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public List<Track> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Track");
        List<Track> lista = query.list();
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
            throw new RuntimeException("No se pudo eliminar el track");
        }
    }
    
}
