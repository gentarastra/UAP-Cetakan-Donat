package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator { // 
    // Atribut untuk radius besar (jarak dari pusat ke tengah tabung)
    private double majorRadius;
    // Atribut untuk radius kecil (radius tabung itu sendiri)
    private double minorRadius; 

    // Constructor untuk inisialisasi objek Torus dengan radiusnya
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    // Menghitung volume Torus menggunakan rumus V = 2 * PI^2 * R * r^2 
    public double getVolume() {
        return 2 * PI * PI * this.majorRadius * this.minorRadius * this.minorRadius;
    }

    @Override
    // Menghitung luas permukaan Torus menggunakan rumus A = 4 * PI^2 * R * r 
    public double getSurfaceArea() {
        return 4 * PI * PI * this.majorRadius * this.minorRadius;
    }

    @Override
    // Menghitung massa cetakan menggunakan rumus m = massa_jenis * luas_permukaan * ketebalan 
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }
    
    @Override
    // Mengonversi massa dari gram ke kilogram 
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    // Menghitung biaya kirim. Berat dibulatkan ke atas ke kilogram terdekat 
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    @Override
    // Mencetak informasi volume, luas permukaan, dan massa sesuai format 
    public void printInfo() {
        System.out.printf("Volume\t\t: %.2f\n", getVolume());
        System.out.printf("Luas permukaan\t: %.2f\n", getSurfaceArea());
        System.out.printf("Massa\t\t: %.2f gr\n", getMass());
    }
}