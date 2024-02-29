/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author lenovo
 */
public class Segitiga extends methodAbstract {
    double sisi = 8.0;
    double alas = 4;
    double tinggi = 6;

    public double luas(){
        return 0.5*this.alas*this.tinggi;
    }

    public double keliling(){
        return 3*sisi;
    }
}
