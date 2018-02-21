import java.util.Scanner;

public class WarmupVer2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("In first v");
        int a = scanner.nextInt();
        System.out.println("In sec v");
        int b = scanner.nextInt();
        System.out.println("In th v");
        int c = scanner.nextInt();

        if ((a + b > c && a + c > b && b + c > a) && (a * a + b * b == c * c)){
            double area = 0.5 * a *b;
            int circut = a + b + c;
            double avg = circut / 3.0;

            System.out.println("Area "+ area);
            System.out.println("Circut "+ circut);
            System.out.println("Avg "+ avg);
        } 


    }
}
