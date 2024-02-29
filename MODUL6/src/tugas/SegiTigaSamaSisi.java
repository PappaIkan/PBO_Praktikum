/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class SegiTigaSamaSisi extends SegiTiga {
    double sisi;
    
    void hitungLuas(double sisiMiring, double alas) {
        double luas = 0.5 * alas * Math.sqrt(Math.pow(sisi, 2) - Math.pow(alas/2, 2));
        System.out.println("Luas : " + luas + "\n");
    }
    
    double hitungkeliling(){
        double keliling = sisi*3;
        return keliling;
    }
}
