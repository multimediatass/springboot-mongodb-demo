package mulmed.springbootmongodbdemo.Repository;

import mulmed.springbootmongodbdemo.Entity.Peminjaman;
import mulmed.springbootmongodbdemo.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
