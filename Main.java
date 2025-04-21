import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Penilaian penilaian = new Penilaian();
    Mahasiswa mahasiswa = new Mahasiswa();
    MataKuliah matkul = new MataKuliah();

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
            mahasiswa.tampilMahasiswa();
        }else if(input == 2){
            matkul.tampilMataKuliah();
        }else if(input == 3){
            penilaian.tampilkanDataPenilaian();
        }else if(input == 4){
            penilaian.urutkanMahasiswa();
        }else if(input == 5){
            System.out.print("Masukkan NIM yang dicari: ");
            String nim = sc.next();
            penilaian.cariMahasiswa(nim);
        }else if(input == 0){
            System.out.println("Terimakasih, sampai jumpa kembali!");
            break;
        }else{
            System.out.println("Invalid input. \nHarap pilih salah satu menu yang tersedia");
        }
    }
}
}