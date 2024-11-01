/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1;

/**
 *
 * @author LENOVO
 */
public class BMIberaksi {
    public static void main(String[] args) {
        // Misalkan kita ingin menghitung BMI untuk berat 70 kg dan tinggi 1.75 m
        double berat = 70; // berat dalam kg
        double tinggiM = 1.75; // tinggi dalam m

        // Membuat objek BMI
        BMI bmiCalculator = new BMI();

        // Menghitung BMI
        bmiCalculator.hitungBMI(berat, tinggiM);

        // Menampilkan hasil
        System.out.printf("BMI Anda adalah: %.2f\n", bmiCalculator.getBMI());
        System.out.println("Kategori: " + bmiCalculator.getKategori());
    }
}
