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

public class Bird implements Movement {
    private String type; // attribute

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
        System.out.println("I flap my wings to fly.");
    }

    /**
     * Method: walk()
     * this is an implementation of this abstract method from the Movement interface
     * print a message
     *
     */
    public void walk(){
        System.out.println("I walk on my feet.");
    }

    /**
     * Method: jump()
     * this is an implementation of this abstract method from the Movement interface
     * print a message
     */
    public void jump(){
        System.out.println("I jump by leaping from my feet.");
    }

    public String toString(){
        return "Bird [" +"type="+type +"] : ";
    }
}
