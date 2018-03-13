package moreless;

import java.util.Random;
import java.util.Scanner;

public class MorelessApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer;
        do
            {
                System.out.println("-------------------------------");
                System.out.println("-Welcome in Moreless game menu-");
                System.out.println("-------------------------------");
                System.out.println("-- 1.Start Game ---------------");
                System.out.println("-------------------------------");
                System.out.println("-- 2. Read rules --------------");
                System.out.println("-------------------------------");
                System.out.println("-- 3. Bot ---------------------");
                System.out.println("-------------------------------");
                System.out.println("-- 4. Exit --------------------");
                answer = scanner.nextInt();
                scanner.nextLine();
                switch (answer)
                {
                    case 1:
                        startGame(scanner);
                                break;
                    case 2:
                        showRules(scanner);
                                break;
                    case 3:
                        measureDummyBot();
                        measureAnotherBot();
                                break;

                }
            } while (answer != 0);
    }

    private static void measureAnotherBot()
    {
        int sum = 0;
        for (int i = 0; i < 100; i++)
        {
            sum += anotherBot(randomNumberGenerator());
        } System.out.println("Another bot statistics = " + sum/100);
    }

    private static int anotherBot(int secretNumber)
    {
        int number;
        int counter = 0;
        do
        {
            number = counter;
            counter++;
        }while (compare(number, secretNumber) != 0);
        return counter;
    }

    private static void measureDummyBot()
    {
        //wywolac 100 razy dummyBota i obliczy srednia
        int sum = 0;
        for (int i = 0; i < 100; i++)
        {
            sum += dummyBot(randomNumberGenerator());
        } System.out.println("Dummy bot statistics = " + sum/100);
    }



    private static void startGame(Scanner scanner)
    {
        System.out.println();
        System.out.println("Press any key to continue");
        scanner.nextLine();
        int playerNumber;
        int secretNumber = randomNumberGenerator ();
        int counter = 0;
        do
        {
                System.out.println("Insert number");
                playerNumber = scanner.nextInt();
                counter++;
            gameStep(playerNumber, secretNumber);
        }
        while (playerNumber != secretNumber);
        System.out.println("Game is finished! Result = " + counter);


    }

    private static void gameStep(int playerNumber, int secretNumber)
    {
        if (compare(playerNumber, secretNumber) == -1)
        {
            System.out.println("Number is too small");
        } else if (compare(playerNumber, secretNumber) == 1)
            {
                System.out.println("Number is too big");
            }
    }

    private static void showRules(Scanner scanner)
    {
        System.out.println("You should insert a correct number");
        System.out.println("As fast as possible");
        System.out.println();
        System.out.println("Press any key to continue");
        scanner.nextInt();
    }


    private static int randomNumberGenerator()
    {
        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(101);
        return randomNumber;
    }


    public static int compare (int number, int secretNumber)
    {
        return number < secretNumber ? -1 : (number > secretNumber ? 1 : 0);
    }


    private static int dummyBot (int secretNumber)
    {
        int number;
        int counter = 0;
        Random random = new Random();
        do
        {
            number = random.nextInt(101);
            counter++;
        } while (compare(number, secretNumber) !=0 );
        return counter;
    }
}
