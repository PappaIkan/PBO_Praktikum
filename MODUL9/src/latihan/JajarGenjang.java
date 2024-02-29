/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author lenovo
 */
public class JajarGenjang extends methodAbstract {
    int Tinggi = 2;
    int SisiMendatar = 6;
    int SisiMiring = 7;

    public double luas(){
        return SisiMendatar*Tinggi;
    }

    public double keliling(){
        return 2*(SisiMendatar + SisiMiring);
    }
}
