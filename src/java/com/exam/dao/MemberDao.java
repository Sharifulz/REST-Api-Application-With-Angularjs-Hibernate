/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.dao;

import com.exam.Member;
import com.exam.Morning;
import com.exam.NewHibernateUtil;
import com.exam.Science;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author shaarif
 */
public class MemberDao {
             public static List<Member> doQuery() {
        List<Member> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Member").list();
        return list;
    }
             
                      //insert dao
      public static void doSave(Member sci) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(sci);
        session.getTransaction().commit();
       
    }
}
