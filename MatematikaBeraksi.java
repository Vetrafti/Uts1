/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author USER
 */
public class MatematikaBeraksi {
      public static void main(String[] args) {
        MtkCanggih mtk = new MtkCanggih();

        // Testing Overloading
        System.out.println("Pertambahan (12.5, 28.7, 14.2): " + mtk.tambah(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (12, 28, 14): " + mtk.tambah(12, 28) + mtk.tambah(14));
        System.out.println("Pertambahan (23, 34): " + mtk.tambah(23, 34));
        System.out.println("Pertambahan (3.4, 4.9): " + mtk.tambah(3.4, 4.9));
    }
}