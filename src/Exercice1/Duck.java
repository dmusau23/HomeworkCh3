package Exercice1;

public class Duck extends FarmAnimal{

    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    public String toString(){
       return "Duck " +sound +" " +super.toString();
    }

    public String feedLoadingSchedule(){
        return "8am-12pm-6pm";
    }
}
