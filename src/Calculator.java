import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");





        Scanner reader = new Scanner(System.in);
        //liczby
        System.out.println("Insert Fisrt Value");
        int firstValue = reader.nextInt();
        System.out.println("Insert Second Value");
        int secondValue = reader.nextInt();
       // int someValue = reader.nextInt();
        //System.out.println(someValue);
        //wykonać
        int addResult = firstValue + secondValue;
        int substractResult = firstValue - secondValue;
        int multiplyResult = firstValue * secondValue;
        double divideResult = 0;

        if (secondValue !=0) {

            divideResult = (double) firstValue / secondValue;
        }
        //wyswietlic

        //System.out.println("add=" +addResult);
        //System.out.println("substract=" +substractResult);
        //System.out.println("multiply=" +multiplyResult);
        //System.out.println("dibide=" +divideResult);

        //ladne wyswietlanie
        System.out.println("add " + firstValue + "+" + secondValue + "=" + (firstValue+secondValue));
        System.out.println("substract " + firstValue + "-" + secondValue + "=" + (firstValue-secondValue));
        System.out.println("multiply " + firstValue + "*" + secondValue + "=" + (firstValue*secondValue));
        if (secondValue !=0){
            System.out.println("divide " + firstValue + "/" + secondValue + "=" + ((double) firstValue / secondValue));
        }


//Informacje o liczbach
        //czy sa rowne
        if (firstValue==secondValue) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }


        //wyswietlic wieksza
        if (firstValue > secondValue) {
            System.out.println("First bigger");
        }
        if (firstValue < secondValue) {
            System.out.println("Second bigger");
        }
        if (firstValue % secondValue != 0) {
            System.out.println("Liczby z reszta");
        }
        if (firstValue % 2 ==0) {
            System.out.println("fisrt is even");
        }
        if (secondValue % 2 ==0) {
            System.out.println("second is even");
        }
    }
}
