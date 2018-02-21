package lekcja2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        forLoopEx();

    }
    int n = 8;
//    for (int)

    private static void forLoopEx() {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert number of elements tomultiply");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i = i + 1) {
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {
                System.out.println((i + 1) + ". Pow(" + number + ") =" + (number + number));
            } else {
                System.out.println("Number not supported");
            }
        }



    }
}