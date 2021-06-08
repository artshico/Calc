package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soma {
    private JTextField JTextFildN1;
    private JButton JButtonSoma;
    private JPanel JPanelPrincipal;
    private JTextField JTextField2;
    private javax.swing.JLabel JLabel;



    public Soma() {
        JButtonSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var primeiroCampo = Integer.parseInt(JTextFildN1.getText());
                var segundoCampo = Integer.parseInt( JTextField2.getText());
                JLabel.setText(String.valueOf(primeiroCampo + segundoCampo));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Soma");
        frame.setContentPane(new Soma().JPanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.pack();
    }
}
