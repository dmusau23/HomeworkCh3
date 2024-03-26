/**Class: FarmAnimal
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March, 2024
 *
 * This class – This the superclass that is abstract and
 * has an abstract method feedLoadingSchedule() that will be implemented by its subclasses
 */

package Exercice1;

public abstract class FarmAnimal {
    //class attributes
    protected String name;
    protected String gender;
    protected double weight;
    protected int age;

    //constructor
    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" +
                "name=" + name +
                ", gender=" + gender +
                ", weight=" + weight +
                ", age=" + age +
                ']';
    }

    /**
     * Method: feedLoadingSchedule()
     * this method printout the feeding schedule
     */
    public abstract String feedLoadingSchedule();
}
