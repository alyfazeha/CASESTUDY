public class dataMatakuliah {
    matakuliah[] dataMatakuliah = new matakuliah[10];
    int idx = 0;

    public void tambah(matakuliah matkul){
        if (idx < dataMatakuliah.length){
            dataMatakuliah[idx] = matkul;
            idx++;
        }
    }
    public void tampil(){
        for (int i = 0; i < idx; i++){
            dataMatakuliah[i].tampil();
        }
    }
}
