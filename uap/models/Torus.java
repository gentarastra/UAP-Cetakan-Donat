package uap.models;
import uap.bases.Cetakan;

// Class cetakan donat dengan lubang
public class Torus extends Cetakan {
    private double radiusBesar; // Jarak dari pusat ke tengah lubang
    private double radiusKecil; // Jari-jari lubang

    public Torus(double radiusBesar, double radiusKecil) {
        this.radiusBesar = radiusBesar;
        this.radiusKecil = radiusKecil;
        hitungVolume();
        hitungLuasPermukaan();
        hitungMassa();
    }

    // Rumus volume torus: (π * r²) * (2 * π * R)
    @Override
    public void hitungVolume() {
        volume = (PI * radiusKecil * radiusKecil) * (2 * PI * radiusBesar);
    }

    // Rumus luas permukaan torus: 4 * π² * R * r
    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 4 * PI * PI * radiusBesar * radiusKecil;
    }
}
