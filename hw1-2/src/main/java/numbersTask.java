import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TASK: NUMBERS
public class numbersTask {

    public static void main(String[] args) {

        Random rnd = new Random();

        int givenNumber;
        int advModeQuestion = rnd.nextInt(3);

        String[][] advModeArray ={{"Guess my birthyear",
               "When is the last time I had a girlfriend",
              "When is the first macbook released" },
               {"1997", "2009", "2006"}};


        int[] guessedNumbers = new int[9];
        System.out.println("What is your name? ");



        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //getting input name

        System.out.println("Hi " + name + ", Let the game begin! You have 10 moves! ");
        System.out.println(name + ", what do you think is the number [1-100]?");








        do {
            System.out.println("lets go!");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.println("Well, according to my math teacher, that was not a number");

            }
            givenNumber = sc.nextInt();
        } while (givenNumber < 0);





        int hiddenNumber = rnd.nextInt(100);
        int steps = 1;

        int i = 0;
        i = i - 1;
        while (givenNumber != hiddenNumber) {

            if (givenNumber < hiddenNumber) {
                System.out.println("go higher!");
                steps++;

            } else {
                System.out.println("a bit lower...");
                steps++;
            }
            i++;
            if (!(steps >= guessedNumbers.length)) {
                guessedNumbers[i] = givenNumber;

            } else {
                System.out.println("You are outta moves. Try again!");

                System.exit(1);
            }

            givenNumber = sc.nextInt();
        }

        System.out.println("Congratulations " + name + "!");
        System.out.println("The number is: " + hiddenNumber);
        System.out.println("You have guessed it at " + steps + "th step");
        System.out.println("And theese are guessed numbers " + Arrays.toString(guessedNumbers));
        System.out.println();


        System.out.println();

        System.out.println("YOU HAVE PROCEED TO THE ADVANCED MODE -- ");
        System.out.println(advModeArray[0][advModeQuestion]);
        System.out.println();



        String tempLine = sc.next();


                while(sc.hasNextLine()) {

                    if (tempLine.equals(advModeArray[1][advModeQuestion].toString())) {
                        System.out.println("CONGRATS, MADMAN!");
                        break;
                    } else {
                        System.out.println("Try Again!");
                        tempLine = sc.next();
                    }

                }}
    }







