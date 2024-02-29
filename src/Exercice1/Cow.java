package Exercice1;

public class Cow extends FarmAnimal{

    private String sound;

    public Cow(String name, String gender, double weight, int age, String sound) {
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
        return "Cow " +sound +" " +super.toString();
    }

    public String feedLoadingSchedule(){
        return "6am-4pm";
    }
}
