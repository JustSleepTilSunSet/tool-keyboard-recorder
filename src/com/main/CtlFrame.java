package com.main;
import com.component.ConfirmBtn;
import com.component.ConfirmBtnActions;
import com.component.FrameTextView;

import javax.swing.JSpinner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;

class CtlFrame extends JFrame{
    JSpinner spinner = new JSpinner();
    JButton btn = new JButton("Start");
    public CtlFrame(String title){
        super(title);
        this.setLayout(new GridLayout(1,5));
        this.setLocation(100,200);
        this.setSize(850,100);
        this.setResizable(false);
        spinner.setMaximumSize(new Dimension(50,50));
        btn.setMaximumSize(new Dimension(100,50));
        this.add(new FrameTextView("Delay record time:"));
        this.add(spinner); // Set delay time.
        ConfirmBtn confirmBtn = new ConfirmBtn("Start");
        this.add(confirmBtn.setAction(new ConfirmBtnActions().setBindSpinner(spinner)));
        this.add(new JLabel("TBD1"));
        this.add(new JLabel("TBD2"));
        this.add(new JLabel("TBD3"));
        this.setVisible(true);
    }
}