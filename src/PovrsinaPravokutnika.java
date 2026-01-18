/*Tekst zadatka
• Napišite Java program koji izračunava površinu pravokutnika.
• U programu trebate koristiti sljedeće numeričke varijable:
o double duljina – duljina pravokutnika.
o double sirina – širina pravokutnika.
o double povrsina – rezultirajuća površina pravokutnika.
• Korisnik treba moći unijeti duljinu i širinu pravokutnika.
• Program treba izračunati površinu pravokutnika prema formuli: povrsina = duljina * sirina.
• Program treba ispisati rezultat.*/

import java.util.Scanner;
/*
public class PovrsinaPravokutnika {
    public static void main(String[] args) {
        double duljina;
        double sirina;
        double povrsina;

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duljinu pravokutnika: ");
        duljina = sc.nextDouble();

        System.out.println("Unesite širinu pravokutnika: ");
        sirina = sc.nextDouble();

        sc.close();

        povrsina = duljina * sirina;

        System.out.println("Površina pravokutnika je " + povrsina + " cm");

    }
}
*/


public class PovrsinaPravokutnika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double duljina = 0;
        double sirina = 0;

        try {
            System.out.print("Unesite duljinu pravokutnika: ");
            duljina = scanner.nextDouble();

            System.out.print("Unesite širinu pravokutnika: ");
            sirina = scanner.nextDouble();

            double povrsina = duljina * sirina;
            System.out.println("Površina pravokutnika je: " + povrsina);

        } catch (Exception e) {
            System.out.println("Pogreška: Morate unijeti broj!");
        } finally {
            scanner.close();
        }
    }
}
