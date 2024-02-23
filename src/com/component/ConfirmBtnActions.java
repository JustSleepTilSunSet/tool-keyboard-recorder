package com.component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class ConfirmBtnActions implements ActionListener {
    JSpinner spinner = null;

    public ConfirmBtnActions setBindSpinner(JSpinner spinner){
        this.spinner = spinner;
        return this;
    }

    public void getSpinnerValue(){
        System.out.println(this.spinner.getValue().toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getSpinnerValue();
    }
}