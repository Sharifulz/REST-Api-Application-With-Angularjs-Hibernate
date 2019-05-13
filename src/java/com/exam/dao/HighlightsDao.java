/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.dao;

import com.exam.Highlights;
import com.exam.Morning;
import com.exam.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author shaarif
 */
public class HighlightsDao {
                  public static List<Highlights> doQuery() {
        List<Highlights> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Highlights").list();
        return list;
    }
                      //insert dao
      public static void doSave(Highlights sci) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(sci);
        session.getTransaction().commit();
       
    }
      
      //update dao
         public static void doUpdate(Highlights stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(stu);
        session.getTransaction().commit();
    }
         //delete data
          public static void doDelete(Highlights stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(stu);
        session.getTransaction().commit();
    }
}
