package mulmed.springbootmongodbdemo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "Peminjaman")
public class Peminjaman {

    @Id
    private String id;
    @DBRef(lazy = true)
    private User user;
    private List<Barang> namaBarang;
    private int lamaMeminjam;
    private String tanggalMeminjam;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int totalBayar;

    protected Peminjaman(){
       this.namaBarang = new ArrayList<>();
    }

    public Peminjaman(User user, List<Barang> namaBarang, int lamaMeminjam, String tanggalMeminjam, int totalBayar) {
        this.user = user;
        this.namaBarang = namaBarang;
        this.lamaMeminjam = lamaMeminjam;
        this.tanggalMeminjam = tanggalMeminjam;
        this.totalBayar = totalBayar;
    }

    public String getId() {
        return id;
    }


    public User getUser() {
        return user;
    }

    public List<Barang> getNamaBarang() {
        return namaBarang;
    }

    public int getLamaMeminjam() {
        return lamaMeminjam;
    }

    public String getTanggalMeminjam() {
        return tanggalMeminjam;
    }

    public int getTotalBayar() {
        return totalBayar;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setNamaBarang(List<Barang> namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setLamaMeminjam(int lamaMeminjam) {
        this.lamaMeminjam = lamaMeminjam;
    }

    public void setTanggalMeminjam(String tanggalMeminjam) {
        this.tanggalMeminjam = tanggalMeminjam;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }


}
