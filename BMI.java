/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1;

/**
 *
 * @author LENOVO
 */
public class BMI {
    private double bmi;
    private String kategori;

    public void hitungBMI(double berat, double tinggi) {
        bmi = berat / (tinggi * tinggi); // Rumus BMI
        kategori = tentukanKategori(bmi);
    }

    public double getBMI() {
        return bmi;
    }

    public String getKategori() {
        return kategori;
    }

    private String tentukanKategori(double bmi) {
        if (bmi < 18.5) {
            return "Terlalu kurus";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Kegemukan";
        }
    }
}
