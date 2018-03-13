package hangmanGame;

import java.util.Random;
import java.util.Scanner;

public class HangmanAplication {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int answer;

        do
        {
                System.out.println("------------------------------");
                System.out.println("-Welcome in Hangman game menu-");
                System.out.println("------------------------------");
                System.out.println("-- 1.Start Game --------------");
                System.out.println("------------------------------");
                System.out.println("-- 2. Highstores -------------");
                System.out.println("------------------------------");
                System.out.println("-- 3. Exit -------------------");
                answer = scanner.nextInt();
                scanner.nextLine();
                switch (answer)
                {
                    case 1:
                        startGame (scanner);
                        break;
                    case 2:
                        highStores(scanner);
                        break;
                }
        }while (answer !=0);
    }

    private static void highStores(Scanner scanner) {

    }

    private static void startGame(Scanner scanner){
        String [] secretWords = {" Ala ma kota" , "Krzesło" , "Warszawa"};
        Random random = new Random();
        int messageIndex = random.nextInt(secretWords.length);
        boolean resultOfGame = game(scanner, secretWords[messageIndex]);
        if (resultOfGame){
            System.out.println("You Won");
        } else {
            System.out.println("You lose");
        }
    }

    private static boolean game (Scanner scanner, String text){
        char [] progressArray = generateProgressArray(text);
        System.out.println("Try to find out");
        int attemps = 5;
        do {
            System.out.println("Attemps left = " + attemps);
            System.out.println(String.valueOf(progressArray));
            char c = scanner.nextLine().charAt(0);
            boolean insertResult = tryToInsertLetter(c, progressArray, text);
            if (!insertResult) {
                attemps--;
            }
        } while (attemps > 0 && !isFinished(progressArray, text));


        return attemps > 0;
    }

    private static boolean isFinished(char[] progressArray, String text) {
        return String.valueOf(progressArray).equals(text);
    }

    private static boolean tryToInsertLetter(char c, char[] progressArray, String text) {
        boolean result = text.contains(String.valueOf(c) );
        if (result){
            for (int i = 0; i < text.length(); i++) {
                progressArray[i] = (capitalize(text.charAt(i)) == capitalize(c)) ? text.charAt(i) : progressArray[i];
            }
        }
        return false;
    }

    private static char[] generateProgressArray(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = isLetter(array[i]) ? '_' : array[i];
        }
        return array;
    }

    public static boolean isLetter (char c){
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }

    private static char capitalize (char c) {
        return (isSmallLetter(c) ? (char)(c -32): c);
    }

    private static boolean isSmallLetter(char c){
        return c >= 'a' && c <= 'z';
    }
}
