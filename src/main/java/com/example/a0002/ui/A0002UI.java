package com.example.a0002.ui;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class A0002UI extends JFrame {
    private JPanel root;
    private JTable exampleTable;


    public JPanel getRoot() {
        return root;
    }

    public A0002UI() {
        exampleTable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.isControlDown() && e.getKeyChar()== KeyEvent.VK_R) {

                }
            }
        });
    }
}

