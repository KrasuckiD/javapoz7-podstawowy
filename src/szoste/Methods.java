package szoste;

import czwarte.Warmup;

public class Methods {
    public static void main(String[] args) {
/* silnia (factorial) long
* zmiana jednego znaku na drugi w danym stringu
*  sprawdzenie czy w string jest liczba
*  palindrom np kajak = true, anna = true, ania = false
 * zliczamy liczby podzielne przez 2 a niepodzielne przez 3
* split --> 123;abc;dd --> "123" "abc" "dd"
* fibonacci
* sprawdzenie nawiasow w stringach
* metoda do porownania dwuch stringow ktore sa liczbami
* metoda wyswietlajaca sume liczb pierwszych w danej liczbie np 29 = 11 + 11 + 7
*
*
*/
        System.out.println("Foactorial of 6 = " + factorial(6));
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(" Div by 2 and not for 3 = " + countDivisibleBy2NotBy3(array));
        System.out.println("Switch text = " + switchChars("Ala ma kota", ' ', '-'));
        System.out.println("\"123\" is number = " + checkStringIsANumber("123"));
        System.out.println("\"1b3\" is number = " + checkStringIsANumber("1b3"));
        System.out.println("\"kajak\" is palindrom = " + isPalindromCheck("kajak"));
        System.out.println("\"anna\" is palindrom = " + isPalindromCheck("anna"));


    }

    public static long factorial (int number){
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static int countDivisibleBy2NotBy3 (int [] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0 && array[i] % 3 != 0 ) {
                counter++;
            }
        }
        return counter;
    }
    public static String switchChars(String text, char from, char to){
        char [] textAsChars = text.toCharArray();
        for (int i = 0; i < textAsChars.length; i++) {
            if (textAsChars[i] == from){
                textAsChars[i] = to;
            }
        }
        return String.valueOf(textAsChars);
    }


    public static boolean checkStringIsANumber (String numberCandidate ){
        char[] chars =numberCandidate.toCharArray();
        int i = 0;
        while (i < chars.length && (chars[i] >= '0' && chars[i] <= '9')){
            i++;
        }
//        if (i == chars.length){
//            return true;
//        } else {
//            return false;
//        }
        return i == chars.length;
    }

    public static boolean isPalindromCheck (String textToPalindromCheck){
        char [] palindromChars = textToPalindromCheck.toCharArray();
        int i = 0;
        while (i < palindromChars.length / 2 && palindromChars[i] == palindromChars[palindromChars.length - i - 1]){
            i++;
        }



        return i == palindromChars.length / 2;
    }


    public static String split (String message, char c) {
        String [] array = new String[piate.Methods.letterCounter(message, c)];{
            int start = 0;
            int end = getNthIndexOf (c, message, 0);



            return array;
        }


        return
    }

}
