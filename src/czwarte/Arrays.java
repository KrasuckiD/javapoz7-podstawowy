package czwarte;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


//        int[] array = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        //1. zidentyfikowac tablice z kilkoma liczbami . obliczyc sume

        int [] numberArray = {1,2,3,4,5,6,7};
        int sum = 0;
        for (int i =0; i < numberArray.length; i++){
            sum += numberArray[i];
        }
        System.out.println(sum);

        //2. zidentyfikowac tablice z kilkoma liczbami . obliczyc srednia

        int sum2 = 0;
        for (int i = 0; i < numberArray.length; i++){
            sum2 += numberArray[i];
        }
        System.out.println(sum / numberArray.length);


        //3. zidentyfikowac tablice  kilkoma liczbami . obliczyc max i min

        int min = numberArray[0];
        int max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++){
            if (numberArray[i]< min){
                min = numberArray[i];
            } if (numberArray[i] > max){
                max = numberArray[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        //4. zidentyfikowac tablice z kilkoma liczbami. zliczamy ilosc elementow do wystapienia liczby ujemnej

        int[] arrayWithMinus = {1,4,6,7,-4,2};
        int counter = 0;
        while (counter < arrayWithMinus.length && arrayWithMinus[counter] >= 0 ){
            counter++;
        }
        System.out.println("couner of positive numbers = " + counter);
        // 5. podwoic wartosci z tablicy


        int[] arrayToDouble = {1,2,3,4,5,6};

        for (int i = 0; i < arrayToDouble.length; i++) {
            arrayToDouble[i] *=2;
        }
        System.out.println(java.util.Arrays.toString(arrayToDouble));
        // 6. tablica n elemntow z kolejnych liczb

        int n = 4;
        int [] newArray = new int[n];
        for (int i = 0; i < newArray.length ; i++) {
            newArray[i] = i+1;
        }
        System.out.println(java.util.Arrays.toString(newArray));

        // 7. tablica n liczb tylko parzystych

        int [] arrayOfEvenNumbers = new int[n];
        for (int i = 0; i < arrayOfEvenNumbers.length; i++) {
            arrayOfEvenNumbers[i] = (i+1)*2;
        }
        System.out.println(java.util.Arrays.toString(arrayOfEvenNumbers));

        // 8 zapytac o rozmiar i utworzyctablice z liczbami

        int size = 5;
        int [] descendingOfNumbers = new int[size];
        for (int i = 0; i < descendingOfNumbers.length ; i++) {
            descendingOfNumbers[i] = descendingOfNumbers.length - i;
        }
        System.out.println(java.util.Arrays.toString(descendingOfNumbers));

        // 9. zapytac o rozmiari umozliwic wstawianie elementow i obliczyc srednia

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] userArray = new  int[sizeOfArray];
        int sumOfUserArray= 0;
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = scanner.nextInt();
            sumOfUserArray += userArray[i];

        }
        System.out.println("Avg = " + ((double)sumOfUserArray / userArray.length));

        //posortowac tablice rosnaco, ile jest elementow mniejszych

        int searchNumber = 6;
        int [] sortedArray = {1,2,3,5,6,7,8,9};
        int counterForSearching = 0;
        while (counterForSearching < sortedArray.length && sortedArray[counterForSearching] != searchNumber) {
            counterForSearching++;
        }
        System.out.println("We have " + counterForSearching + " numbers smaller than " + searchNumber);

    }
}
