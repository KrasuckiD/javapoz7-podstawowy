package szoste;

import java.util.Arrays;

public class Methods
{
    //silnia (factorial) -> long
    //zliczanie liczb podzielnych przez 2, ale nie podzielnych przez 3
    //zamiana jednego znaku na drugi w danym stringu
    //sprawdzenie czy string jest liczba
    //czy text jest palindromem np. kajak -> true, anna -> true, abc -> false
    //split -> 123;abc;dd -> ["123", "abc", "dd"]
    //         dd.aa.cc -> ["dd", "aa", "cc"]
    //fibonacci
    //sprawdzanie nawiasow w stringu
    //metoda do porownania 2 stringow ktore sa liczbami
    //metoda wyswietlajaca sume liczb pierwszych w danej liczbie (1,2,3,5,7,11) np.
    //              liczba 29 = 11 + 11 + 7
    //              liczba 31 = 11 + 11 + 7 + 2
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Factorial of 6 = " + factorial(6));
        System.out.println("Divisible by 2 and not by 3 = " + countDivisibleBy2AndNotBy3(array));
        System.out.println("Switched text = " + switchChars("ala ma kota", 'a', 'b'));
        System.out.println("\"123\" is number = " + isNumber("123"));
        System.out.println("\"2a3\" is number = " + isNumber("2a3"));
        System.out.println("\"anna\" is palindrome = " + isPalindrome("anna"));
        System.out.println("\"1Kajak1\" is palindrome = " + isPalindrome("1Kajak1"));
        System.out.println("\"abcdefgh\" is palindrome = " + isPalindrome("abcdefgh"));
        System.out.println("switch Case = " + switchCase("AbCd" ));
        System.out.println("a;b;c 0 (-1) =  " + getNthIndexOf(';', "a;b;c", 0));
        System.out.println("a;b;c 1 (1)=  " + getNthIndexOf(';', "a;b;c", 1));
        System.out.println("a;b;c 2 (3)=  " + getNthIndexOf(';', "a;b;c", 2));
        System.out.println("a;b;c 3 (5)=  " + getNthIndexOf(';', "a;b;c", 3));
        System.out.println("\"Ala ma kota\" split = " + Arrays.toString(split("Ala ma kota", ' ')));
        System.out.println("\"Ala ma kota\" split = " + Arrays.toString(split2("Ala ma kota", ' ')));
        System.out.println("Fibonacci 5 = " + fibonacciNumber(5));
        System.out.println("Fibonacci 10 = " + fibonacciNumber(10));
        System.out.println("fibonacci array 6 = " + Arrays.toString(fibonacciArray(10)));
        System.out.println("reverse of \"abcdef\" = " + reverse("abcdef"));
        System.out.println("(a+b)" + isValidStatment("(a+b)"));
        System.out.println("reversed array (1,2,3,4,5,6) = " + Arrays.toString(reverseArray(new int[]{1,2,3,4,5,6})));
        System.out.println("tree of height 5 = \n" + tree(5));
        System.out.println("compae " + compare("123", "123"));
        System.out.println("Promary from 31 = " + primaryNumbersOf(31));




    }


    public static String primaryNumbersOf (int number)
    {
        int []primaryNumbers = {1,2,3,5,7,11};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = primaryNumbers.length - 1; i >= 0; i--) {
            while (number >= primaryNumbers[i]){
                number -= primaryNumbers[i];
                stringBuilder.append(primaryNumbers[i]);
                stringBuilder.append(" + ");
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() -2);
    }


    public static int compare (String text1, String text2)
    {
        int result = 0;
        if ( text1.length() > text2.length())
        {
            result = 1;
        } else if (text1.length() < text2.length())
        {
            result = -1;
        } else
        {
            int i = 0;
            while (i < text1.length() && result == 0)
            {
              if (text1.charAt(i) > text2.charAt(i))
              {
                  result = 1;
              } else if (text1.charAt(i) < text2.charAt(i))
              {
                  result = -1;
              }
              i++;
            }
        }

        return result;
    }


    public static String tree (int height)
    {
        StringBuilder treeBuilder = new StringBuilder();
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < height -1 -i; j++)
            {
                treeBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++)
            {
                treeBuilder.append("*");
            }
            treeBuilder.append("\n");
        }
        return treeBuilder.toString();
    }



    public static int [] reverseArray ( int [] array)
    {
        int [] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            reversedArray[i] = array[array.length -1 - i];
        }




        return reversedArray;
    }



    public static boolean isValidStatment (String statment)
    {
        char [] array = statment.toCharArray();
        int counter = 0;
        int i = 0;
        while (i < array.length)
        {
            if (array[i] == ')')
            {
                counter++;
            }
            else if (array[i] == '(')
            {
                counter--;
            }
            i++;
        }

        return counter==0;
    }


    public static String reverse (String text)
    {
        char [] array = text.toCharArray();
        for (int i = 0; i < array.length / 2; i++)
        {
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return String.valueOf(array);
    }

    public static void swap ()
    {
        int a = 2;
        int b = 5;
        int tmp = a;
        a = b;
        b = tmp;
    }


    public static int [] fibonacciArray (int toIndex)
    {
        int [] array = new int[toIndex];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length ; i++)
        {
            array[i] = array[i -1] + array[i - 2];


        }

        return array;
    }

    public static int fibonacciNumber (int n)
    {
        if (n <=0 ) return n;
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n ; i++)
        {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }




    public static String [] split2 (String message, char c)
    {
        int size = Warmup.lettersCounter(message, c) +1;
        String [] resultArray = new String[size];
        int start = 0;
        int end;
        for (int i = 0; i < resultArray.length; i++)
        {
            String textToPut = " ";
            end = getNthIndexOf(c, message, (i+1));
            for (int j = start ; j < end ; j++)
            {
                textToPut += message.charAt(j);
            }
            resultArray[i] = textToPut;
            start = end + 1;
        }
        return resultArray;
    }

    public static String [] split (String message, char c)
    {
        int size = Warmup.lettersCounter(message, c) +1;
        String [] resultArray = new String[size];
        String textToPut = " ";
        int j = 0;
        for (int i = 0; i < message.length(); i++)
        {
            if (message.charAt(i) != 0)
            {
                textToPut += message.charAt(i);
                if (i == message.length() -1)
                {
                    resultArray[j] = textToPut;
                }
            } else
                {
                resultArray[j] = textToPut;
                j++;
                textToPut = " ";
                }
        }


        return resultArray;
    }

    public static int getNthIndexOf (char c, String text, int index)
    {
        char [] chars = text.toCharArray();
        int i = -1;
        while (i < chars.length && index > 0)
        {
            i++;
            if (i < chars.length &&c == chars[i])
            {
            index --;
            }
        }
        return i;
    }

    public static String switchCase (String text){
        char [] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = switchCase(chars[i]);
        }
        return String.valueOf(chars);
    }

    public static char switchCase (char c){
        char switchedChar = c;
        if (c >= 'a' && c <= 'z'){
            switchedChar -= 32;
        } else if (c >= 'a' && c <= 'Z') {
            switchedChar += 32;
        }
        return switchedChar;
    }

    public static boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        int i = 0;
        while (i < chars.length / 2 && (Warmup.capitalize(chars[i]) == Warmup.capitalize(chars[chars.length - i - 1]))) {
            i++;
        }
        return i == chars.length / 2;
    }

    public static boolean isNumber(String numberCandidate)
    {
        char[] chars = numberCandidate.toCharArray();
        int i = 0;
        while (i < chars.length && (chars[i] >= '0' && chars[i] <= '9'))
        {
            i++;
        }
        return i == chars.length;
    }

    public static String switchChars(String text, char from, char to)
    {
        char[] textAsChars = text.toCharArray();
        for (int i = 0; i < textAsChars.length; i++)
        {
            if (textAsChars[i] == from)
            {
                textAsChars[i] = to;
            }
        }
        return String.valueOf(textAsChars);
    }

    public static int countDivisibleBy2AndNotBy3(int[] array)
    {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0 && array[i] % 3 != 0)
            {
                counter++;
            }
//            counter += (array[i] % 2 == 0 && array[i] % 3 != 0) ? 1 : 0;
        }
        return counter;
    }

    public static long factorial(int number)
    {
        long result = 1;
        for (int i = 2; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }
}
