/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors_insan;
class insan{
    int boy;
    int kilo;
    int yas;
    public insan(){ //constructors class ile aynı isimde olup return type ı yoktur
       //bu class ı çalıştırdığımızda ilk constractrs çalışır 
       //ilk değer atamasısını constractrs lar ile yapabiliriz
        
        System.out.println(" insan objesi oluşturuldu"); 
        yas=1; // insan hayata 1 yasında gelir diyebilliriz eger yaşını belirtmesek varlığın ve ekrana bastığımızda 1 değerini bastırır
    }
    
    
    //parametreli constractors tanımladığımızda boş parametreli constrtrs yani default constrts olmak zorunda yoksa hata vverir
  
    public insan(int boy, int kilo, int yas){ // birden fazla constroctors yapabiliriz bu da çokşekilcilik yani polimofizm denşr
        this(); // default constrtrs ı çagirmiş olur
        this.yas=yas; // class ın nesnesi olan yaş yapmiş olduk
        this.boy=boy;
        this.kilo=kilo;
    }
}
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Constructors_insan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insan veli; //boş varlık içi boş
        insan feyza = new insan(); // default constractors
        new insan(); // bu şekildede obje oluşturmuş oluruz fakat hiçbir varlığı olmadığından ram de başıboş durur ve java bunu çöp olarak görür
        feyza.boy=110;
        feyza.kilo=18;
        feyza.yas=5;
        
        insan ceyda =new insan();
        insan havvanur =new insan(168,53,20);
       
        System.out.println("havvanurun boyu: " + havvanur.boy + " kilo: " + havvanur.kilo + " yaş: " + havvanur.yas );
        System.out.println(" feyzanın boyu: " + feyza.boy + " kilo: " + feyza.kilo + " yaş: " + feyza.yas );
    }
    
}
