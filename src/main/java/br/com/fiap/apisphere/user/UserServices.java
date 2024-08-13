package br.com.fiap.apisphere.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User create(User user){
        return repository.save(user);
    }


}
