package mulmed.springbootmongodbdemo;

public class Barang {
    private String namaBarang;
    private int jumlahBarang;
    private int hargaSewa;
    private boolean available;

    public Barang() {
    }


    public Barang(String namaBarang, int jumlahBarang, int hargaSewa, boolean available) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
        this.hargaSewa = hargaSewa;
        this.available = available;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
