package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bil bil = new Bil();
        Scanner in = new Scanner(System.in);

        System.out.println("The car object has been initialised\n");

        System.out.println(bil);

        while(true) {
            System.out.println("\nWaiting for commands to start. (e.g start, stop, accelerate, control, brake, turn, status)");
            String input = in.next().toLowerCase(Locale.ROOT);
            
            switch (input) {
                case "power":
                    // Turn on or off
                    bil.powerButton();
                    break;
                case "accelerate":
                    System.out.println("Either press + or -");
                    String accInput = in.next().toLowerCase(Locale.ROOT);
                    switch (accInput) {
                        case "+":
                            //add speed vroom vroom
                            bil.accPos();
                            break;
                        case "-":
                            bil.accNeg();
                            break;
                        default:
                            System.err.println("not a valid input");
                            break;
                    }
                    break;

                    case "control":
                            System.out.println("Input a number between 0 - 100 to determine RPM in %");
                        try {
                            while (!in.hasNextInt()){
                                System.err.println("That's not a valid");
                                in.next();
                            }
                            int intInput = in.nextInt();

                                if (intInput <= 100 && intInput >= 0) {
                                    bil.accSet(intInput);

                                    break;
                                }else {
                                    System.err.println("NUmber has to be between 0-100");
                                    break;
                                }
                            }catch(NumberFormatException e){
                                System.err.println("Not a valid input");
                                break;
                        }

                    }


            }
        }

}
