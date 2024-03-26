/**Class: Airplane
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: March 20, 2024
 *
 * This class implements the method fly() from the Flight interface
 * and printout everything related, in our context, to an airplane
 */
package Exercice2;

public class Airplane implements Flight{

    //class attributes
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
        System.out.println("I’m an airplane that relies on an engine to fly.");
    }

    public String toString(){
        return "Airplane [" + "model="+model +", year="+yearBuilt +"] : ";
    }
}
