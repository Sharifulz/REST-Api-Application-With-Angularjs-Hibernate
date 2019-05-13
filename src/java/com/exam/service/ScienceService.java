/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.Science;
import com.exam.dao.ScienceDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shaarif
 */
public class ScienceService {
    private Map<Integer, Science> scienceMap = new HashMap();
    ScienceDao dao;

    public ScienceService() {
        for (Science s : dao.doQuery()) {
            scienceMap.put(s.getPid(), s);
        }
    }

    public List<Science> getAllStudent() {
        return new ArrayList<Science>(scienceMap.values());
    }
    
    //insert
    public Science addStudent(Science stu) {
        dao.doSave(stu);
        return stu;
    }
     //update

    public Science updateStudent(Science stu) {
        if (stu.getPid() <= 0) {
            return null;
        }
        dao.doUpdate(stu);
        return stu;
    }
       //delete data     
    public void removeStudent(int id) {
        Science s = new Science();
        s.setPid(id);
        dao.doDelete(s);
    }
}
