/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author lenovo
 */
public class InstanceVariable {
    int umur;

    void firdtMethod(){
        int usia = 0;
        int tahunSekarang = 2023;
        int tahunLahir = 2004;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);

    }
    
    void secondMethod(){
        int beratLahir = 4;
        int beratBadan = beratLahir + (umur / 2);

        System.out.println("Berat badan : " + beratBadan);
    }
}
