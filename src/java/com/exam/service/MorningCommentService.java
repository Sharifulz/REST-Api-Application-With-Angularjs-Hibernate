/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.Commenthighlights;
import com.exam.Commentmorning;
import com.exam.Commentscience;
import com.exam.dao.CommentMorningDao;
import com.exam.dao.CommentScienceDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shaarif
 */
public class MorningCommentService {
            private Map<Integer, Commentmorning> morningMap = new HashMap();
    CommentMorningDao dao;

    public MorningCommentService() {
        for (Commentmorning s : dao.doQuery()) {
            morningMap.put(s.getId(), s);
        }
    }

    public List<Commentmorning> getAllStudent() {
        return new ArrayList<Commentmorning>(morningMap.values());
    }
    
     public Commentmorning addStudent(Commentmorning stu) {
        dao.doSave(stu);
        return stu;
    }
           //delete data     
    public void removeStudent(int id) {
        Commentmorning s = new Commentmorning();
        s.setId(id);
        dao.doDelete(s);
    }
}
