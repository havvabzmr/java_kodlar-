/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daire;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Daire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int yaricap;
        System.out.println("Lütfen yarıçapı giriniz: ");
        yaricap=input.nextInt();
        double pi=3.14;
        System.out.println("Dairenin çapı: " + 2*yaricap );
        System.out.println("Dairenin çevresi: " + 2*pi*yaricap);
        System.out.println("Dairenin alanı: " + pi*yaricap*yaricap );
        
    }
    
}
