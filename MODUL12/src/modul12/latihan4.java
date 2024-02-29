/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author lenovo
 */
public class latihan4 {
    public static void main(String[] args) {
        latihan1 l = new latihan1();
        l.setSize(500,500);
        URL img = latihan3.class.getResource("nakano.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        l.add(panel);
        l.setVisible(true);
    }
}
