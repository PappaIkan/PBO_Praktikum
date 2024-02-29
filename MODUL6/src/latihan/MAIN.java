/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author lenovo
 */
public class MAIN {
    public static void main(String [] arggs){
        mobil mb = new mobil();
        pesawat ps = new pesawat();
        
        System.out.print("=========informasi kendaraan=========" + "\n");
      
        System.out.println("mobil");
        System.out.println("Berat       : " + mb.berat + " kg");
        System.out.println("Warna       : " + mb.warna);
        System.out.println("Kecepatan   : " + mb.kecepatan + " km/h");
        System.out.println("Jumlah roda : " + mb.jumlahroda);
        System.out.println("\n");

        System.out.println("Pesawat");
        System.out.println("Berat       : " + ps.berat + " kg");
        System.out.println("Warna       : " + ps.warna);
        System.out.println("Kecepatan   : " + ps.kecepatan + " km/h");
        System.out.println("Jenis       : " + ps.jenis);
        
    }
    
}
