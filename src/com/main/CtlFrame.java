package com.main;

import com.main.MainFrame;

import com.component.ConfirmBtn;
import com.component.ConfirmBtnActions;
import com.component.FrameTextView;
import com.component.Constants;

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
    MainFrame mainFrame = null;
    int SPINNER_WIDTH = Constants.SPINNER_WIDTH;
    int SPINNER_HEIGHT = Constants.SPINNER_HEIGHT;
    int CONFIRM_BTN_WIDTH = Constants.CONFIRM_BTN_WIDTH;
    int CONFIRM_BTN_HEIGHT = Constants.CONFIRM_BTN_HEIGHT;

    public CtlFrame(String title){
        super(title);
        this.setVisible(true);
    }

    public CtlFrame setAllComponents(){
        this.setLayout(new GridLayout(1,5));
        this.setLocation(100,200);
        this.setSize(850,100);
        this.setResizable(false);
        spinner.setMaximumSize(new Dimension(SPINNER_WIDTH, SPINNER_HEIGHT));
        btn.setMaximumSize(new Dimension(CONFIRM_BTN_WIDTH, CONFIRM_BTN_WIDTH));
        this.add(new FrameTextView("Delay record time:"));
        this.add(spinner); // Set delay time.
        this.add(new JLabel("TBD1"));
        this.add(new JLabel("TBD2"));
        this.add(new JLabel("TBD3"));
        ConfirmBtn confirmBtn = new ConfirmBtn("Start");
        ConfirmBtnActions confirmBtnActions = new ConfirmBtnActions()
            .setBindSpinner(spinner)
            .getKeyboardRecords(this.mainFrame);
        this.add(confirmBtn.setAction(confirmBtnActions));
        return this;
    }
    public CtlFrame bindMainFrame(MainFrame mainFrame){
        this.mainFrame = mainFrame;
        return this;
    }
}