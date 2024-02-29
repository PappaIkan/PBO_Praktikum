/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotidemo;

/**
 *
 * @author lenovo
 */
public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;
    
    void beriWarna(String warnaroti){
        this.warna = warnaroti; 
    }
    
    void beriRasa(String berirasa){
        this.rasa = berirasa; 
    }
    
    void menimbangBerat(int berattimbang){
        this.berat = berattimbang;
    }
    
    void hargaJual(double Harga){
        harga = Harga;
    }
    
    void infoRoti(){
        System.out.print("Waran Roti : " + warna + "\n" + 
                "Rasa Roti : " + rasa + "\n" +
                "Berat Roti : " + berat +  "\n" + 
                "Harga Roti : " + harga);
    }
    
}
