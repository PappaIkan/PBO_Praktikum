/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

import java.awt.Container;
import javax.swing.JButton;
public class latihan2 extends javax.swing.JFrame{
    public latihan2(){
        super("Frme dan Button");
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) { 
        latihan2 fa = new latihan2();
        Container kontainer = fa.getContentPane();
        JButton jbtOK = new JButton("OK");
        kontainer.add(jbtOK);
        fa.setVisible(true);
    }
}
