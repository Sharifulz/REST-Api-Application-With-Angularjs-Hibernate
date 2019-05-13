/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.Morning;
import com.exam.Science;
import com.exam.dao.MorningDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shaarif
 */
public class MorningService {
     private Map<Integer, Morning> morningMap = new HashMap();
    MorningDao dao;

    public MorningService() {
        for (Morning s : dao.doQuery()) {
            morningMap.put(s.getPid(), s);
        }
    }

    public List<Morning> getAllStudent() {
        return new ArrayList<Morning>(morningMap.values());
    }
     //insert
    public Morning addStudent(Morning stu) {
        dao.doSave(stu);
        return stu;
    }
     //update

    public Morning updateStudent(Morning stu) {
        if (stu.getPid() <= 0) {
            return null;
        }
        dao.doUpdate(stu);
        return stu;
    }
       //delete data     
    public void removeStudent(int id) {
        Morning s = new Morning();
        s.setPid(id);
        dao.doDelete(s);
    }
}
