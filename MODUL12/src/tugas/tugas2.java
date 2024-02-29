package tugas;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class tugas2 extends JFrame {
    public tugas2() {
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        tugas2 frame = new tugas2();
        JPanel panel = new JPanel();
        JMenu menu = new JMenu("Ubah warna");
        JCheckBox itemblue = new JCheckBox(new AbstractAction("Blue") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.blue);
            }
        });
        JCheckBox itemYellow = new JCheckBox(new AbstractAction("Kuning") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.YELLOW);
            }
        });
        JCheckBox itemHijau = new JCheckBox(new AbstractAction("Hijau") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });
        menu.add(itemblue);
        menu.add(itemYellow);
        menu.add(itemHijau);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.add(panel);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
