package mulmed.springbootmongodbdemo.Controller;


import mulmed.springbootmongodbdemo.Repository.BarangRepository;
import mulmed.springbootmongodbdemo.Entity.Peminjaman;
import mulmed.springbootmongodbdemo.Repository.PeminjamanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;



@RestController
@RequestMapping("/peminjaman")
public class PeminjamanController {
    Calendar now = Calendar.getInstance();

    private PeminjamanRepository peminjamanRepository;


    public PeminjamanController(PeminjamanRepository peminjamanRepository) {
        this.peminjamanRepository = peminjamanRepository;
    }



    @GetMapping("/all")
    public List<Peminjaman> getAll(){
        List<Peminjaman> peminjamanList = this.peminjamanRepository.findAll();
        return peminjamanList;
    }

    @PostMapping
    public void insert(@RequestBody Peminjaman peminjaman){
        int lamaMeminjam = peminjaman.getLamaMeminjam();
        String date = +(now.get(Calendar.DATE)+lamaMeminjam)+"-"+(now.get(Calendar.MONTH))+"-"+(now.get(Calendar.YEAR));
        peminjaman.setTanggalMeminjam(date);
        List<Peminjaman> peminjamen = Arrays.asList(peminjaman);
        this.peminjamanRepository.save(peminjaman);
    }

//    @PostMapping
//    public void update(@RequestBody Peminjaman peminjaman){
//        this.peminjamanRepository.save(peminjaman);
//    }

    @GetMapping("/{id}")
    public Optional<Peminjaman> getById(@PathVariable("id") String id){
            Optional<Peminjaman> peminjaman = this.peminjamanRepository.findById(id);
            return peminjaman;
    }

    @GetMapping("/peminjam/{nimpeminjam}")
    public List<Peminjaman> getByNim(@PathVariable("nimpeminjam") String nimPeminjam){
        List<Peminjaman> peminjamen = this.peminjamanRepository.findByNim(nimPeminjam);
        return peminjamen;
    }

    @GetMapping("/barang/{namabarang}")
    public List<Peminjaman> getByBarang(@PathVariable("namabarang") String namaBarang){
        int jumlah=0;
        List<Peminjaman> peminjamen = this.peminjamanRepository.findByNamaBarang(namaBarang);
        System.out.println(jumlah);
        return peminjamen;
    }

    @GetMapping("/{namapeminjam}")
    public List<Peminjaman> getByNama(@PathVariable("namapeminjam") String namaPeminjam){
        List<Peminjaman> peminjamen = this.peminjamanRepository.findByNamaPeminjam(namaPeminjam);
        return peminjamen;
    }

    @GetMapping("/nama/{namapeminjam}")
    public List<Peminjaman> getByNamaPeminjam(@PathVariable("namapeminjam") String namapeminjam){
        List<Peminjaman> peminjamen = this.peminjamanRepository.findByNama(namapeminjam);
        return peminjamen;
    }


    @GetMapping("/semuabarang")
    public ArrayList getAllBarang() {
        List<Peminjaman> peminjamen = this.peminjamanRepository.findAll();
        ArrayList barangs = new ArrayList<>();
       // String[] namaBarang = new String[peminjamen.size()];
       for (int i = 0; i <peminjamen.size(); i++) {
          barangs.add(peminjamen.get(i).getNamaBarang());
      }
        return barangs;
    }

    @GetMapping("/jumlahBarang")
    public Integer getspectBarang(){
        int hasil = 0;
        for (int i = 0; i <getAllBarang().size() ; i++) {
            hasil++;
        }
        return hasil;
    }








}
