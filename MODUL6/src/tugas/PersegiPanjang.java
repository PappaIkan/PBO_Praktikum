/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class PersegiPanjang extends BangunDatar {
    int panjang;
    double lebar;
    
    
    void hitungLuas(){
        double luas = panjang*lebar;
        System.out.print(luas + "\n");
    }
    
    double hitungkeliling(){
        double keliling = panjang + panjang + lebar + lebar;
        return keliling;
    }
}
