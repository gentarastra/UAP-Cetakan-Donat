package uap.mains;

import uap.models.Torus;
import uap.models.Sphere;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        // Mengatur format angka untuk mata uang Rupiah (Rp) agar sesuai output
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("id", "ID"));
        symbols.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("Rp #,###", symbols);

        // Menampilkan header program sesuai format output 
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("GENTA RASTRA LISTIAWAN");
        System.out.println("245150707111031");
        System.out.println("=============================================");
        System.out.println();
        
        // --- Perhitungan untuk Donat dengan lubang (Torus) ---
        System.out.println("Donat dengan lubang"); // 
        System.out.println("=============================================");
        // Mensimulasikan input pengguna sesuai instruksi 
        System.out.println("Isikan Major Radius : 7");
        System.out.println("Isikan minor radius : 3.5");
        // Membuat objek Torus dengan nilai yang ditentukan 
        Torus torus = new Torus(7, 3.5);
        System.out.println("=============================================");
        // Menampilkan semua hasil perhitungan untuk Torus
        torus.printInfo();
        System.out.printf("Massa dalam kg\t: %.2f kg\n", torus.gramToKilogram());
        System.out.printf("Biaya kirim\t: %s\n", formatter.format(torus.calculateCost()));
        System.out.println("=============================================");
        
        System.out.println();
        
        // --- Perhitungan untuk Donat tanpa lubang (Sphere) ---
        System.out.println("Donat tanpa lubang"); // 
        System.out.println("=============================================");
        // Mensimulasikan input pengguna sesuai instruksi 
        System.out.println("Isikan radius\t: 21");
        // Membuat objek Sphere dengan nilai yang ditentukan 
        Sphere sphere = new Sphere(21);
        System.out.println("=============================================");
        // Menampilkan semua hasil perhitungan untuk Sphere
        sphere.printInfo();
        System.out.printf("Massa dalam kg\t: %.2f kg\n", sphere.gramToKilogram());
        System.out.printf("Biaya kirim\t: %s\n", formatter.format(sphere.calculateCost()));
        System.out.println("=============================================");
    }
}