/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggstest;



/**
 *
 * @author barcz
 */
public class EggsTest {

    /**
     * @param args the command line arguments
     * 
     * Balazs Barcza
     * 
     * A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.
     * If an egg is dropped from above that floor, it will break. 
     * If it is dropped from that floor or below, it will be completely undamaged and you can drop the egg again.
     * Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EggProgRun start = new EggProgRun();
        System.out.println(" AI will find the random floor");
        start.setFloor();
        start.run();
        
        
    }
    
}
