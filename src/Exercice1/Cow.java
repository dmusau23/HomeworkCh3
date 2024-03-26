/**Class: Cow
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March, 2024
 *
 * This class – inherit from the abstract class FarmAnimal and implements
 * the methods feedLoadingSchedule to match the schedule of the cows
 */
package Exercice1;

public class Cow extends FarmAnimal{

    //class attributes
    private String sound;

    //constructor
    public Cow(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    //getters and setters
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    public String toString(){
        return "Cow " +sound +" " +super.toString();
    }

    /**
     * feedLoadingSchedule()
     * implement the abstract method to match the needs of our class
     * This method printout the feeding schedule for the cows in the farm
     */
    public String feedLoadingSchedule(){
        return "6am-4pm";
    }
}
