/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.Highlights;
import com.exam.Morning;
import com.exam.dao.HighlightsDao;
import com.exam.dao.MorningDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shaarif
 */
public class HighlightsService {
         private Map<Integer, Highlights> highlightsMap = new HashMap();
    HighlightsDao dao;

    public HighlightsService() {
        for (Highlights s : dao.doQuery()) {
            highlightsMap.put(s.getPid(), s);
        }
    }

    public List<Highlights> getAllStudent() {
        return new ArrayList<Highlights>(highlightsMap.values());
    }
    
     //insert
    public Highlights addStudent(Highlights stu) {
        dao.doSave(stu);
        return stu;
    }
     //update

    public Highlights updateStudent(Highlights stu) {
        if (stu.getPid() <= 0) {
            return null;
        }
        dao.doUpdate(stu);
        return stu;
    }
       //delete data     
    public void removeStudent(int id) {
        Highlights s = new Highlights();
        s.setPid(id);
        dao.doDelete(s);
    }
}
