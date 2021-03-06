package com.exam;
// Generated May 9, 2019 11:42:08 PM by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;




/**
 * Member generated by hbm2java
 */
@Entity
@XmlRootElement
public class Member  implements java.io.Serializable {

@Id
    @GeneratedValue
     private Integer id;
     private String name;
     private String email;
     private String pass;

    public Member() {
    }

    public Member(String name, String email, String pass) {
       this.name = name;
       this.email = email;
       this.pass = pass;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }




}


