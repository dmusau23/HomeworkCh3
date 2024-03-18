package Exercice3;

public class Bird implements Movement {
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void fly(){
        System.out.println("I flap my wings to fly.");
    }

    public void walk(){
        System.out.println("I walk on my feet.");
    }

    public void jump(){
        System.out.println("I jump by leaping from my feet.");
    }

    public String toString(){
        return "Bird [" +"type="+type +"] : ";
    }
}
