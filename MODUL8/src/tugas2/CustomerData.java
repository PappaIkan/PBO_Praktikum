/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author lenovo
 */
public class CustomerData {
    private String nama;
    private String alamat = "___";
    private String tanggalLahir = "___";
    private String pekerjaan = "___ ";
    private double gaji = 0;
    
    public CustomerData(String nama){
        this.nama  = nama;     
    }
    
    public CustomerData(String nama, String alamat){
        this.nama  = nama; 
        this.alamat  = alamat;
    }
    
    public CustomerData(String nama, String alamat, String tanggalLahir){
        this.nama  = nama; 
        this.alamat  = alamat;
        this.tanggalLahir  = tanggalLahir;
    }
    
    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan){
        this.nama  = nama; 
        this.alamat  = alamat;
        this.tanggalLahir  = tanggalLahir;
        this.pekerjaan  = pekerjaan;
      }
    
    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji){
        this.nama  = nama; 
        this.alamat  = alamat;
        this.tanggalLahir  = tanggalLahir;
        this.pekerjaan  = pekerjaan;
        this.gaji  = gaji;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getnama(){
    return nama;
    }
    
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getalamat(){
    return alamat;
    }
    
    public void settanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
    
    public String gettanggalLahir(){
    return tanggalLahir;
    }
    
    public void setpekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    
    public String getpekerjaan(){
    return pekerjaan;
    }
    
    public void setgaji(double gaji){
        this.gaji = gaji;
    }
    
    public double getgaji(){
    return gaji;
    }
    
    
    public void printinfo(){
    System.out.println(
    "NAMA : " + this.nama + "\n" +
    "NAMA : " + this.alamat + "\n" +
    "NAMA : " + this.tanggalLahir + "\n" +
    "NAMA : " + this.pekerjaan + "\n" +
    "NAMA : " + this.gaji + "\n" +
    " " + "\n"
    );
    }
    
}
