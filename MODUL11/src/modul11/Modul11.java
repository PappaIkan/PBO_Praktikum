/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul11;

/**
 *
 * @author lenovo
 */
public class Modul11 {

    String nama = "Pandu Adi Wijaya Kusuma";
    String nim = "L200220227";
    
    public void printnama(){
        System.out.println(nama + " : " + nim);
    }
    
    static class StaticNestedClass{
        static String jurusan = "informatika";
        
        public static void printf(Modul11 newmodul11){
            newmodul11.printnama();
        }
    }
    
    class InnerClass{
        void JURUSAN(){
        System.out.println(StaticNestedClass.jurusan);
    }
    }
    
    public static void main(String[] args) {
       Modul11 m11 = new Modul11();
       
       InnerClass in = m11.new InnerClass();
       
       StaticNestedClass.printf(m11);
       
       in.JURUSAN();
       
       
    }
    
}
