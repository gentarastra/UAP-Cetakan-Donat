package uap.models;
import uap.bases.Cetakan;

// Class cetakan donat tanpa lubang
public class Sphere extends Cetakan {
    private double radius; // Jari-jari bola

    public Sphere(double radius) {
        this.radius = radius;
        hitungVolume();
        hitungLuasPermukaan();
        hitungMassa();
    }

    // Rumus volume bola: 4/3 * π * r³
    @Override
    public void hitungVolume() {
        volume = (4.0 / 3.0) * PI * radius * radius * radius;
    }

    // Rumus luas permukaan bola: 4 * π * r²
    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 4 * PI * radius * radius;
    }
}
