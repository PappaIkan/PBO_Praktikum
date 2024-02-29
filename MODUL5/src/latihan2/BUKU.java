/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author lenovo
 */
public class BUKU {
    String  namaPengarang;
    String  judulBuku;
    int  tahunTerbit; 
    int  cetakanKe; 
    double hargaJual; 
    
    public BUKU(String  namaPengarang, String  judulBuku, int  tahunTerbit){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this. tahunTerbit =  tahunTerbit;
        this. cetakanKe =  1;
        this. hargaJual =  40.000;
    }
    
    public BUKU(String  namaPengarang, String  judulBuku, int  tahunTerbit, int cetakanKe){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this. tahunTerbit =  tahunTerbit;
        this. cetakanKe =  cetakanKe;
        this. hargaJual =  30.000;
    }

    public BUKU(String  namaPengarang, String  judulBuku, int  tahunTerbit, int cetakanKe, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this. tahunTerbit =  tahunTerbit;
        this. cetakanKe =  cetakanKe;
        this. hargaJual =  hargaJual;
    }

    public void cetakinfo(){
        System.out.println("\ninformasi buku");
        System.out.println("nama pengarang : "+namaPengarang);
        System.out.println("judul : "+judulBuku);
        System.out.println("tahun terbit : "+tahunTerbit );
        System.out.println("cetakan - ke : "+cetakanKe);
        System.out.print("harga : Rp"+hargaJual + "\n");
    }
}
