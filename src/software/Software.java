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
import java.util.Scanner;
public class Software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    char x[] = new char[7];
    
    x[0]='W';
    x[1]='e';
    x[2]='e';
    x[3]='k';
    x[4]='e';
    x[5]='n';
    x[6]='d';
    
    char[] pillbox={'w','e','e','k','e','n','d'};
    
    
    for(int i = 0;i<x.length;i++){
    System.out.print(x[i]);
    
    
}
    System.out.println("");
        for(int i = 6;i>=0;i--){
    System.out.print(x[i]);
    
    
}
        System.out.println("");
    // user enter String
        
        String n;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        n = input.next();
        
        
        
        char name[] = new char[n.length()];
        
          for(int i = 0; i<n.length();i++){
               name[i] = n.charAt(i);
               System.out.print(name[i]);
    
}
    }
}