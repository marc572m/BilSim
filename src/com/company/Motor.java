package com.company;

public class Motor {

    private boolean engineStatus;
    private int rPM;

    public Motor(){
        engineStatus = false;
        rPM = 0;
    }
    public int getrPM() {return rPM;}
    public void setrPM(int rPM) {this.rPM = rPM;}
    public boolean isEngineStatus() {return engineStatus;}
    public void setEngineStatus(boolean engineStatus) {this.engineStatus = engineStatus;}
}
