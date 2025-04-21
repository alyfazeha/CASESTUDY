
import java.util.Scanner;

public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}