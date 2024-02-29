/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankdemo;

/**
 *
 * @author lenovo
 */
public class BankDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        akunBank akun = new akunBank();
        
        akun.tetapkanNoRekening(2000);
        akun.menabung(200000);
        akun.cekSaldo();
        akun.menarik(30000);
        akun.cekSaldo();
        akun.transfer(10000, 7891);
        akun.cekSaldo();
    }
    
}
