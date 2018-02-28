package piate;

public class Methods {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9,10};
        String [] names = {"Ola", "Jacek", "Ala", "Michał", "Wojtek"};
        System.out.println(femaleNamesCounter(names));
//        printArray();
      //  printArray(array);

        int [] newArray = new int[5];
//
//        printArray(newArray);
//        sumOfArray(newArray);
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = i;
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i] + " ");
//
//        }
//        System.out.println();

//      // napisac funkcje ktora przejmuje tablice i wyisuje sume
        // napisac metode zwracajaca najmniejsza wartosc
        //najwieksza wartosci
        // informacje o wystapieniach liczb
        // mediana
        //rozpietosc
        // metoda stringow zliczajaca zenskie imiona
        // metoda zliczajaca litery w stringu ala ma kota

    }
    public static void printArray(int[] array){
        System.out.println(sumOfArray(array));
        System.out.println(avgOfArray(array));
        System.out.println(smallestElementOfArray(array));
        System.out.println(biggestElementOfArray(array));
        System.out.println(spreadOfArray(array));
        System.out.println(stataOfArray(array));
    }
    public static int sumOfArray (int[] array){
        int sum = 0;
        for (int i =0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static double avgOfArray(int [] array){
        int sum = sumOfArray(array);
        return (double)sum / array.length;
    }
    public static int smallestElementOfArray (int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        } return min;
    }
    public static int biggestElementOfArray (int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int spreadOfArray(int[] array) {
     return biggestElementOfArray(array) - smallestElementOfArray(array) +1;
    }
    public static int [] stataOfArray (int [] array) {
        int [] statsArray = new int[spreadOfArray(array)];
        int min = smallestElementOfArray(array);
        for (int i = 0; i < array.length; i++) {
            statsArray[array[i] - min]++;
        }
        return statsArray;
    }
    public static int indexOfMax( int [] array){
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        return iMax;
    }
//    public static int [] moda (int [] array){
//        int [] stats = stataOfArray(array);
//        int indexOfMaximumValue = indexOfMax(stats);
//        return indexOfMaximumValue + smallestElementOfArray(array);
//    }

    public static int [] sortByCounting ( int [] array){
        int[] sortedArray = new int[array.length];
        int [] stats = stataOfArray(array);
        int k = 0;
        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < stats[i]; j++) {
                sortedArray[k] = i + smallestElementOfArray(array);
                k++;
            }
        }return sortedArray;
    }
    public static int femaleNamesCounter (String [] names){
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].endsWith("a")){
                counter ++;
            }
        }
        return counter;
    }
//    public static boolean femaleNamesCounter2 (String text, String searchingValue){
//
//        if (searchingValue.length() <= text.length()){
//            boolean result = false;
//            int i = searchingValue.length() - 1;
//            char[] textAsCharArray = text.toCharArray();
//            char[] searchValueAsCharArray = searchingValue.toCharArray();
//
//            int aLenth = textAsCharArray.length;
//            int bLenth = searchValueAsCharArray.length;
//            while (i >= 0 && (searchValueAsCharArray[i] == textAsCharArray[aLenth + i - bLenth] )){
//
//                i --;
//            } return i == -1;
//        }
//            return result;

  //      }


        public static int letterCounter (String text, char c){
        char[] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);
            for (int i = 0; i < chars.length; i--) {
                if (capitalize(chars[i]) == capitalizedChar){
                    counter ++;
                }
            } return counter;
        }
        public static char capitalize (char c){
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
        }


        public static int lettersCounter2 ( String[] messages, char c){
        int counter = 0;
            for (int i = 0; i < messages.length; i++) {
                counter += letterCounter(messages[i], c);
            } return counter;
        }



}
