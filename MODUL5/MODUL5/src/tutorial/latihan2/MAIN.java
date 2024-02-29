package tutorial.latihan2;

public class MAIN {
    
    public static void main(String [] args){
        BUKU PC1 = new BUKU("jokopro", "buku buku", 2033);
        BUKU PC2 = new BUKU("jokopro", "buku buku", 2033, 2);
        BUKU PC3 = new BUKU("jokopro", "buku buku", 2033, 3, 20.000);
        PC1.cetakinfo();
        PC2.cetakinfo();
        PC3.cetakinfo();
    }
}
