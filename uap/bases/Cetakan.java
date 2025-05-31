package uap.bases;

public abstract class Cetakan {
    protected static final double PI = 22.0 / 7.0; // Nilai π sesuai soal
    protected static final double KETEBALAN_CM = 0.5; // Ketebalan bahan dalam cm
    protected static final double DENSITAS = 8.0; // Densitas stainless steel 304 dalam gr/cm^3

    protected double volume;
    protected double luasPermukaan;
    protected double massa;

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract void hitungVolume();
    public abstract void hitungLuasPermukaan();

    // Method untuk menghitung massa berdasarkan luas permukaan
    public void hitungMassa() {
        massa = luasPermukaan * KETEBALAN_CM * DENSITAS;
    }

    // Menampilkan informasi volume, luas, massa, dan biaya kirim
    public void printInfo() {
        System.out.println("Volume          : " + volume);
        System.out.println("Luas permukaan  : " + luasPermukaan);
        System.out.println("Massa           : " + massa);
        double massaKg = massa / 1000;
        System.out.println("Massa dalam kg  : " + massaKg);
        int beratKg = (int) Math.ceil(massaKg); // Pembulatan ke atas
        int biaya = beratKg * 2000; // Biaya per kg
        System.out.println("Biaya kirim     : Rp" + biaya);
    }
}
