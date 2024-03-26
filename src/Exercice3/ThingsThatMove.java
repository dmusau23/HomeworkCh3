/**Class: ThingsThatMove
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: March 20, 2024
 *
 * This is the tester class. it contains the main method
 *
 */
package Exercice3;

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {

        //we create a new arrayList that will take elements from the reference FLight

        ArrayList<Movement> things = new ArrayList<>();

        //we add new instantiations to the array

        things.add(new Airplane("Boeing 747",2016));
        things.add(new Bird("Eagle"));
        things.add(new Bird("HummingBird"));

        //traverse the arrayList and printout the different objects and the results of the fly, walk and jump method.
        for(Movement thing : things){
            System.out.println(thing);
            thing.fly();
            thing.walk();
            thing.jump();
        }
    }
}
