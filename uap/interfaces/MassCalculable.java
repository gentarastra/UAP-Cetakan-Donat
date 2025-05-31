package uap.interfaces;

public interface MassCalculable {
    // Massa jenis bahan Stainless Steel 304 dalam g/cm^3
    int DENSITY = 8; 
    
    // Ketebalan bahan dalam cm 
    double THICKNESS = 0.5;
    
    // Metode untuk menghitung massa
    double getMass();
}