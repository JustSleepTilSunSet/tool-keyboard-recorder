package com.component;

import java.awt.Robot;
import java.util.ArrayList;

class KeyboardRecorderBot extends Robot{
    ArrayList<String> actions = new ArrayList<String>();
    int delaySec = 0; // Defination is second.
    public KeyboardRecorderBot(ArrayList<String> actions, int delaySec) throws Exception{
        super();
        this.actions = actions;
        this.delaySec = delaySec > 0 ? delaySec : 0;
    }

    public void runKeyBoardRecord(){
        if(this.delaySec > 0 ){
            this.delay(this.delaySec*1000); // The delay time defined milli. second in JavaSE lib.
        }
        for(String cmd : this.actions){
            String[] parsedRes = cmd.split("_");
            String actionType = parsedRes[0];
            String interactCode = parsedRes[1];
            try{
                switch (actionType) {
                   case "Released":  
                       this.keyRelease(Integer.parseInt(interactCode));
                       break;
                   case "Pressed":
                       this.keyPress(Integer.parseInt(interactCode));
                       break;
                }
                this.delay(500);
             }catch(Exception ex){
                ex.printStackTrace();
             }
        }
    }
}