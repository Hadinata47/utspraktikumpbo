/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspraktikumpbo;

/**
 *
 * @author DELL XPS 2022
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("B 1234 CD", "Toyota Avanza", 2020, 4, "Bensin");
        Motor motor1 = new Motor("D 9876 EF", "Yamaha NMAX", 2022, true);

        System.out.println("=== Data Mobil ===");
        mobil1.tampilkanInfo();

        System.out.println("=== Data Motor ===");
        motor1.tampilkanInfo();
    }
}
