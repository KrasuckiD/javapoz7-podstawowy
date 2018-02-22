package trzecie;

import java.util.Scanner;

public class Trzecie {
    public static void main(String[] args) {
        //wczytac liczbe n
        //zapytac n razy o liczbe
        //podzielna przez 2 to informowac
        //podzielna przez 3 to informowac
        // podzielna przez 6 to informowac


        // zad 2
        //zdefiniowac liczbe n
        // pobieranie n liczb
        // sprawdzenie czy podana liczb jest wieksza od poprzedniej wprowadzonej

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert number of elements");
        int n = scanner.nextInt();

//        System.out.println("Zadanie 2");
//        int prevValue = 0;
//        for (int i = 0; i < n; i++){
//            System.out.println("Insert next value to compare");
//            int value = scanner.nextInt();
//            if (value > prevValue){
//                System.out.println("New are bigger");
//            } else if (value == prevValue){
//                System.out.println("Equal");
//            } else {
//                System.out.println("New are smaller");
//            }
//            prevValue = value;
//        }

        //zad 3 obliczyc sume n parzystych liczb nie podzielnych przez 3  (np n =10 obliczyc 0+2+4+8+
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0 && i % 3 != 0) {
                sum += i;
            }
            System.out.println("Sum =" + sum);
        }
//        int n = 10;
//        System.out.println("Zadanie 1.1");
//
//        for (int i = 0; i < n; i++){
//            System.out.println(i);
//        }
//
//        System.out.println("Zadanie 1.2");
//        System.out.println("Podaj liczbe n");
//        int a = scanner.nextInt();
//        for (int i = 0; i < a; i++){
//            System.out.println(i);
//        }
//
//        System.out.println("Zadanie 1.3");
//
//        for (int i = 0; i < n; i++){
//            if (i % 2 == 0){
//                System.out.println(i + 2);
//            }
//        }
//
//        System.out.println("Zadanie 1.4");
//
//        for (int i = 0; i < n; i++){
//            if (i % 3 == 0){
//                System.out.println(i +3);
//            }
//        }


    }
}
