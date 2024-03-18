package Exercice3;

public class Airplane implements Movement {
    private String model;
    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

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

    public void fly(){
        System.out.println("I rely on my engine to fly.");
    }

    public void walk(){
        System.out.println("I tax on my wheels.");
    }

    public void jump(){
        System.out.println("I cannot jump.");
    }

    public String toString(){
        return "Airplane [" + "model="+model +", year="+yearBuilt +"] : ";
    }
}
