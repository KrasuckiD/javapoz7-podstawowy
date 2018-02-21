package lekcja2;

public class LoopCw {
    public static void main(String[] args) {
        //wyswietlin n kolejnych liczb (0,1,2,3)
        int n = 8;
        for (int i = 0; i < n; i++)
        {
            System.out.println(i);
        }
        // wyswietlanie kolejnych liczb *2( 2,4,6,8)
        for (int i = 0; i < n  ; i++){
            System.out.println(2 * (i + 1));
        }
        for (int i = 1; i < 2 * n; i += 2){
            System.out.println(i);
        }
        // wyswietlane tylko parzyste liczby od 1 do n
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                System.out.println(i + 2);
            }
            //wyswietlic tylko liczby podzielne przez 3 do n
            for (int i = 0; i < n; i++){
                if (i != 0 && i % 3 == 0) {
                    System.out.println(i + 3);
                }
                //
            }
        }
    }
    }

