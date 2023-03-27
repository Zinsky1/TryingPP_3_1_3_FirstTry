package com.example.admining.service;





import com.example.admining.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUser(int id);
    void deleteUser(int id);
    void updateUser(User user);

}
