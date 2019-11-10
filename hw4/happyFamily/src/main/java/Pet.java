import java.util.Arrays;
import java.util.Random;

public class Pet {
    public Pet(String nickName, String species) {
        this.nickName = nickName;
        this.species = species;
    }

    public Pet(String nickName, String species, int age, Random rnd, int trickLevel, String[] habits) {
        this.nickName = nickName;
        this.species = species;
        this.age = age;
        this.rnd = rnd;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    private String nickName, species;
    private int age;
    Random rnd = new Random();
    private  int trickLevel = rnd.nextInt(101);
    private String[] habits;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return Arrays.copyOf(habits, habits.length);
    }

    public void setHabits(String[] habits) {
        this.habits = Arrays.copyOf(habits, habits.length);
    }

    public Pet() {

    }

    public static void main(String[] args) {

    }

    public void eat() {
        System.out.println("I'm eating");

    }

    public void response(Pet nickname) {
        System.out.println("Hello, owner, I am " + nickName + ". I miss you!");

    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
}
