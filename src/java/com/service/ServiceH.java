/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.exam.Highlights;
import com.exam.Morning;
import com.exam.service.HighlightsService;
import com.exam.service.MorningService;
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
@Path("/highlights")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ServiceH {
     HighlightsService simpleService = new HighlightsService();
    
    @GET
    public List<Highlights> getAllStudent() {
        
        return simpleService.getAllStudent();
    }
    
     // insert POST
    @POST
    public Highlights addStudent(Highlights s){
        
        return simpleService.addStudent(s);
    }
    // update data
     @PUT
    @Path("/update/{scienceId}")
    public Highlights updateStudent(@PathParam("scienceId") int id, Highlights stu){
        stu.setPid(id);
        return simpleService.updateStudent(stu);
    }
    
    // deletre data 
    @DELETE
    @Path("/delete/{studentId}")
    public void deleteStudent(@PathParam("studentId") int id){
        simpleService.removeStudent(id);
    }
}