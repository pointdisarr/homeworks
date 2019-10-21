import java.util.Arrays;
import java.util.Scanner;

public class shootinTheSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] area = {{"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"}};
        System.out.println("All set. Get ready to rumble!");

        System.out.println("You have 3 bullets");

        System.out.println(Arrays.deepToString(area).replace("], ", "] \n"));
        int enteredLine;
        int shootingBar;
        int shots = 0;
        int bombShots = 0;

        do {
            System.out.println("Enter the line that you want to shoot");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("What? Just focus on the line you want to shoot");
            }


            enteredLine = sc.nextInt();
            System.out.println("Adjust the shooting bar");
            shootingBar = sc.nextInt();

            if (enteredLine < 0 || enteredLine > 5 || shootingBar < 0 || shootingBar > 5) {
                System.out.println("You missed the shot, try again");
                sc.next();
            } else {
                area[enteredLine][shootingBar] = "*";
                shots++;
                System.out.println(Arrays.deepToString(area).replace("], ", "]\n"));
            }
        }
        while (shots < 3);

        do {
            System.out.println("You found 1 bomb. Enter the area you want to BOMB: ");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("What? Just focus on the line you want to BOMB");
            }
            int enteredBomb = sc.nextInt();
            if (enteredBomb < 0 || enteredBomb > 5) {
                System.out.println("Are you sure you gonna throw there? You are going to lose your only bomb");
                sc.next();
            } else {
                area[enteredBomb][enteredBomb - 2] = "X";
                area[enteredBomb][enteredBomb] = "X";
                area[enteredBomb][enteredBomb - 1] = "X";
                bombShots++;
                System.out.println(Arrays.deepToString(area).replace("], ", "]\n"));
            }
        }
        while (bombShots < 1);
        System.out.println("Mission Completed");


    }
}

