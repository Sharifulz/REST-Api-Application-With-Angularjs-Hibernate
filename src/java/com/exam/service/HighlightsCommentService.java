/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.Commenthighlights;
import com.exam.Commentmorning;
import com.exam.Commentscience;
import com.exam.dao.CommentHighlightsDao;
import com.exam.dao.CommentMorningDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shaarif
 */
public class HighlightsCommentService {
               private Map<Integer, Commenthighlights> morningMap = new HashMap();
    CommentHighlightsDao dao;

    public HighlightsCommentService() {
        for (Commenthighlights s : dao.doQuery()) {
            morningMap.put(s.getId(), s);
        }
    }

    public List<Commenthighlights> getAllStudent() {
        return new ArrayList<Commenthighlights>(morningMap.values());
    }
     public Commenthighlights addStudent(Commenthighlights stu) {
        dao.doSave(stu);
        return stu;
    }
              //delete data     
    public void removeStudent(int id) {
        Commenthighlights s = new Commenthighlights();
        s.setId(id);
        dao.doDelete(s);
    }
}
