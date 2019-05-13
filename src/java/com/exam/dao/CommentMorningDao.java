/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.dao;

import com.exam.Commenthighlights;
import com.exam.Commentmorning;
import com.exam.Commentscience;
import com.exam.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author shaarif
 */
public class CommentMorningDao {
         public static List<Commentmorning> doQuery() {
        List<Commentmorning> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Commentmorning").list();
        return list;
    }
         
               //insert dao
      public static void doSave(Commentmorning morn) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
         session.save(morn);
        session.getTransaction().commit();
    
    }
        //delete data
          public static void doDelete(Commentmorning stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(stu);
        session.getTransaction().commit();
    }
}
