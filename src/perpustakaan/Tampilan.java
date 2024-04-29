package perpustakaan;

/**
 * @author RIZQY
 */
public class Tampilan extends Buku {
    public Tampilan(String judul, String penulis, String publisher, String kategori,int stok, String tahunT) {
        super(judul, penulis, publisher, kategori, stok, tahunT);
    }
 
    @Override
    public void displayInfo() {
        // Implementasi detail informasi yang ingin ditampilkan
        System.out.println("Judul Buku: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunT);
    }
}
