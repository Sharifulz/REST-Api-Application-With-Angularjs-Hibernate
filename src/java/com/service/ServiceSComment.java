/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.exam.Commentscience;
import com.exam.Science;
import com.exam.service.ScienceCommentService;
import com.exam.service.ScienceService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author shaarif
 */
@Path("/sciencecomment")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ServiceSComment {
     ScienceCommentService simpleService = new ScienceCommentService();
    
    @GET
    public List<Commentscience> getAllStudent() {
        
        return simpleService.getAllStudent();
    }
    
    @POST
    public Commentscience addStudent(Commentscience s){
        
        return simpleService.addStudent(s);
    }
      // deletre data 
    @DELETE
    @Path("/delete/{studentId}")
    public void deleteStudent(@PathParam("studentId") int id){
        simpleService.removeStudent(id);
    }
    
   
}
