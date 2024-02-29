/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class Kubus extends AbstraksBangun{
    double alas = 3.3;

    public double volume() {
        return Math.pow(this.alas, 3);
    }

    
    public double luasPermukaan() {
        return 6 * Math.pow(this.alas, 2);
    }
}
