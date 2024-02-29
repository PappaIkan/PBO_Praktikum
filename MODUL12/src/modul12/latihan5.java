/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author lenovo
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class latihan5 {
    public static void main(String[] args) {
        latihan1 u = new latihan1();
        JLabel nama = new JLabel("Nama : ");
        JLabel password = new JLabel("Password : ");
        JTextField inputNama = new JTextField(15);
        JPasswordField inputpsw = new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputpsw);
        u.add(panel);
        u.setVisible(true);
 
    }
}
