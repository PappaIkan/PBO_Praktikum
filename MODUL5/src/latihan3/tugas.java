/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author lenovo
 */
public class tugas {
    String nama, nim;
    int umur;

    public tugas(){
        this.nama= "pandu";
        this.nim = "L200220227";
        this.umur= 33;
        System.out.println(this.nama);
        System.out.println(this.nim);
        System.out.println(this.umur);
    }

    public tugas(String nama, String nim, int umur){
        this.nama= nama;
        this.nim = nim;
        this.umur = umur;
    }

    public void getinfo(){
        System.out.println(this.nama);
        System.out.println(this.nim);
        System.out.println(this.umur);
    }
}
