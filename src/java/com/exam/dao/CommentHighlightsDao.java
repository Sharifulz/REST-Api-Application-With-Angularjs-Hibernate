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
public class CommentHighlightsDao {
            public static List<Commenthighlights> doQuery() {
        List<Commenthighlights> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Commenthighlights").list();
        return list;
    }
              //insert dao
      public static void doSave(Commenthighlights high) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
         session.save(high);
        session.getTransaction().commit();
    
    }
      //delete data
          public static void doDelete(Commenthighlights stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(stu);
        session.getTransaction().commit();
    }
}
