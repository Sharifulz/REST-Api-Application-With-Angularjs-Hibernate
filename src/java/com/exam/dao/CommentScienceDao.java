/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.dao;

import com.exam.Commentscience;
import com.exam.NewHibernateUtil;
import com.exam.Science;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author shaarif
 */
public class CommentScienceDao {
        public static List<Commentscience> doQuery() {
        List<Commentscience> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Commentscience").list();
        return list;
    }
        
        //insert dao
      public static void doSave(Commentscience sci) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
         session.save(sci);
        session.getTransaction().commit();
    
    }
      
           //update dao
         public static void doUpdate(Commentscience sci) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(sci);
        session.getTransaction().commit();
    }
            //delete data
          public static void doDelete(Commentscience stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(stu);
        session.getTransaction().commit();
    }
}
