package mulmed.springbootmongodbdemo.Controller;

import mulmed.springbootmongodbdemo.Entity.Peminjaman;
import mulmed.springbootmongodbdemo.Entity.User;
import mulmed.springbootmongodbdemo.Repository.BarangRepository;
import mulmed.springbootmongodbdemo.Repository.PeminjamanRepository;
import mulmed.springbootmongodbdemo.Repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/all")
    public List<User> getAll(){
        List<User> users = this.userRepository.findAll();
        return users;
    }


    @PostMapping
    public void insert(@RequestBody User user){
        this.userRepository.save(user);
    }




}
