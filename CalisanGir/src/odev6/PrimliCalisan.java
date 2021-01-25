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
public class PrimliCalisan extends Calisan {
    private double primucreti;
    private double satisadedi;
    
    public PrimliCalisan(String add, String soyadd, String ssknoo, double primucretii, double satisadedii) {
        super(add, soyadd, ssknoo);
        this.primucreti=primucretii;
        this.satisadedi=satisadedii;
    }

    public double getPrimucreti() {
        return primucreti;
    }

    public void setPrimucreti(double primucreti) {
        this.primucreti = primucreti;
    }

    public double getSatisadedi() {
        return satisadedi;
    }

    public void setSatisadedi(double satisadedi) {
        this.satisadedi = satisadedi;
    }

    
    @Override
    public double maasHesapla() {
         return getSatisadedi()*getPrimucreti();
    }
    
}
