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
public class MaasliCalisan extends Calisan{
    private double haftalikmaas;
    
    public MaasliCalisan(String ad, String soyad, String sskno, double haftalikmaass) {
        super(ad, soyad, sskno);
        this.haftalikmaas=haftalikmaass;
    }

    
    
    @Override
    public double maasHesapla() {
        return getHaftalikmaas()*4;
    }

    public double getHaftalikmaas() {
        return haftalikmaas;
    }

    public void setHaftalikmaas(double haftalikmaas) {
        this.haftalikmaas = haftalikmaas;
    }

   
}
