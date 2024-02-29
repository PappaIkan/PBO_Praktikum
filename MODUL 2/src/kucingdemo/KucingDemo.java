/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kucingdemo;

/**
 *
 * @author lenovo
 */
public class KucingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kucing KUCING = new kucing();
        
        KUCING.umur = 5;
        KUCING.warnaBulu = "oren";
        
        KUCING.umur();
        KUCING.meong();
    }
    
}
