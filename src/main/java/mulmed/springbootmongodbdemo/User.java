package mulmed.springbootmongodbdemo;

public class User {
    private String nimPeminjam;
    private String namaPeminjam;

    protected User(){

    }

    public User(String nimPeminjam, String namaPeminjam) {
        this.nimPeminjam = nimPeminjam;
        this.namaPeminjam = namaPeminjam;
    }

    public String getNimPeminjam() {
        return nimPeminjam;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }
}
