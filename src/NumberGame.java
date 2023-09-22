import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random ob = new Random();

        int minrange = 1;
        int maxrange = 100;
        int maxattempts = 10;
        int score = 0;

        System.out.println("Welcome To The NUMBER GAME");

        while (true)
        {
            int randomnumber = ob.nextInt(maxrange - minrange + 1) + minrange;
            int attempts = 0;

            System.out.println("I Have Selected A Number Between " + minrange + "And " + maxrange);
            System.out.println("Try To Guess It ?");

            while (attempts < maxattempts)
            {
                System.out.print("Enter Your Guess: ");
                int guess = sc.nextInt();
                attempts++;

                if(guess < minrange || guess > maxrange)
                {
                    System.out.println("Please Enter The Number Within Limit");
                }
                else if (guess == randomnumber)
                {
                    System.out.println("Congratulations! You Have Guessed The Correct Number In" + attempts + "Attempts");
                    score++;
                    break;
                }
                else if (guess < randomnumber)
                {
                    System.out.println("Too Low! Guess Again");
                }
                else
                {
                    System.out.println("Too High! Guess Again");
                }
                if (attempts == maxattempts)
                {
                    System.out.println("Sorry Atempts Over :( The Correct Answer Was: " + randomnumber);
                }
            }
            System.out.println("Do You Want To Play More ? (YES/NO) : ");
            String play = sc.next();
            if (!play.equalsIgnoreCase("YES"))
            {
                break;
            }
        }
        System.out.println("Thanks For Playing :) Your Score Is: " + score);
    }
}