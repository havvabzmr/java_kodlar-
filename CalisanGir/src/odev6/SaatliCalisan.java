/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev6;

/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class SaatliCalisan extends Calisan {
    
    private double saatucreti;
    private double toplamsaat;

    public double getSaatucreti() {
        return saatucreti;
    }

    public void setSaatucreti(double saatucreti) {
        this.saatucreti = saatucreti;
    }

    public double getToplamsaat() {
        return toplamsaat;
    }

    public void setToplamsaat(double toplamsaat) {
        this.toplamsaat = toplamsaat;
    }
    
    
    public SaatliCalisan(String add, String soyadd, String ssknoo, double saatucretii, double toplamsaatt) {
        super(add, soyadd, ssknoo);
        this.saatucreti=saatucretii;
        this.toplamsaat=toplamsaatt;
    }

    @Override
    public double maasHesapla() {
       if(getToplamsaat()<=40 && getToplamsaat()>=0){
           return getSaatucreti()*getToplamsaat();
       } else if(getToplamsaat()>40){
           double hesap=((getToplamsaat()-40)*getSaatucreti()*15/10)+(40*getSaatucreti());
           return hesap;
       }else{
           return 0.0;
       }
       
    }
    
}
