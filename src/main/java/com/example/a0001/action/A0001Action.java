package com.example.a0001.action;

import com.example.a0001.ui.MyDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class A0001Action extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        MyDialog dialog = new MyDialog();
        dialog.setTitle("标题");
        dialog.show();
    }
}
