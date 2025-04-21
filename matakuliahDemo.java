import java.util.Scanner;
public class matakuliahDemo{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        matakuliahDemo data = new matakuliahDemo();
        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ==");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        int pilihan = sc.nextInt();
        sc.nextLine(); 
        switch (pilihan) {
            case 1:
            case 2:
                System.out.println("\nDaftar Mata Kuliah: ");
                data.tampil();
                break;
            }
        }
    }
}