/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asal_sayi;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Asal_sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("lütfen bir sayı giriniz: ");
        sayi=input.nextInt();
        
        int sayac=0;
        
        if(sayi<1)
            System.out.println(" Girdiğiniz sayı 1den küçüktür");
        else{
            for(int i=1; i<=Math.round(sayi/2); i++){
            int kalan=sayi%1;
                if(kalan==0){
                    sayac++;
        } }
            if(sayac==2)
                System.out.println(" Sayı asaldır");
            else{
                System.out.println(" Sayı asal değildir");
            }
    }
    
} }
