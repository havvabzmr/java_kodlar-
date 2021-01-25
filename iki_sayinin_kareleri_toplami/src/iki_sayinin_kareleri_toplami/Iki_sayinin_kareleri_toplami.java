/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iki_sayinin_kareleri_toplami;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Iki_sayinin_kareleri_toplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input= new Scanner(System.in);
    int a;
    int b;
    
    System.out.println("Lütfen a sayını giriniz: ");
    a=input.nextInt();
    System.out.println("Lütfen b sayısını giriniz: ");
    b=input.nextInt();
    int x=(a*a)+(b*b);
    System.out.println("Karelerinin toplamının karakökü: " + Math.sqrt(x));
    }
    
}
