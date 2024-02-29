/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author lenovo
 */
public class TestPolymorphism {
    public static void main(String [] args){
        Kucing kc = new Kucing();
        Anjing an = new Anjing();

        kc.beriNama("TOM");
        an.beriNama("BULL");

        System.out.println(kc.panggilNama());
        System.out.println(kc.perilaku());
        System.out.println(kc.bersuara());

        System.out.println(an.panggilNama());
        System.out.println(an.perilaku());
        System.out.println(an.bersuara());
    }
}
