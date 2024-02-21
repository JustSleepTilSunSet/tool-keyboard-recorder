package com.component;
import com.component.ConfirmBtnActions;
import javax.swing.JButton;
import java.awt.Font;
import com.component.Constants;

public class ConfirmBtn extends JButton{
    public ConfirmBtn(String buttonLabel){
        super(buttonLabel);
        this.setFont(Constants.Arial_Bold_16);
        this.addActionListener(new ConfirmBtnActions());
    }
    public ConfirmBtn(){
        this.addActionListener(new ConfirmBtnActions());
    }
}