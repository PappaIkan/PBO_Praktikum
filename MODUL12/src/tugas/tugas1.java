/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import javax.swing.*;

public class tugas1 extends JFrame {
    public tugas1() {
        super("Belajar Mengenal GUI");
        setSize(450, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        tugas1 frame = new tugas1();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek Jelas dan Mudah");
        String text[] = {"Sangat tidak setuju", "Tidak setuju", "Kurang setuju", "Setuju", "Sangat setuju"};
        JComboBox cb = new JComboBox(text);
        panel.add(label);
        panel.add(cb);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}



