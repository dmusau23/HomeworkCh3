/**Interface: Movement
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: March 20, 2024
 *
 * This is an interface that inherit from with the Flight interface and has the walk and jump method as it's only implementable methods.
 *
 */
package Exercice3;

public interface Movement extends Flight {
    void walk();
    void jump();
}
