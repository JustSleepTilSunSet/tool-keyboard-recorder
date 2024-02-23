package com.component;
import com.component.ConfirmBtnActions;
import javax.swing.JButton;
import java.awt.Font;
import com.component.Constants;
import javax.swing.JSpinner;

public class ConfirmBtn extends JButton{
    Object bindComponent = null;
    JSpinner spinner = new JSpinner();

    public ConfirmBtn(String buttonLabel){
        super(buttonLabel);
        this.setFont(Constants.Arial_Bold_16);
    }

    public ConfirmBtn setAction(ConfirmBtnActions action){
        this.addActionListener(action);
        return this;
    }
}