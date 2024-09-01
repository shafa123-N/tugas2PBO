/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Acer E5
 */
public class Nilai {
    String nim;
    String nama;
    double nilaiAbsensi;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    
    Nilai (String nim, String nama, double nilaiAbsensi, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsensi = nilaiAbsensi * 0.1;
        this.nilaiTugas = nilaiTugas * 0.2;
        this.nilaiUTS = nilaiUTS * 0.3;
        this.nilaiUAS = nilaiUAS * 0.4;
    }
    
    void cetakNilai(){
        double nilaiAkhir = nilaiAbsensi + nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Nilai Absensi [10%]: "+nilaiAbsensi);
        System.out.println("Nilai Tugas [20%]: "+nilaiTugas);
        System.out.println("Nilai UTS [30%]: "+nilaiUTS);
        System.out.println("Nilai UAS [40%]: "+nilaiUAS);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
    }
}
