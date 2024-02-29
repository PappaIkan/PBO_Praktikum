/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String [] args){
        Bank b = new Bank();
        BankPribadi BP = new BankPribadi();
        BankUmum bm = new BankUmum();
        BankPasar bp = new BankPasar();
        BankSyariah bs = new BankSyariah();
        
        System.out.println(b.rasioBunga());
        System.out.println(BP.rasioBunga());
        System.out.println(bm.rasioBunga());
        System.out.println(bp.rasioBunga());
        System.out.println(bs.rasioBunga());
    }
}
