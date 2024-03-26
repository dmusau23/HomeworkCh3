/**Class: FarmAnimal
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March, 2024
 *
 * This class – This is the tester class containing the main method to test our differents objects
 */

package Exercice1;

import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        //create an arrayList taking the FarmAnimal objects.
        ArrayList<FarmAnimal> animal = new ArrayList<>();
        //add new instances of our different subclasses to the array
        animal.add(new Duck("Donald","male",3.2,5,"Quack Quack"));
        animal.add(new Duck("Cheese","female",3.6,5,"Quack Quack"));
        animal.add(new Cow("Molly","female",1600,3,"Moo Moo"));
        animal.add(new Chicken("Albert","male",1.6,2,"Cock-a-Doodle-doo"));
        animal.add(new Chicken("Amelia","female",1.8,4,"Cluck Cluck"));
        animal.add(new Chicken("Dixie","female",1.7,4,"Cluck Cluck"));

        //Traverse the array and printout the objects
        for (FarmAnimal farmAnimal : animal) {
            System.out.println(farmAnimal); //the printing is possible through the toString() method
        }

        //traverse the array and print the feeding schedule
        for(FarmAnimal farmAnimal : animal){
            System.out.println(farmAnimal.getName() +": " +farmAnimal.feedLoadingSchedule());
        }

    }
}
