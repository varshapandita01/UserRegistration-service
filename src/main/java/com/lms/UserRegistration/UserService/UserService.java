package com.lms.UserRegistration.UserService;

import com.lms.UserRegistration.User.User;

import java.util.List;

public interface UserService {
     User registerUser(User user);
     List<User> getAllUsers();
}
