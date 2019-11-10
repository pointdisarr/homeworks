import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    Random rnd = new Random();
    Family family;
    private Pet pet = new Pet();
    private String name;
    private String surname;
    private int year;
    String[][] schedule = new String[7][2];
    { schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "home work, home work; take a shower";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to courses; watch another film";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "home work; homework; homework";
        schedule[5][0] = "Friday";
        schedule[5][1] = "PARTY HARD";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "rest in peace";}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                family.equals(human.family) &&
                Objects.equals(name, human.name) &&
                surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, surname, year);
    }

    Human() {

    }

    public static void main(String[] args) {


    }

    public Random getRnd() {
        return rnd;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "rnd=" + getRnd() +
                ", family=" + family +
                ", pet=" + getPet().getNickname() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello, " + getPet().getNickname());
    }

    public void describePet(Pet pet) {
        String sly = (pet.getTrickLevel() > 50) ? "very sly" : "not sly";
        System.out.println("I have a " + pet.getSpecies() + ". He is " + pet.getAge() + " years old and he is " + sly);
    }

    public boolean feedPet(boolean isTime) {

        Random rnd = new Random();

        int desiredLevel = rnd.nextInt(101);

        System.out.println("isn't it time for feeding ");

        if (isTime) {

            System.out.println("the owner feeds the pet");

        } else {
            System.out.println("nope, he's not that hungry");
            return false;
        }
        if (pet.getTrickLevel() > desiredLevel)

            System.out.println("Hm... I will feed Jack's" + pet.getNickname());

        return true;


    }
}
