/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

import javax.swing.*;

public class latihan6 {
    public static void main(String[] args) {
        latihan1 u = new latihan1();
        u.setSize(100, 100);

        JRadioButton[] teams = new JRadioButton[5];
        teams[0] = new JRadioButton("Sangat tidak setuju");
        teams[1] = new JRadioButton("Tidak setuju");
        teams[2] = new JRadioButton("Kurang setuju");
        teams[3] = new JRadioButton("Setuju", true);
        teams[4] = new JRadioButton("Sangat Setuju");

        JPanel panel = new JPanel();
        JLabel pernyataan = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek Jelas dan Mudah");
        panel.add(pernyataan);

        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < teams.length; i++) {
            group.add(teams[i]);
            panel.add(teams[i]);
        }

        u.add(panel);
        u.setVisible(true);
    }
}
