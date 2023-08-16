// task -1 : Number Guesssing Game

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100 - 1 + 1) + 1;
        System.out.println("Random number is: " + randomNum);
        System.out.println("Welcome to Guessing the Number Game");
        System.out.println("___________________________________________________________________");
        System.out.println("You Will Be Asked To Guess A Number between 1 to 100 to Win the Game");
        System.out.println("You have Maximum 7 Attempt Limit");
        System.out.println("___________________________________________________________________");
        int a = 7;
        while (a > 0) {
            Scanner sc = new Scanner(System.in);
            // user must enter the guessed number
            System.out.println("Enter a Guess Number between 1 to 100");
            int num = sc.nextInt();

            if (num > randomNum) {
                System.out.println("Your guess was too high, Try Again");
            } else if (num < randomNum) {
                System.out.println("Your guess was too low,Try again.");
            } else if ((num == randomNum)) {
                System.out.println("\n Congratulations !!!!! You Won The Game.");
                break;
            } else {
                continue; // To avoid error in case of invalid input from user side
            }
            a--;
            if (a <= 0) {
                System.out.println("Sorry!!, You ran out of lives.\n");
            }
        }
    }
}