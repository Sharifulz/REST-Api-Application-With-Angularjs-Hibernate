/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.Commentscience;


import com.exam.Morning;
import com.exam.Science;
import com.exam.dao.CommentScienceDao;
import com.exam.dao.MorningDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shaarif
 */
public class ScienceCommentService {
        private Map<Integer, Commentscience> morningMap = new HashMap();
    CommentScienceDao dao;

    public ScienceCommentService() {
        for (Commentscience s : dao.doQuery()) {
            morningMap.put(s.getId(), s);
        }
    }

    public List<Commentscience> getAllStudent() {
        return new ArrayList<Commentscience>(morningMap.values());
    }
    
     //insert
    public Commentscience addStudent(Commentscience stu) {
        dao.doSave(stu);
        return stu;
    }
    
    //update

    public Commentscience updateStudent(Commentscience stu) {
        if (stu.getId() <= 0) {
            return null;
        }
        dao.doUpdate(stu);
        return stu;
    }
        //delete data     
    public void removeStudent(int id) {
        Commentscience s = new Commentscience();
        s.setId(id);
        dao.doDelete(s);
    }
}
