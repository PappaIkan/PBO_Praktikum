/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author lenovo
 */
public class Lingkaran extends methodAbstract {
    double jari_jari = 6.9;
    final double p = 3.14;
    
    public void setJariJari(double jarijari) {
        this.jari_jari = jarijari;
    }

    public double getJariJari() {
        return jari_jari;
    }

    public double luas(){
        return this.p*Math.pow(this.jari_jari, 2);
    }

    public double keliling(){
        return this.p*(2*this.jari_jari);
    }
}
