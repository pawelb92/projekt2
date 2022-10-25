import java.util.Scanner;

public class Zadaniedomowe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak masz na imie?");
        String imie = sc.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = sc.next();
        System.out.println("POdaj stan cywilny.");
        boolean stanCywilny = sc.nextBoolean();
    }
}
