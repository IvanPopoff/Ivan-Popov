/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ivanp
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    
        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
        String myName;
        
        try{
            System.out.println("Enter your name:");
            
            myName = myKB.readLine();
            
            System.out.println("Hello " + myName + "Isn't this a great day!");
            
            int num;
            
            System.out.println("Enter any number");
            
            num = Integer.parseInt(myKB.readLine());
            
            System.out.println("The square of " + num + " is " + (num * num));
        }catch(Exception e){
                
            System.out.println("Error - something bad happened!");
        }
    }
    
}
