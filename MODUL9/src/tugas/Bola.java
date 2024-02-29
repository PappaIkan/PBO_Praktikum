/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class Bola extends AbstraksBangun {
    double jari_jari = 4.4;
    final double p = 3.14;

    public double volume() {
        return 4 * this.p * Math.pow(this.jari_jari, 3) / 3;
    }

    public double luasPermukaan() {
        return 4 * this.p * Math.pow(this.jari_jari, 2);
    } 
}
