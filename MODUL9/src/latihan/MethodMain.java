/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author lenovo
 */
public class MethodMain {
    public static void main(String [] args){
        System.out.println("Haasil perhitungan");
        Segitiga sgt = new Segitiga();
        System.out.println("Keliling segitiga = "+ sgt.getKell());
        System.out.println("Luas segitiga = "+ sgt.getLuas());
        System.out.println("\n");
        
        PersegiPanjang ppg = new PersegiPanjang();
        System.out.println("Keliling PersegiPanjang = "+ ppg.getKell());
        System.out.println("Luas PersegiPanjang = "+ ppg.getLuas());
        System.out.println("\n");
        
        Lingkaran lkn = new Lingkaran();
        System.out.println("Keliling Lingkaran Lingkaran = "+ lkn.getKell());
        System.out.println("Luas Lingkaran Lingkaran = "+ lkn.getLuas());
        System.out.println("\n");
        
        JajarGenjang jgg = new JajarGenjang();
        System.out.println("Keliling JajarGenjang = "+ jgg.getKell());
        System.out.println("Luas JajarGenjang = "+ jgg.getLuas());
        System.out.println("\n");
    }
}
