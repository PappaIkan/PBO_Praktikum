/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nonVOID;

/**
 *
 * @author lenovo
 */
public class NONVOID {
    public String getName(String nama){
        return nama;
    }
    
    public String getNIM(String NIM){
        return NIM;
    }
    
    void main(){
        System.out.println("nama : " + getName("joko") + "\n" + 
                        "nim : " + getNIM("L3456789"));
    }
    
    
    public static void main(String [] args){
    NONVOID NV = new NONVOID();
    NV.main();
    }
}
