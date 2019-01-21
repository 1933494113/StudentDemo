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
public class testStudent {
    
    public static void main(String args[]){
        Student s1 = new Student(11,"Roak");
        Student s2 = new Student();
    
        
        System.out.println("Name of s2 " +s2.getName());
        s2.setName("WO");
        System.out.println("Name of s2 after change " +s2.getName());
        
        
        
        
        
    }

}