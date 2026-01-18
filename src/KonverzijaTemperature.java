/*Tekst zadatka
• Napišite Java program koji će omogućiti korisniku unos temperature u Celzijusima.
• Program treba izračunati i ispisati ekvivalentnu temperaturu u Fahrenheitima i Kelvinima.
• Koristite sljedeće formule za konverziju:
• Fahrenheit = (Celzijus * 9/5) + 32
• Kelvin = Celzijus + 273.15
• Program treba ispisati rezultat.*/

import java.util.Scanner;

public class KonverzijaTemperature {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        double kelvin;

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite temperaturu u Celzijusima: ");

        celsius = sc.nextDouble();

        fahrenheit = ((celsius * 9 / 5) + 32);
        System.out.println("Unesena temperatura u Fahrenheitu je : " + fahrenheit + " °F");

        kelvin = celsius + 273.15;
        System.out.println("Unesena temperatura u Kelvinu je : " + kelvin + " K");

        sc.close();

    }
}
