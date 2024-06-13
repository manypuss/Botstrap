package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.Collection;
import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserByUsername(String username);
}
