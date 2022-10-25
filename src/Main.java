import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak masz na imię:");
        String imie =sc.nextLine();
        System.out.println("Jak masz na nazwisko:");
        String nazwisko =sc.nextLine();
        System.out.println("Ile masz lat?");
        int wiek = sc.nextInt();
        if (wiek < 18){
            System.out.println("Wróć jak bedziesz mieć 18 lat ");
        } else {
            System.out.println("Zapraszam");
        }



    }
}
