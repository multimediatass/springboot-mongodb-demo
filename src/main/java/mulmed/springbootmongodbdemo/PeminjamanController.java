package mulmed.springbootmongodbdemo;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RequestMapping("/peminjaman")
@RestController
public class PeminjamanController {

    private PeminjamanRepository peminjamanRepository;


    public PeminjamanController(PeminjamanRepository peminjamanRepository) {
        this.peminjamanRepository = peminjamanRepository;
    }

    @GetMapping("/all")
    public List<Peminjaman> getAll(){
        List<Peminjaman> peminjamen = this.peminjamanRepository.findAll();
        return peminjamen;
    }

    @PostMapping
    public void insert(@RequestBody Peminjaman peminjaman){
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
        List<Peminjaman> peminjamen = this.peminjamanRepository.findByNamaBarang(namaBarang);
        return peminjamen;
    }
}
