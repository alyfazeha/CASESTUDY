public class Matakuliah {
    String kodeMK;
    String namaMK;
    int SKS;

    Matakuliah(String kodeMK, String namaMK, int SKS){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
    }
    public void tampil(){
        System.out.println("Kode MK: "+ kodeMK +" | nama: "+ namaMK +" | Sks: "+ SKS);
    }
}
