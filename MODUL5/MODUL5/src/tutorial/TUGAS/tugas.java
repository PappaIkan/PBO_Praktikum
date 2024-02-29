package tutorial.TUGAS;

public class tugas {
    String nama, nim;
    int umur;

    void setdefault(){
        System.out.println("pandu");
        System.out.println("L200220227");
        System.out.println(44);
    }

    public tugas(String nama, String nim, int umur){
        this.nama=nama;
        this.nim = nim;
        this.umur = umur;
    }

    void infocek(){
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(umur);
    }


}
