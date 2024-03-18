package Exercice2;

public class Bird implements Flight{
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
        System.out.println("I’m a bird who flaps wings to fly.");
    }

    public String toString(){
        return "Bird [" +"type="+type +"] : ";
    }
}
