package com.exam;
// Generated May 9, 2019 11:42:08 PM by Hibernate Tools 4.3.1



/**
 * Commentmorning generated by hbm2java
 */
public class Commentmorning  implements java.io.Serializable {


     private int id;
     private Integer pid;
     private String comment;

    public Commentmorning() {
    }

	
    public Commentmorning(int id) {
        this.id = id;
    }
    public Commentmorning(int id, Integer pid, String comment) {
       this.id = id;
       this.pid = pid;
       this.comment = comment;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}


