package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("GENTA RASTRA LISTIAWAN");
        System.out.println("245150707111031");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        // Input untuk torus (donat dengan lubang)
        System.out.print("Isikan Radius   : ");
        double R = input.nextDouble(); // radius besar
        System.out.print("Isikan radius   : ");
        double r = input.nextDouble(); // radius kecil

        Torus torus = new Torus(R, r);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");

        // Input untuk sphere (donat tanpa lubang)
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();

        Sphere sphere = new Sphere(radius);
        sphere.printInfo();

        System.out.println("=============================================");
    }
}
