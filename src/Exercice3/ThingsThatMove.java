package Exercice3;

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> things = new ArrayList<>();
        things.add(new Airplane("Boeing 747",2016));
        things.add(new Bird("Eagle"));
        things.add(new Bird("HummingBird"));

        for(Movement thing : things){
            System.out.println(thing);
            thing.fly();
            thing.walk();
            thing.jump();
        }
    }
}
