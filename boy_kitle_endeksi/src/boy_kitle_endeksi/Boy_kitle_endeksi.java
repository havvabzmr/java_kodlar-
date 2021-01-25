/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boy_kitle_endeksi;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Boy_kitle_endeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double kilo;
        double boy;
        double bke;
        
        
        System.out.println("Lütfen boyunuzu giriniz: ");
        boy= input.nextInt();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo= input.nextInt();
        bke=kilo/(boy*boy);
        if(bke<18.5)
            System.out.println(" Zayıf:  18.5den az");
        if(bke>=18.5 && bke<=24.9)
            System.out.println(" Normal:  18.5 ile 24.9 arasında");
        if(bke>=25 && bke<=29.9)
            System.out.println(" Kilolu:  25 ile 29.9 arasında");
        if(bke>=30)
            System.out.println(" Obez: 30 ve üstü");
    }
    
}
