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
public class StudentArray {
    public static void main(String[] args){
    
    
    
   
    Student [] SA= new Student[3];
    Student s1 = new Student(11, "Johnny");
    SA[0] = s1;
    
    Student s2 = new Student(13, "John");
    SA[1] = s2;
    
    SA[2]= new Student(22,"Angie");
    
    
    for(int i = 0; i<SA.length; i++){
    System.out.println("name of student at index " +i +" is "+SA[i].getName());
    }
    }
}
