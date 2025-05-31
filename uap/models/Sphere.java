package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator { // [cite: 10]
    // Atribut untuk radius bola
    private double radius; 

    // Constructor untuk inisialisasi objek Sphere dengan radiusnya
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    // Menghitung volume Bola menggunakan rumus V = (4/3) * PI * r^3
    public double getVolume() {
        return (4.0/3.0) * PI * this.radius * this.radius * this.radius;
    }

    @Override
    // Menghitung luas permukaan Bola menggunakan rumus A = 4 * PI * r^2
    public double getSurfaceArea() {
        return 4 * PI * this.radius * this.radius;
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