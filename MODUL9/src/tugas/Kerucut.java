/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class Kerucut extends AbstraksBangun {
    double jari_jari = 2.0;
    double tinggi = 5.5;
    double sisiMiring = 9.2;
    final double p = 3.14;

    public double volume() {
        return this.p * Math.pow(this.jari_jari, 2) * this.tinggi / 3;
    }

    public double luasPermukaan() {
        return this.p * this.jari_jari * (this.sisiMiring + this.jari_jari);
    }
}
