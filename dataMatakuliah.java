public class dataMatakuliah {
   // matakuliah[] dataMatakuliah = new matakuliah[];
    
    matakuliah[] daftarMK = {
        new matakuliah("MK001", "Struktur data", 3),
        new matakuliah("MK002", "Basis Data", 3),
        new matakuliah("MK003", "Desain Web", 3)
    };
    //public void tambah(matakuliah matkul){
      //  if (idx < dataMatakuliah.length){
        //    dataMatakuliah[idx] = matkul;
          //  idx++;
        //}
    //}
    public void tampil(){
        System.out.println("Daftar Matakuliah: ");
        for (matakuliah mk : daftarMK){
        mk.tampil();
        }
    }
}