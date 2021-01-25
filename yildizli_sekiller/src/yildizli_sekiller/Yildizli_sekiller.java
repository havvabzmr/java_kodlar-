/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yildizli_sekiller;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Yildizli_sekiller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input=new Scanner(System.in);
     
     // damalı şekil
     for(int i=1; i<=10; i++){
         for(int j=1;j<=10; j++){
             if(i%2==0 && j%2==1)             
                 System.out.print("*");
             if(i%2==0 && j%2==0)             
                 System.out.print(" ");
             if(i%2==1 && j%2==0)             
                 System.out.print("*"); 
             if(i%2==1 && j%2==1)             
                 System.out.print(" ");
         }
         System.out.println();
         }
     
     
    
    // üçgen sola yapışık
    for(int i=0; i<5 ; i++){
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    
    
    //üçgen sağa yapışık
    for(int i=0; i<6; i++){
        for(int j=0; j<6; j++){
           if(i+j<5)
               System.out.print(" ");
           if(i+j>=5)
               System.out.print("*");
        }
        System.out.println();
    }
    
    
    
    
} }
