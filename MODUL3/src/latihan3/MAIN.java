/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author lenovo
 */
public class MAIN {
    public static void main (String [] args){
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();

        pegawai1.setNama("joko");
        pegawai1.setNIP(729364957);
        pegawai1.setGaji(6.923142);
        pegawai1.infoBaru();
        
        pegawai2.setNama("fadil");
        pegawai2.setNIP(729345657);
        pegawai2.setGaji(7.435678);
        pegawai2.infoBaru();
        
        pegawai3.setNama("gilang");
        pegawai3.setNIP(729345657);
        pegawai3.setGaji(7.423332);
        pegawai3.infoBaru();
        
        pegawai4.setNama("rizky");
        pegawai4.setNIP(729456957);
        pegawai4.setGaji(9.122242);
        pegawai4.infoBaru();
        
        pegawai5.setNama("farhan");
        pegawai5.setNIP(725344457);
        pegawai5.setGaji(6.296256);
        pegawai5.infoBaru();

    }
}
