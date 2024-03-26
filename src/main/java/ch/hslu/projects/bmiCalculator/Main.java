package ch.hslu.projects.bmiCalculator;
import java.util.Scanner;


/*  Aufgabe 3 ~ Body-Mass-Index
Schwierigkeit: Anfänger
Für die Berechnung des Body-Mass-Index (BMI) sollen Sie ein Programm schreiben. 
Der Body-Mass- Index dient als Maß zur generellen Beurteilung des Körpergewichts. 
Der Index gibt das Verhältnis des Körpergewichts G (kg) zu der Größe h (m) an. 
Er kann mit der folgenden Formel berechnet werden:

• BMI = G / h2

Die Beurteilung folgt dabei der nachstehenden Tabelle

BMI Beurteilung:
BMI < 20 Untergewicht
20 < = BMI < 25 Normalgewicht
25 < = BMI < 30 Übergewicht     */


public class Main {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gewicht;
        double hoehe;
        double bmi;

        System.out.println("wieviel KG wiegst du?");
        gewicht = scan.nextInt();
        

        System.out.println("wie groß bist du?");
        hoehe = scan.nextDouble();

        bmi = (int)gewicht / (hoehe * hoehe);

        if (bmi < 20) {
            System.out.println("Dein bmi ist " + bmi + " du bist untergewichtig!");
        } else if (bmi >= 20 && bmi <= 25 ) {
            System.out.println("Dein bmi ist " + bmi + " dein Gewicht ist normal");       
        } else if (bmi > 25) {
            System.out.println("Dein bmi ist " + bmi + " du bist übergewichtig!"); 
        }

        scan.close();
    }

    
}
