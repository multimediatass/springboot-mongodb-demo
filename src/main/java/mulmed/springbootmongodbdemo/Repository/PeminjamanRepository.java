package mulmed.springbootmongodbdemo.Repository;

import mulmed.springbootmongodbdemo.Entity.Peminjaman;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeminjamanRepository extends MongoRepository<Peminjaman, String> {



    Optional<Peminjaman> findById(String id);


    @Query(value = "{'user.nimPeminjam':?0}")
    List<Peminjaman> findByNim(String nimPeminjam);

    @Query(value = "{'user.namaPeminjam':?0}")
    List<Peminjaman> findByNama(String namaPeminjam);

    @Query(value = "{'namaBarang.namaBarang':?0}")
    List<Peminjaman> findByNamaBarang(String namaBarang);
    @Query(value = "{'namaBarang':'$namaBarang','_id': NumberInt(0)}")
    List<Peminjaman> findAllBarang();

    @Query(value = "{'user.namaPeminjam':?0}")
    List<Peminjaman> findByNamaPeminjam(String namaPeminjam);


}




