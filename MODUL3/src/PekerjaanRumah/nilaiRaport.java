/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PekerjaanRumah;

/**
 *
 * @author lenovo
 */
public class nilaiRaport {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    double nilaiTotal;

    void setNilai(int nilaiUTS, int nilaiUAS,int nilaiTugas){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS= nilaiUAS;
        this.nilaiTugas = nilaiTugas;
    }

    double setNail(){
        nilaiTotal = Double.valueOf(nilaiUTS + nilaiUAS+ nilaiTugas) / 3 ;
        return nilaiTotal;
    }
}
