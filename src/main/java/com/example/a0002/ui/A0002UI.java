package com.example.a0002.ui;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class A0002UI extends JFrame {

    private final JFrame jFrame = new JFrame("test");
    private final A0002UI a0002UI = new A0002UI();

    {
        jFrame.setContentPane(a0002UI.getRoot());
        jFrame.setVisible(true);
        jFrame.setSize(1000, 800);
        jFrame.toFront();
        jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    private JPanel root;
    private JTable exampleTable;

    public JPanel getRoot() {
        return root;
    }

    public A0002UI() {
        exampleTable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(" ");
            }
        });
    }
}

