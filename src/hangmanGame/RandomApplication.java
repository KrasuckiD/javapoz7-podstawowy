package hangmanGame;

import java.util.Random;
import java.util.Scanner;

public class RandomApplication {
    private static void randomExample() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
//            ThreadLocalRandom.current().nextInt();
            System.out.println(random.nextInt(10) + 10);
        }
    }

    public static void main(String[] args) {
        //nowa tablica n elemntowa zlozona z loswych liczb
        //nowa tablica o wielkosci zdefiniowanej prze usera elemntowa zlozona z loswych liczb
        //z zakresu podanego prze usera
        //suma loswych elementow
        //metoda symulujaca rzut kostka do gry (zwraca wartosc)

//        int[] array = randomArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i + ". " + array[i]);
//        }
        //  randomArrayFromUser();

        homework();
    }

    public static void randomArrayFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify size");
        int size = scanner.nextInt();
        System.out.println("Specify bound");
        int bound = scanner.nextInt();
        System.out.println("Specify offset");
        int offset = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(bound) + offset;
            array[i] = number;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


        //wygenerowac 10 losowych liczb parzystych z zakresu 0 - 10 włącznie (zadanie domowe) - metoda

        public static void homework()
        {
            int n = 10;
            int[] array1 = new int[n];
            Random random1 = new Random();
            for (int i = 0; i < array1.length; i++)
            {
                int number = random1.nextInt(6) * 2;
                array1[i] = number;

            }
            for (int i = 0; i < array1.length; i++)
                {
                System.out.println("homework " + array1[i]);
                }
        }

        public static void sum ()
        {
            //TODO: napisac jeszcze raz genreowanie liczb
            int[] array2 = new int[10];
            int sum2 = 0;
            Random random2 = new Random();
            for (int i = 0; i < array2.length; i++)
            {
                array2[i] = random2.nextInt();
                sum2 += array2[i];
            }
            System.out.println("Sum = " + sum2);
        }

        public static int[] randomArray ()
        {
            int n = 10;
            int[] array5 = new int[n];
            Random random5 = new Random();
            for (int i = 0; i < array5.length; i++)
            {
                array5[i] = random5.nextInt(10) + 5;
            }
            return array5;
        }
}

