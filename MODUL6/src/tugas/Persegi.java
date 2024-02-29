/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class Persegi extends BangunDatar {
    double sisi;
    
    void hitungLuas(){
        double luas = sisi*sisi;
        System.out.print(luas + "\n");
    }
    
    double hitungkeling(){
        double keliling = sisi*4;
        return keliling;
    }
}
