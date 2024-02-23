package com.component;

import com.main.MainFrame;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JSpinner;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmBtnActions implements ActionListener {
    JSpinner spinner = null;
    ArrayList<String> actions = new ArrayList<String>();
    public ConfirmBtnActions setBindSpinner(JSpinner spinner){
        System.out.println(spinner);
        this.spinner = spinner;
        return this;
    }

    public ConfirmBtnActions getKeyboardRecords(MainFrame mainFrame){
        this.actions = mainFrame.getKeyboardRecords();
        return this;
    }

    public void getSpinnerValue(){
        System.out.println(this.spinner.getValue().toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getSpinnerValue();
        if(!actions.isEmpty())
            System.out.println(actions.get(0));
    }
}