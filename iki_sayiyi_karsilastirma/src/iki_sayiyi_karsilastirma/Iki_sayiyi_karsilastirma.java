/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iki_sayiyi_karsilastirma;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Iki_sayiyi_karsilastirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input= new Scanner(System.in);
    System.out.println("Lütfen birinci sayıyı giriniz: ");
    int number1;
    number1=input.nextInt();
    System.out.println("Lütfen ikinci sayıyı giriniz: ");
    int number2;
    number2=input.nextInt();
    
    if(number1<number2)
        System.out.println(number2 + " büyüktür " + number1);
    if(number1==number2)
        System.out.println(number1 + " ile " + number2 + "eşittir");
    if(number1>number2)
        System.out.println(number1 + " büyüktür " + number2);
        
    
    }
    
    }
    

