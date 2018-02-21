import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        //pobrać od usera liczbe
        //jezeli wiek jest <6 powinienes isc do przedszkola
        //jezeli wiek <12 powinienes isc do podstawowki
        // <16 gimnazjum
        // <20 srednia
        // >20 studia
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj wiek:");
        int wiek =reader.nextInt();
        if (wiek < 6){
            System.out.println("Powinieneś iść do przedszkola");
        } else if (wiek <12) {
            System.out.println("Powinieneś iść do podstawówki");
        } else if (wiek < 16) {
            System.out.println("Powinieneś iść do gimnazjum");
        } else if (wiek <20) {
            System.out.println("Powinieneś iść do liceum");
        }else {
            System.out.println("Na studia");
        }
        if (wiek >= 0 && (wiek <18 || wiek >= 65)) {

        }
        //1 wyświelic "a" jezeli wiek <30 i podzielny 3
        //2 wyswietlic "b" jezeli wiek  mniejszy 15 lub wiekszy od 30 i muszi miecreszte z dzielenia 2
        if (wiek >30 && (wiek %3 == 0)) {
            System.out.println("a");
        }
        if ((wiek < 15 || wiek > 60) && wiek % 5 == 2) {
            System.out.println("b");
        }
    }
}
