/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String [] args){
    Manager kn1 = new Manager();
    kn1.setName("wader");
    kn1.setGaji(4000000);
    kn1.setUsia(25);
    kn1.setJamKerja(8.5f);
    
    Manager kn2 = new Manager();
    kn2.setName("lelel");
    kn2.setGaji(5000000);
    kn2.setUsia(23);
    kn2.setJamKerja(8.0f);
    
    
    Manager kn3 = new Manager();
    kn3.setName("narto");
    kn3.setGaji(3000000);
    kn3.setUsia(30);
    kn3.setJamKerja(7.0f);
    
    Manager kn4 = new Manager();
    kn4.setName("nirot");
    kn4.setGaji(4500000);
    kn4.setUsia(26);
    kn4.setJamKerja(8.5f);
    
    Manager kn5 = new Manager();
    kn5.setName("kitra");
    kn5.setGaji(2800000);
    kn5.setUsia(28);
    kn5.setJamKerja(6.0f);

    System.out.println("====informasi Pegawai====");
        System.out.println("NAMA       : " + kn1.getNama() + "\n" + 
                            "GAJI       : " + kn1.getGaji() + "\n" +
                            "USIA       : " + kn1.getUsia() + "\n" +
                            "Jam Kerja  : " + kn1.getGajiManager() + "\n" +
                            " ");

    System.out.println("====informasi Pegawai====");
        System.out.println("NAMA       : " + kn2.getNama() + "\n" + 
                            "GAJI       : " + kn2.getGaji() + "\n" +
                            "USIA       : " + kn2.getUsia() + "\n" +
                            "Jam Kerja  : " + kn2.getGajiManager() + "\n" +
                            " ");

    System.out.println("====informasi Pegawai====");
        System.out.println("NAMA       : " + kn3.getNama() + "\n" + 
                            "GAJI       : " + kn3.getGaji() + "\n" +
                            "USIA       : " + kn3.getUsia() + "\n" +
                            "Jam Kerja  : " + kn3.getGajiManager() + "\n" +
                            " ");

    System.out.println("====informasi Pegawai====");
        System.out.println("NAMA       : " + kn4.getNama() + "\n" + 
                            "GAJI       : " + kn4.getGaji() + "\n" +
                            "USIA       : " + kn4.getUsia() + "\n" +
                            "Jam Kerja  : " + kn4.getGajiManager() + "\n" +
                            " ");

    System.out.println("====informasi Pegawai====");
        System.out.println("NAMA       : " + kn5.getNama() + "\n" + 
                            "GAJI       : " + kn5.getGaji() + "\n" +
                            "USIA       : " + kn5.getUsia() + "\n" +
                            "Jam Kerja  : " + kn5.getGajiManager() + "\n" +
                            " ");
    }
}


