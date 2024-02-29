/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author lenovo
 */
public class Lampu implements ActivityLampu{
    public int statusLampu;
    
    public void matikanLampu(){
        if(statusLampu==0){
            System.out.print("Lampu sudah dalam kondisi mati\n***");
        }else if(statusLampu==-1){
            statusLampu=-1;
            System.out.print("Lampu sudah dimatikan\n***");
        }
    }
    
    public void hidupkanLampu(){
        if(statusLampu==1){
            System.out.print("Lampu sudah dinyalakan\n***");
        }else{
            statusLampu = statusLampu - 1;
            System.out.print("Lampu sudah dalam kondisi menyala\n***");
        }
    }
    
    public void redupkankanLampu(){
        if(statusLampu==2){
            System.out.print("Lampu sudah diredupkan\n***");
        }else{
            statusLampu= statusLampu -1;
            System.out.print("Lampu sudah dalam kondisi redup\n***");
        }
    }
    
    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }
}
