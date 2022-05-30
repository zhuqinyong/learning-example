package com.example.a0002.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class A0002UI extends JFrame {

    private final JFrame jFrame = new JFrame("test");
    private final A0002UI a0002UI = new A0002UI();
    private final TableModel tableModel=new TableModel();

    {
        jFrame.setContentPane(a0002UI.getRoot());
        jFrame.setVisible(true);
        jFrame.setSize(1000, 800);
        jFrame.toFront();
        jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    private JPanel root;
    private JTable table;

    public JPanel getRoot() {
        return root;
    }

    public A0002UI() {
        table.setModel(tableModel);
    }
}
class TableModel extends DefaultTableModel{
    @Override
    public boolean isCellEditable(int row, int column) {
        return true;
    }

}

