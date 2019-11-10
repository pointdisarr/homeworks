import java.util.Scanner;

public class weekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


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

        System.out.println("Please, input the day of the week: ");

        String weekDay = sc.nextLine();

        while (weekDay != "exit") {
            switch (weekDay.toUpperCase()) {

                case "CHANGE SUNDAY" :

                    System.out.println("Enter a new task for that day");
                    schedule[0][1] = sc.nextLine();
                    System.out.println("The task has been changed!");
                    weekDay = sc.nextLine();
                    break;

                case "CHANGE MONDAY" :

                    System.out.println("Enter a new task for that day");
                    schedule[1][1] = sc.nextLine();
                    System.out.println("The task has been changed!");
                    weekDay = sc.nextLine();
                    break;
                case "CHANGE TUESDAY" :

                    System.out.println("Enter a new task for that day");
                    schedule[2][1] = sc.nextLine();
                    System.out.println("The task has been changed!");
                    weekDay = sc.nextLine();
                    break;

                case "CHANGE WEDNESDAY" :

                    System.out.println("Enter a new task for that day");
                    schedule[3][1] = sc.nextLine();
                    System.out.println("The task has been changed!");
                    weekDay = sc.nextLine();
                    break;

                case "CHANGE THURSDAY" :

                    System.out.println("Enter a new task for that day");
                    schedule[4][1] = sc.nextLine();
                    System.out.println("The task has been changed!");
                    weekDay = sc.nextLine();
                    break;
                case "CHANGE FRIDAY" :

                    System.out.println("Enter a new task for that day");
                    schedule[5][1] = sc.nextLine();
                    System.out.println("The task has been changed!");
                    weekDay = sc.nextLine();
                    break;
                case "CHANGE SATURDAY" :

                    System.out.println("Enter a new task for that day");
                    schedule[6][1] = sc.nextLine();
                    System.out.println("The task has been changed!");
                    weekDay = sc.nextLine();
                    break;

                case "EXIT":

                    System.out.println("exiting...");
                    System.exit(1);
                    weekDay = sc.nextLine();
                    break;

                case "SUNDAY":
                    System.out.println(schedule[0][1]);
                    weekDay = sc.nextLine();

                    break;

                case "MONDAY":
                    System.out.println(schedule[1][1]);
                    weekDay = sc.nextLine();
                    break;

                case "TUESDAY":
                    System.out.println(schedule[2][1]);
                    weekDay = sc.nextLine();
                    break;

                case "WEDNESDAY":
                    System.out.println(schedule[3][1]);
                    weekDay = sc.nextLine();
                    break;

                case "THURSDAY":
                    System.out.println(schedule[4][1]);
                    weekDay = sc.nextLine();
                    break;

                case "FRIDAY":
                    System.out.println(schedule[5][1]);
                    weekDay = sc.nextLine();
                    break;

                case "SATURDAY":
                    System.out.println(schedule[6][1]);
                    weekDay = sc.nextLine();
                    break;

                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    weekDay = sc.nextLine();

            }

        }

    }
}






