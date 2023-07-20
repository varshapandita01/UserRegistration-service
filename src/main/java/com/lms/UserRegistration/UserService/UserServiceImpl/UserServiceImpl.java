package com.lms.UserRegistration.UserService.UserServiceImpl;

import com.lms.UserRegistration.User.User;
import com.lms.UserRegistration.UserRepository.UserRepository;
import com.lms.UserRegistration.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public  User registerUser(User user){
            return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
