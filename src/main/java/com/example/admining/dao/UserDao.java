package com.example.admining.dao;






import com.example.admining.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();

    User getUser(int id);

    void deleteUser(int id);

    void updateUser(User user);

}
