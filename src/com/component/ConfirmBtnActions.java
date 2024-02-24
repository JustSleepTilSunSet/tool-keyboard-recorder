package com.component;

import com.main.MainFrame;
import com.component.KeyboardRecorderBot;

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JSpinner;

public class ConfirmBtnActions implements ActionListener {
    JSpinner spinner = null;
    ArrayList<String> actions = new ArrayList<String>();
    public ConfirmBtnActions setBindSpinner(JSpinner spinner){
        this.spinner = spinner;
        return this;
    }

    public ConfirmBtnActions getKeyboardRecords(MainFrame mainFrame){
        this.actions = mainFrame.getKeyboardRecords();
        return this;
    }

    public int getSpinnerValue(){
        System.out.println(this.spinner.getValue().toString());
        return Integer.parseInt(this.spinner.getValue().toString());
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            getSpinnerValue();
            if(!actions.isEmpty()){
                System.out.println(actions.get(0));
            }
            KeyboardRecorderBot bot = new KeyboardRecorderBot(actions, getSpinnerValue());
            bot.runKeyBoardRecord();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}