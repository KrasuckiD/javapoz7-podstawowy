import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Wpisz pierwszą wartosc");
        int firstValue = reader.nextInt();
        System.out.println("Wpisz druga wartosc");
        int secondValue = reader.nextInt();
        System.out.println("Wpisz trzecia wartosc");
        int thirdValue = reader.nextInt();
        if (firstValue < secondValue && (secondValue < thirdValue)) {
            System.out.println("Obwód " + (firstValue + secondValue + thirdValue));
        }
        if (firstValue < secondValue && (secondValue < thirdValue)) {
            System.out.println("srednia dlugosc bokow " + ((firstValue + secondValue + thirdValue) / 3));
        }


    }


}