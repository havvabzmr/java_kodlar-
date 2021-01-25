/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);    
    int number1;
    int number2;
    int toplam;
    
    System.out.println("Lütfen birinci sayıyı giriniz: ");
    number1=input.nextInt();
    System.out.println("Lütfen ikinci sayıyı giriniz: ");
    number2=input.nextInt();
    toplam=number1+number2;
    System.out.println("İki sayının toplamı: " + toplam);
    
    }
    
}
