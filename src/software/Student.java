/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author zhengguoxing
 */
public class Student {
    
    private int studID;
    private String name;
    private String program;
    private String course;
    private String fetch_merge;
    //addingcomment while in Johnny branch
    public Student(){
    studID = 1;
    name  = "aaa";
    
    
    }
    
    public Student(int givenStudID,String givenname){
     studID = givenStudID;
     name = givenname;
    }
    
    public int getStudID(){
    return studID;}
    public void setStudID(int givenStudID){
    }
    
    public String getName(){
    
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
    
    
    
    
}
