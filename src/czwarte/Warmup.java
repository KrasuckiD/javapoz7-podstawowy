package czwarte;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    napisac petle ktora odwraca liczbe np 12345 -> 54321

        int number = 1200;
        int reversedNumber = 0;
       while (number != 0) {
           int digt = number % 10;
           reversedNumber *= 10;
           reversedNumber += digt;
           number /= 10;

       }
        System.out.println("Rev number = " + reversedNumber);

//     wczytujemy n liczb, i sumujemy wszystkie cyfry  123, 456 -> 1+2+3+4+5+6= 21

        int n = 4;
        int sum = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Insert number");
            int value = scanner.nextInt();
            //sumowanie
            while (value != 0){
                int digit = value % 10;
                sum += digit;
                value /= 10;
            }
        }
        System.out.println("Sum = " + sum);

//   pozbyc sie wszystkich 0 z liczby

        int numberWithZeroes = 12002;
        int numberWithOutZeroes = 0;
        int multiplier = 1;
        while (numberWithZeroes != 0){
            int digit = numberWithZeroes % 10;
            if (digit != 0){
                numberWithOutZeroes += digit * multiplier;
                multiplier *= 10;
            }
            numberWithZeroes /=10;
        }
        System.out.println("Number Without Zeroes = " + numberWithOutZeroes);


    }
}
