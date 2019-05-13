/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.exam.Member;
import com.exam.Science;
import com.exam.service.MemberService;
import com.exam.service.ScienceService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author shaarif
 */
@Path("/member")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ServiceMember {
 MemberService simpleService = new MemberService();
    
    @GET
    public List<Member> getAllStudent() {
        
        return simpleService.getAllStudent();
    }
      // insert POST
    @POST
    public Member addStudent(Member s){
        
        return simpleService.addStudent(s);
    }
}