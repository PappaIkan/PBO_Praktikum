/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author lenovo
 */
public class BangundatarDemo {
    public static void main(String [] args){
        Persegi pe = new Persegi();
        pe.sisi = 30;
        pe.hitungLuas();
        System.out.println(pe.hitungkeling());
        
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 40;
        pp.lebar = 20;
        pp.hitungLuas();
        System.out.println(pp.hitungkeliling());
        
        
        
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.sisiMiring = 8.00;
        stsk.hitungLuas();
        System.out.println(stsk.hitungkeliling());
        
        
        SegiTigaSamaSisi stss = new SegiTigaSamaSisi();
        stss.sisi = 7.00;
        stss.hitungLuas();
        System.out.println(stss.hitungkeliling());
        
    }
}
