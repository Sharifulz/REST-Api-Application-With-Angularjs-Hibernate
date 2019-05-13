/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.Member;
import com.exam.Science;
import com.exam.dao.MemberDao;
import com.exam.dao.ScienceDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 *
 * @author shaarif
 */
public class MemberService {
    private Map<Integer, Member> scienceMap = new HashMap();
    MemberDao dao;

    public MemberService() {
        for (Member s : dao.doQuery()) {
            scienceMap.put(s.getId(), s);
        }
    }

    public List<Member> getAllStudent() {
        return new ArrayList<Member>(scienceMap.values());
    }
     //insert
    public Member addStudent(Member stu) {
        dao.doSave(stu);
        return stu;
    }
}
