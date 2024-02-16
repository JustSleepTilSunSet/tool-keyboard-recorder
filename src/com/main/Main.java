package com.main;
import com.main.MainFrame;
import java.lang.Thread;
import java.lang.Runnable;
import java.awt.EventQueue;
import javax.swing.UIManager;

class Main{
    public static void LabelAnimation() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                }
                MainFrame mainFrame = new MainFrame();
            }
        });
    }
    public static void main(String[]args){
        LabelAnimation();
    }

}