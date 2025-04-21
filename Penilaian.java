public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah matkul;
    double tugas;
    double uts;
    double uas;
    double nilaiAkhir;

    Penilaian() {

    }

    Penilaian(Mahasiswa mahasiswa, MataKuliah matkul, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        double nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }

    void tampilkanDataPenilaian() {
        System.out.println("=== Data Penilaian Mahasiswa ===");
        
    }
}
