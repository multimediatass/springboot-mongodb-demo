package mulmed.springbootmongodbdemo.Repository;

import mulmed.springbootmongodbdemo.Entity.Peminjaman;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BarangRepository extends MongoRepository<Peminjaman, String> {
    @Query(value = "{'namaBarang':'$namaBarang'},'_id': NumberInt(0)}")
    List<Peminjaman> findAllBarang();
}
