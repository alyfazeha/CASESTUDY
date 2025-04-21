import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Mahasiswa [] listMhs = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"),
    };
    
    // Penilaian penilaian = new Penilaian();
    // Penilaian[] daftarNilai = new Penilaian[5];
    // daftarNilai[0] = new Penilaian(Mahasiswa[0], daftarMtk[0], 80,   85, 90);
    // daftarNilai[1] = new Penilaian(Mahasiswa[0], daftarMtk[1], 60,   75, 70);
    // daftarNilai[2] = new Penilaian(Mahasiswa[1], daftarMtk[0], 75,   70, 80);
    // daftarNilai[3] = new Penilaian(Mahasiswa[2], daftarMtk[1], 85,   90, 95);
    // daftarNilai[4] = new Penilaian(Mahasiswa[2], daftarMtk[2], 80,   90, 65);

    // Penilaian penilaian = new Penilaian();
    Mahasiswa mahasiswa = new Mahasiswa();
    // MataKuliah matkul = new MataKuliah();

    while(true){
        System.out.println("=== MENU SISTEM AKADEMIK ===");
        System.out.println("1. Tampilkan daftar Mahasiswa");
        System.out.println("2. Tampilkan Daftar Mata Kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
        System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        int input = sc.nextInt();

        if(input == 1){
            mahasiswa.tampilMahasiswa(listMhs);
        }else if(input == 2){
            // matkul.tampilMataKuliah();
        }else if(input == 3){
            // penilaian.tampilkanDataPenilaian();
        }else if(input == 4){
            // penilaian.urutkanMahasiswa();
        }else if(input == 5){
            System.out.print("Masukkan NIM yang dicari: ");
            String nim = sc.next();
            // penilaian.cariMahasiswa(nim);
        }else if(input == 0){
            System.out.println("Terimakasih, sampai jumpa kembali!");
            break;
        }else{
            System.out.println("Invalid input.\nHarap pilih salah satu menu yang tersedia");
        }
    }
}
}