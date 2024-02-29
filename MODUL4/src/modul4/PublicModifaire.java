/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author lenovo
 */
public class PublicModifaire {
 public int a = 2;
 public int b = 5;
 public int c = 9;
 public void kali(){
 int d = a*b*c;
 System.out.println("Hasil kali = "+  d);
}
 public void tambah(){
 int d = a+b+c;
 System.out.println("Hasil kali = "+  d);
 }
 public void kurang(){
 int d = a-b-c;
 System.out.println("Hasil kali = "+  d);
 }
 public void bagi(){
 int d = a/b/c;
 System.out.println("Hasil kali = "+  d);
 }
 public void rata_rata(){
 int d = (a+b+c)/3;
 System.out.println("Hasil kali = "+  d);
 }
 
 public static void main(String [] args){
     PublicModifaire P = new PublicModifaire();
     P.kali();
     P.tambah();
     P.kurang();
     P.bagi();
     P.rata_rata();
 }
}
