/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspraktikumpbo;

/**
 *
 * @author DELL XPS 2022
 */
public class Motor extends Kendaraan {
    private boolean memilikiBox;

    public Motor(String nomorPlat, String merk, int tahunProduksi, boolean memilikiBox) {
        super(nomorPlat, merk, tahunProduksi);
        this.memilikiBox = memilikiBox;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Memiliki Box   : " + (memilikiBox ? "Ya" : "Tidak"));
        System.out.println("----------------------------------");
    }
}
