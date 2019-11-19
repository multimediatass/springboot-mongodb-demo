package mulmed.springbootmongodbdemo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
    private String nimPeminjam;
    private String namaPeminjam;
    private String password;
    private String tingkatLevel;


    protected User(){

    }


    public User(String nimPeminjam, String namaPeminjam, String password, String tingkatLevel) {
        this.nimPeminjam = nimPeminjam;
        this.namaPeminjam = namaPeminjam;
        this.password = password;
        this.tingkatLevel = tingkatLevel;
    }


    public void setNimPeminjam(String nimPeminjam) {
        this.nimPeminjam = nimPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTingkatLevel() {
        return tingkatLevel;
    }

    public void setTingkatLevel(String tingkatLevel) {
        this.tingkatLevel = tingkatLevel;
    }

    public String getNimPeminjam() {
        return nimPeminjam;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }
}
