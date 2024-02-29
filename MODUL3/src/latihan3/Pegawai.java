/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author lenovo
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;

    void setNama(String NM){
        this.nama = NM;
    }
    void setNIP(int nip){
        this.nip = nip;
    }
    void setGaji(double gj){
        this.gaji = gj;
    }

    void infoBaru(){
        System.out.println("Nama : " + nama + "\n" + 
                            "nip : " + nip + "\n" +
                            "Gaji : $" + gaji + "\n");
    }
}
