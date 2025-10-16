/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utspraktikumpbo;

/**
 *
 * @author DELL XPS 2022
 */
public class kendaraan {
    private String nomorPlat;
    private String merk;
    private int tahunProduksi;

    public kendaraan(String nomorPlat, String merk, int tahunProduksi) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Plat     : " + nomorPlat);
        System.out.println("Merk           : " + merk);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}
