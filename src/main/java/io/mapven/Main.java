package io.mapven;

import io.mapven.entities.ProjectEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

/**
 * Created by jtorregrosa on 9/02/16.
 */
public class Main {
    private static SessionFactory factory;

    public static void main(final String[] args){
        System.out.println("Hello world");

        try{
            factory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List<ProjectEntity> employees = session.createQuery("FROM ProjectEntity").list();
            for (final Iterator iterator = employees.iterator(); iterator.hasNext();){
                final ProjectEntity project = (ProjectEntity) iterator.next();
                System.out.println(project);
            }
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        factory.close();
    }

}
