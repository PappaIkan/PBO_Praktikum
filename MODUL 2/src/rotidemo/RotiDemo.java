/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotidemo;

/**
 *
 * @author lenovo
 */
public class RotiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roti roti1 = new Roti();
        roti1.beriWarna("kuning");
        roti1.beriRasa("mengkudu");
        roti1.menimbangBerat(5);
        roti1.hargaJual(10000);
        roti1.infoRoti();
        
        Roti roti2 = new Roti();
        roti2.beriWarna("ungu");
        roti2.beriRasa("semangka");
        roti2.menimbangBerat(8);
        roti2.hargaJual(15000);
        roti2.infoRoti();
        
        Roti roti3 = new Roti();
        roti3.beriWarna("biru");
        roti3.beriRasa("taro");
        roti3.menimbangBerat(3);
        roti3.hargaJual(5000);
        roti3.infoRoti();
    }
    
}
