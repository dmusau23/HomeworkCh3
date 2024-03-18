package Exercice2;

import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        ArrayList<Flight> things = new ArrayList<>();
        things.add(new Airplane("Boeing 747",2016));
        things.add(new Bird("Eagle"));
        things.add(new Bird("HummingBird"));

        for(Flight thing : things){
            System.out.print(thing);
            thing.fly();
        }
    }
}
