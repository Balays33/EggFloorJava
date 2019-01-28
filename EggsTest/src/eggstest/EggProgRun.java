/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggstest;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Balazs Barcza
 */
public class EggProgRun {
    
    private int drop1 = 50;
    private int help1 =0;
    private int help2 = 100;
    private boolean foundFloor = false;
    private int stepCount =0;
    private int floorshouldF;
    
    public void run() {

        System.out.println(" The first drop : " + drop1);
        while (foundFloor == false) {
            stepCount++;
            System.out.println("steps : " + stepCount);
            if (drop1 > floorshouldF) {
                System.out.println("We are too hight ");
                help2 = drop1;
                drop1 = ((help2 - help1) / 2) + help1;
            }
            if (drop1 < floorshouldF) {
                System.out.println("We are too lower ");
                help1 = drop1;
                drop1 = ((help2 - help1) / 2) + help1;
            }
            if (drop1 == floorshouldF) {
                foundFloor = true;
                System.out.println("Well done the save floor :" + floorshouldF);
            }
            System.out.println(" drop : " + drop1);
        }
        System.out.println(" You had to make " + stepCount + " steps");
    }

    public void setFloor() {
        Random r = new Random();
        floorshouldF = r.nextInt(99) + 1;
        System.out.println("This is the floor you should find it : " + floorshouldF);
    }
    
    
}
