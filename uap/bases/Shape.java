package uap.bases;

public abstract class Shape { // 
    // Variabel untuk menyimpan nama bentuk
    private String name; 

    // Metode untuk mendapatkan nama bentuk (getter)
    public String getName() { 
        return name;
    }

    // Metode untuk mengatur nama bentuk (setter)
    public void setName(String inputName) { 
        this.name = inputName;
    }

    // Metode abstract untuk menampilkan informasi, harus diimplementasikan oleh subclass
    public abstract void printInfo(); 
}