package com.component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ConfirmBtnActions implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { 
        System.out.println("beclickedl");
    }
}