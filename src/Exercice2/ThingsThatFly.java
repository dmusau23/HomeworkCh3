/**Class: ThingsThatFly
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: March 20, 2024
 *
 * This is the tester class. it contains the main method
 *
 */

package Exercice2;

import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        //we create a new arrayList that will take elements from the reference FLight

        ArrayList<Flight> things = new ArrayList<>();

        //we add new instantiations to the array

        things.add(new Airplane("Boeing 747",2016));
        things.add(new Bird("Eagle"));
        things.add(new Bird("HummingBird"));

        //traverse the arrayList and printOut the objects and call the fly method
        for(Flight thing : things){
            System.out.print(thing);
            thing.fly();
        }
    }
}
