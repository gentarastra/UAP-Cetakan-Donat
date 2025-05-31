package uap.interfaces;

public interface MassConverter {
    // Konstanta pembagi untuk konversi gram ke kilogram
    int DENOMINATOR = 1000; 
    
    // Metode untuk mengonversi massa dari gram ke kilogram
    double gramToKilogram(); 
}