/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.dao;

import com.exam.NewHibernateUtil;
import com.exam.Science;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author shaarif
 */
public class ScienceDao {
           public static List<Science> doQuery() {
        List<Science> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Science").list();
        return list;
    }
           
            //insert dao
      public static void doSave(Science sci) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(sci);
        session.getTransaction().commit();
       
    }
      
      //update dao
         public static void doUpdate(Science stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(stu);
        session.getTransaction().commit();
    }
         //delete data
          public static void doDelete(Science stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(stu);
        session.getTransaction().commit();
    }
}
