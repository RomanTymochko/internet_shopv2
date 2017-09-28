package ua.com.owu.Service;

import ua.com.owu.Entity.User;

import java.util.List;


public interface UserService {

    void save(User user);
    void save(String username, String password);

    User findOne(int id);
    List<User> findAll();

    User findByUsername(String username);
//    User findByEmail(String email);

}
