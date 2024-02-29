/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author lenovo
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class latihan3 extends javax.swing.JFrame{
    public latihan3(){
        super("Frame dan Button");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
    }
    public static void main(String[] args) {
        latihan3 fb = new latihan3();
        JPanel panel = new JPanel();
        URL img = latihan3.class.getResource("nakano.png");
        JButton jbtOK = new JButton("OK");
        JButton jbtImg = new JButton(new ImageIcon(img)); 
        panel.add(jbtOK);
        panel.add(jbtImg); 
        fb.add(panel);
        fb.setVisible(true);
    }
}
