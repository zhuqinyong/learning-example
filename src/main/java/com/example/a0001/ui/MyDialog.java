package com.example.a0001.ui;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.JBColor;

import javax.swing.*;
import java.awt.*;

public class MyDialog extends DialogWrapper {

    private final JTextField mTextField = new JTextField();

    public MyDialog() {
        super(true);
        init();
    }

    @Override
    protected JComponent createNorthPanel() {
        JLabel title = new JLabel("表单标题");
        title.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        JPanel north = new JPanel();
        north.add(title);
        return north;
    }

    @Override
    protected JComponent createCenterPanel() {
        JLabel jLabel = new JLabel("请输入：");
        jLabel.setForeground(new JBColor(JBColor.RED, JBColor.BLUE));

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 1));
        center.add(jLabel);
        center.add(mTextField);
        return center;
    }

    @Override
    protected JComponent createSouthPanel() {
        JButton submit = new JButton("提交");
        submit.setHorizontalAlignment(SwingConstants.CENTER);
        submit.setVerticalAlignment(SwingConstants.CENTER);
        submit.addActionListener(e -> {
            close(OK_EXIT_CODE);
            if (mOnSubmitListener != null) {
                mOnSubmitListener.onSubmit(mTextField.getText());
            }
        });

        JPanel south = new JPanel();
        south.add(submit);
        return south;
    }

    private OnSubmitListener mOnSubmitListener;

    public void setmOnSubmitListener(OnSubmitListener mOnSubmitListener) {
        this.mOnSubmitListener = mOnSubmitListener;
    }

    interface OnSubmitListener {
        void onSubmit(String text);
    }
}
