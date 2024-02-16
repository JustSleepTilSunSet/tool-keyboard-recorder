package com.main;
import java.lang.Thread;
import java.lang.Runnable;
import java.awt.Robot;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Dimension;

class MainFrame extends JFrame{
    public JTextArea textArea = new JTextArea();
    ArrayList<String> actions = new ArrayList<String>();
    JPanel container = new JPanel();
    int index = 0;
    public class kbChecker extends KeyAdapter{
        KeyEvent event;
        @Override
        public void keyPressed(KeyEvent e){
            System.out.println("Pressed: "+e.getKeyCode());
            System.out.println(e.getKeyCode());
            actions.add("Pressed_"+e.getKeyCode());
            System.out.println("testing: "+actions.get(index));
            textArea.append("Press" + e.getKeyCode() + "\n");
            index++;
            this.event = e;
        }
        @Override
        public void keyReleased(KeyEvent e){
            System.out.println("Release: "+e.getKeyCode());
            actions.add("Released_"+e.getKeyCode());
            System.out.println("testing: "+actions.get(index));
            textArea.append("Release" + e.getKeyCode() + "\n");
            index++;
            this.event = e;

        }
    }

    public MainFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.getContentPane().add(textArea, BorderLayout.CENTER);
        // scrPane.add(textArea);
        JScrollPane scrPane = new JScrollPane(container);
        container.add(textArea, BorderLayout.WEST);
        textArea.setPreferredSize(new Dimension(100,16000));
        this.getContentPane().add(scrPane, BorderLayout.WEST);
        this.pack();
        this.addKeyListener(new kbChecker());
        this.setVisible(true);
        this.setFocusable(true);
        textArea.setEditable(false);
        textArea.setFocusable(false);
    }

}