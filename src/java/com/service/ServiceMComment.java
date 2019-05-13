/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.exam.Commenthighlights;
import com.exam.Commentmorning;
import com.exam.Commentscience;
import com.exam.service.MorningCommentService;
import com.exam.service.ScienceCommentService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author shaarif
 */
@Path("/morningcomment")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ServiceMComment {
     MorningCommentService simpleService = new MorningCommentService();
    
    @GET
    public List<Commentmorning> getAllStudent() {
        
        return simpleService.getAllStudent();
    }
     @POST
    public Commentmorning addStudent(Commentmorning s){
        
        return simpleService.addStudent(s);
    }
        // deletre data 
    @DELETE
    @Path("/delete/{studentId}")
    public void deleteStudent(@PathParam("studentId") int id){
        simpleService.removeStudent(id);
    }
}

