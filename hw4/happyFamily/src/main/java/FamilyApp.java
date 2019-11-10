public class FamilyApp {
    public static void main(String[] args) {

        Human humanBeing = new Human("Octavian", "Skepta", 2019);
        Human aFamily = new Human();
        Human anotherFamily = new Human("Travis","Scott", 1996,
                new Human("J cole","Future",1970) , new Human("Q","Tip",1969));

        Human fullFamily = new Human("Phife","Dawg",1970, humanBeing.getIq(),
                new Pet(), new Human(), new Human() );

        Human mother = new Human("Dr.", "Dre", 2000);
        Human father = new Human("Kendrick", "Lamar", 2010);
        Human child = new Human("Tyler","The Creator", 2009);
        Pet doggie = new Pet("doggie", "Dog");

        father.greetPet(doggie);
        father.describePet(doggie);

        doggie.eat();
        doggie.foul();
        doggie.response(doggie);
        boolean time = true;
        fullFamily.feedPet(time);


    }
}
