package uap.interfaces;

public interface ShippingCostCalculator {
    // Harga pengiriman per kilogram 
    int PRICE_PER_KG = 2000;
    
    // Metode untuk menghitung total biaya pengiriman
    double calculateCost();
}