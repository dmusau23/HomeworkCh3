/**Class: Airplane
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: March 20, 2024
 *
 * This class implements the method fly(), walk() and jump() from the Movement interface
 * and printout everything related, in our context, to an airplane
 */

package Exercice3;

public class Airplane implements Movement {

    //class's attributes
    private String model;
    private int yearBuilt;

    //constructor
    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    //getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    /**
     * Method: fly()
     * this is an implementation of this abstract method from the FLight interface
     * print a message
     *
     */
    public void fly(){
        System.out.println("I rely on my engine to fly.");
    }

    /**
     * Method: walk()
     * this is an implementation of this abstract method from the Movement interface
     * print a message
     *
     */
    public void walk(){
        System.out.println("I tax on my wheels.");
    }

    /**
     * Method: jump()
     * this is an implementation of this abstract method from the Movement interface
     * print a message
     */
    public void jump(){
        System.out.println("I cannot jump.");
    }

    public String toString(){
        return "Airplane [" + "model="+model +", year="+yearBuilt +"] : ";
    }
}
