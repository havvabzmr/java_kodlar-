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
public abstract class Calisan implements odeme {
    private String ad;
    private String soyad;
    private String sskno;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSskno() {
        return sskno;
    }

    public void setSskno(String sskno) {
        this.sskno = sskno;
    }
    

      Calisan(String add, String soyadd, String ssknoo){
        this.ad=add;
        this.soyad=soyadd;
        this.sskno=ssknoo;
    }
    
}
