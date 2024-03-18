package Exercice1;

import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        //create an arrayList taking the FarmAnimal objects.
        ArrayList<FarmAnimal> animal = new ArrayList<>();
        animal.add(new Duck("Donald","male",3.2,5,"Quack Quack"));
        animal.add(new Duck("Cheese","female",3.6,5,"Quack Quack"));
        animal.add(new Cow("Molly","female",1600,3,"Moo Moo"));
        animal.add(new Chicken("Albert","male",1.6,2,"Cock-a-Doodle-doo"));
        animal.add(new Chicken("Amelia","female",1.8,4,"Cluck Cluck"));
        animal.add(new Chicken("Dixie","female",1.7,4,"Cluck Cluck"));

        //Traverse the array and printout the objects
        for (FarmAnimal farmAnimal : animal) {
            System.out.println(farmAnimal);
        }

        //print the feeding schedule
        for(FarmAnimal farmAnimal : animal){
            System.out.println(farmAnimal.getName() +": " +farmAnimal.feedLoadingSchedule());
        }

    }
}
