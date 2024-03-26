/**Class: Airplane
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: March 20, 2024
 *
 * This class implements the method fly() from the Flight interface
 * and printout everything related, in our context, to a bird
 */

package Exercice2;

public class Bird implements Flight{
    private String type; //class attribute

    //constructor
    public Bird(String type) {
        this.type = type;
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Method: fly()
     * this is an implementation of this abstract method from the FLight interface
     * print a message
     *
     */

    public void fly(){
        System.out.println("I’m a bird who flaps wings to fly.");
    }

    public String toString(){
        return "Bird [" +"type="+type +"] : ";
    }
}
