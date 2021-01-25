/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosya_işlemleri;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Havvanur BOZÖMEROĞLU
 */
public class Dosya_işlemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        createFile();
        getfileInfo();
        readfile();
        writefile();
        getfileInfo();
        readfile();
        writefile();
        getfileInfo();
        readfile();
    }
    
    public static void createFile(){
        File file = new File( "students.txt");
        try {
            if(file.createNewFile()){
             System.out.println("Dosya oluşturuldu.");
            }else{
             System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException ex) {
            Logger.getLogger(Dosya_işlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getfileInfo(){
        File file = new File( "students.txt");
        if(file.exists()){
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya Yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi? " + file.canWrite());
            System.out.println("Dosya Okunabilir mi? " + file.canRead());
            System.out.println("Dosya Boyutu: " + file.length());
        }
    }
    
    public static void readfile(){
        File file = new File( "students.txt");
        try {
            Scanner reader= new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dosya_işlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writefile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt",true));
            //yukarıda dosya yolunun sonuna true ekledik çünkü bunun ile var olan bilgileri silip azmayacak dosyanın devamına yazacak 
            //eğer true yazmazsak öncekileri silip bizim ekle dediğimizi eklicek
            writer.newLine();
            writer.write("Feyza Nur");
            writer.newLine();
            writer.write("Havvanur  sdf");
            writer.write("Havvanur  sdf");
            writer.newLine();
            writer.write("Ceyda");
            System.out.println("Dosya yazıldı.");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Dosya_işlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
