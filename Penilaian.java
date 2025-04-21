public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah matkul;
    String tugas;
    double uts;
    double uas;

    Penilaian() {

    }

    Penilaian(Mahasiswa mahasiswa, MataKuliah matkul, String tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    double nilaiTugas() {

    }

    double nilaiUts() {

    }

    double nilaiUas() {

    }

    double nilaiAkhir() {

    }

    void hitungNilaiAkhir() {

    }

    void tampilkanDataPenilaian() {
        System.out.println("=== DATA PENILAIAN MAHASISWA ===");
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Mata Kuliah: " + matkul.getNamaMatkul());
        System.out.println("Tugas: " + tugas);
        System.out.println("UTS: " + uts);
        System.out.println("UAS: " + uas);
        System.out.println("Nilai Akhir: " + nilaiAkhir());
    }
    void urutkanMahasiswa() {
        
    }
    void cariMahasiswa(String nim) {
       
    }
}
