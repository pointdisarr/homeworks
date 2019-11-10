import java.util.Random;

public class Human {
    Pet pet;
    Human mutter;
    Human father;
    boolean isTime = true;
    private String name, surname;
    private int year;
    private int iq;


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mutter = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mutter = mother;
        this.father = father;
    }


    public Human() {

    }

    public static void main(String[] args) {

        String[][] schedule = new String[7][2];


        schedule[0][0] = "Sunday";
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
        schedule[6][1] = "rest in peace";

    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickName());
    }

    public void describePet(Pet pet) {
        String sly = (pet.getTrickLevel() > 50) ? "very sly" : "not sly";
        System.out.println("I have a " + pet.getSpecies() + ". He is " + pet.getAge() + " years old and he is " + sly);
    }

    @Override
    public String toString() {
        return String.format("name=%s\n,surname=%s\n,year=%d\n," +
                        " mother=%s\n,father=%s\n, pet=%s\n,{nickname=%s\n,age=%d\n, " +
                        "tricklevel=%d\n, habits = [eat, drink, sleep] }", name, surname, year,
                mutter.name, father.name, pet.getSpecies(), pet.getNickName(),
                pet.getAge(), pet.getTrickLevel());

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

            System.out.println("Hm... I will feed Jack's" + pet.getNickName());

        return true;


    }
}

