package com.company;

public class Bil {

    private String biltype;
    private String model;
    private int stelnummer;
    private int numberdoors;
    private double softwareversion;
    private double gpsx;
    private double gpsy;
    private int speed;

    private Rat rat = new Rat();
    private Bremse bremse = new Bremse();
    private Motor motor = new Motor();
    private Hjul hjul = new Hjul();

    public Bil (){
        biltype = "Tesla";
        model = "Model X";
        stelnummer = 29309230;
        numberdoors = 5;
        softwareversion = 0.69;
        gpsx = 55.22458;
        gpsy = 11.757075;
        speed = 0;
    }

    public String toString() {
        return  "Type of car: " + biltype + "\n" +
                "Model: " + model + "\n" +
                "Vin number: " + stelnummer + "\n" +
                "Number of doors: " + numberdoors + "\n" +
                "Softwareversion: " + softwareversion + "\n" +
                "GPS Coordinates: " + gpsx + ", " + gpsy + "\n" +
                "Speed: " + speed + " km/t" + "\n";
    }

    public void powerButton(){
        motor.setEngineStatus(!motor.isEngineStatus());
        if (motor.isEngineStatus()){
            System.out.println(" The car has turned on!");
        }else System.out.println("Car has turned off!");
    }

    public void accPos(){
        if (motor.getrPM() != 100){
            motor.setrPM(motor.getrPM()+1);
            System.out.println("The new RPM is now: "+ motor.getrPM() + "%");
        }else {
            System.out.println("RPM is already at 100%");
        }
    }
    public void accNeg(){
        if (motor.getrPM()>0){
            motor.setrPM(motor.getrPM()-1);
            System.out.println("The new RPM is now: "+ motor.getrPM() + "%");
        } else {
            System.out.println("RPM is already at 0%");
        }

    }
    public void accSet(int i){
        if(i <= 100 && i >= 0){
            motor.setrPM(i);
            System.out.println("The new RPM is now: "+ motor.getrPM() + "%");
        }
    }

    public String getBiltype() {return biltype;}
    public void setBiltype(String biltype) {this.biltype = biltype;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public int getStelnummer() {return stelnummer;}
    public void setStelnummer(int stelnummer) {this.stelnummer = stelnummer;}
    public int getNumberdoors() {return numberdoors;}
    public void setNumberdoors(int numberdoors) {this.numberdoors = numberdoors;}
    public double getSoftwareversion() {return softwareversion;}
    public void setSoftwareversion(double softwareversion) {this.softwareversion = softwareversion;}
    public double getGpsx() {return gpsx;}
    public void setGpsx(double gpsx) {this.gpsx = gpsx;}
    public double getGpsy() {return gpsy;}
    public void setGpsy(double gpsy) {this.gpsy = gpsy;}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
}
