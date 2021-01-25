/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev6;
import java.util.Scanner;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class CalisanGir {
      
        
        
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner girdi = new Scanner(System.in);
        Calisan c[]= new Calisan[3];
        
        
         for(int i=0; i<c.length; i++){
            
            System.out.println("\n1-Maaşlı Çalışan\n2-Saatli Çalışan\n3-Primli Çalışan");
            System.out.println("(lütfen sayısal değer giriniz.)");
            System.out.print("Lütfen hangi çalışan türünün maaşını hesaplanıcağını giriniz: ");
            String sonuc = girdi.next();
            
            c[i]=null;
            
            
            if(sonuc.equals("1")){
                System.out.print("İSİM         : ");
                String isim= girdi.next();
                System.out.print("\nSOYİSİM      : ");
                String soyisim= girdi.next();
                System.out.print("\nSSK NUMARASI : ");
                String ssknumarasi=girdi.next(); 
                System.out.print("\nHAFTALIK MAAŞ: ");
                double haftalikmaasi=girdi.nextDouble();
                c[i] = new MaasliCalisan(isim, soyisim, ssknumarasi, haftalikmaasi);
                c[i].maasHesapla();
            }else if(sonuc.equals("2")){ 
                System.out.print("İSİM         : ");
                String isim= girdi.next();
                System.out.print("\nSOYİSİM      : ");
                String soyisim= girdi.next();
                System.out.print("\nSSK NUMARASI : ");
                String ssknumarasi=girdi.next(); 
                System.out.print("\nSAAT ÜCRETİ  : ");
                double saatucreti=girdi.nextDouble();
                System.out.print("\nTOPLAM SAAT  : ");
                double toplamsaat= girdi.nextDouble();
                c[i] = new SaatliCalisan(isim, soyisim, ssknumarasi, saatucreti, toplamsaat);
                c[i].maasHesapla();
                
            }else if(sonuc.equals("3")){
                System.out.print("İSİM         : ");
                String isim= girdi.next();
                System.out.print("\nSOYİSİM      : ");
                String soyisim= girdi.next();
                System.out.print("\nSSK NUMARASI : ");
                String ssknumarasi=girdi.next();
                System.out.print("\nPRİM ÜCRETİ  :");
                double primucreti=girdi.nextDouble();
                System.out.print("\nSATIŞ ADEDİ  :");
                double satisadedi=girdi.nextDouble();
                c[i] = new PrimliCalisan(isim, soyisim, ssknumarasi,primucreti,satisadedi);
                c[i].maasHesapla();
            }else{
                System.out.println("GEÇERSİZ BİR DEĞER GİRDİNİZ!"
                        + "LÜTFEN SAYISAL DEĞER GİRİNİZ!");
            }
        }
         
         for(int i=0; i<c.length ; i++){
             System.out.println(c[i].maasHesapla() + ", " + c[i].getAd()
             + ", " + c[i].getSoyad() + ", " + c[i].getSskno());
             System.out.println("-----------------------------------------------------------------"
                     + "--------------------------------------------");
         }
       
    }
    
}
