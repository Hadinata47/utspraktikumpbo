/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspraktikumpbo;

/**
 *
 * @author DELL XPS 2022
 */
public class mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public mobil(String nomorPlat, String merk, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(nomorPlat, merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
        System.out.println("Bahan Bakar    : " + jenisBahanBakar);
        System.out.println("----------------------------------");
    }
}
