package com.example.a0002.action;

import com.example.a0002.ui.A0002UI;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import javax.swing.*;

public class A0002Action extends AnAction {

    JFrame jFrame = new JFrame("test");
    A0002UI a0002UI=new A0002UI();


    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        jFrame.setContentPane(a0002UI.getRoot());
        jFrame.setVisible(true);
        jFrame.setSize(1000,800);
        jFrame.toFront();
        jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
}
