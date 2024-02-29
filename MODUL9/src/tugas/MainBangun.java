/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class MainBangun {
    public static void main(String [] args){
        System.out.println("Haasil perhitungan");
        Balok b = new Balok();
        System.out.println("Volume Balok : " + b.volume());
        System.out.println("Luas Permukaan Balok : " + b.luasPermukaan());
        System.out.println("\n");
                 
        Bola B = new Bola();
        System.out.println("Volume Bola : " + B.volume());
        System.out.println("Luas Permukaan Bola : " + B.luasPermukaan());
        System.out.println("\n");
         
        Kerucut k = new Kerucut();
        System.out.println("Volume Kerucut : " + k.volume());
        System.out.println("Luas Permukaan Kerucut : " + k.luasPermukaan());
        System.out.println("\n");
        
        Kubus K = new Kubus();
        System.out.println("Volume Kubus : " + K.volume());
        System.out.println("Luas Permukaan Kubus : " + K.luasPermukaan());
        System.out.println("\n");
        
        PrismaSegitiga ps = new PrismaSegitiga();
        System.out.println("Volume PrismaSegitiga : " + ps.volume());
        System.out.println("Luas Permukaan PrismaSegitiga : " + ps.luasPermukaan());
        System.out.println("\n");
    }
}
