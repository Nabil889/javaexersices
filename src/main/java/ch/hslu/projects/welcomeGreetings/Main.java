package ch.hslu.projects.welcomeGreetings;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("Wie ist dein name?");
        name = scan.nextLine();

        System.out.println("Welcome " + name);

        scan.close();
    }


}
