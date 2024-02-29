/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class AplikasiLampu {
    public static void main(String [] args){
        Lampu l = new Lampu();
        Scanner sc = new Scanner(System.in);
        l.statusLampu = l.setSaklar(0);
        while(true){
        System.out.println("Status Lampu = " + l.statusLampu + "\nketikkan");
        System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu\n2 unutk meredupkan lampu");
        
        int tombol = l.setSaklar(sc.nextInt());
        
        if( tombol == 0){
            l.matikanLampu();
        }else if( tombol == 2){
            l.redupkankanLampu();
        }else{
            l.hidupkanLampu();
        }
        }
    }
    
}
