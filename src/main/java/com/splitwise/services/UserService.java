package com.splitwise.services;


import com.splitwise.dtos.CreateUserDto;
import com.splitwise.dtos.GetUserDto;
import com.splitwise.models.User;
import com.splitwise.repositories.UserRepository;
import com.splitwise.services.interfaces.PasswordEncoder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@AllArgsConstructor
public class UserService {
    private UserRepository repository;
    private PasswordEncoder encoder;

    public User createUser(CreateUserDto request){
        //Step 1 - Hash the password
        String hashedPwd = encoder.encode(request.getPassword());
        //Step 2 - Convert request dto to user
        User user = request.user(hashedPwd);

        //Step 2 - Persist to the database;
        return repository.save(user);
    }

    public User getUser(Long id){
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }
}
