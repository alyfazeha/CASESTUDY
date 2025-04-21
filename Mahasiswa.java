import java.util.Scanner;
public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;
    Mahasiswa[] listMahasiswa = new Mahasiswa[3];

    public Mahasiswa() {
    }
    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listMahasiswa.length; i++) {
            System.out.print("NIM: ");
            NIM = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("Prodi: ");
            prodi = sc.nextLine();
            
            listMahasiswa[i] = new Mahasiswa(NIM, nama, prodi);
        }
        for (int i = 0; i < listMahasiswa.length; i++) {
            System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi);
        }
    }
}