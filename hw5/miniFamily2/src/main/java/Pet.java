import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Pet {
    Random rnd = new Random();


    private String species;
    private String nickname;
    private int age;
    private int trickLevel = rnd.nextInt(101);
    private String[] habits;


    public static void main(String[] args) {

    }

    private void eat() {
        System.out.println(" is eating..");
    }

    private void response() {
        System.out.println("Hello owner, I'm " + nickname + ". I miss you! ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                rnd.equals(pet.rnd) &&
                species.equals(pet.species) &&
                nickname.equals(pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rnd, species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    public Random getRnd() {
        return rnd;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        String[] copy = new String[this.habits.length];
        System.arraycopy(this.habits, 0, copy, 0, copy.length);
        return copy;
    }

    public void setHabits(String[] hbts) {
        this.habits = new String[hbts.length];
        System.arraycopy(hbts, 0, this.habits, 0, hbts.length);
    }

    private void foul() {
        System.out.println("I need to cover it up..");
    }


    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

}

