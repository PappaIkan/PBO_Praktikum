/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class Balok extends AbstraksBangun{
    double panjang = 4.0; 
    double lebar = 6.0; 
    double tinggi = 6.5; 
    

    public double volume() {
        return this.panjang * this.lebar * this.tinggi;
    }

    public double luasPermukaan() {
        return 2 * ((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi));
    }  
}
