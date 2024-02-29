/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author lenovo
 */
public class PersegiPanjang extends methodAbstract {
    int panjang = 8;
    int lebar = 5;
    
    
    public double luas(){
        return panjang*lebar;
    }


    public double keliling(){
        return 2*(panjang + lebar);
    }

}
