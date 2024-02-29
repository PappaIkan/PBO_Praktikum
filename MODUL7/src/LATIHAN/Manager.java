/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

/**
 *
 * @author lenovo
 */
public class Manager extends Karyawan {
    private float JamKerja = 7.5f;

    public float JamKerja(){
        return  JamKerja;
    }
    
    public void setJamKerja(float JamKerja){
        this.JamKerja = JamKerja;
    }

    public float getGajiManager(){
        return this.getGaji() * 2;
    }
}
