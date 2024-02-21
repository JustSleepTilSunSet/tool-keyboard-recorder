package com.component;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import com.component.Constants;

public class FrameTextView extends JLabel{
    public FrameTextView(String content){
        super(content);
        this.setHorizontalAlignment(JLabel.LEFT); 
        this.setFont(Constants.Arial_Bold_16);
    }
}