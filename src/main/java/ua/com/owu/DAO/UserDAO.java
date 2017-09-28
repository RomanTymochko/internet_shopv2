package ua.com.owu.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.Entity.User;

/**
 * Created by Roman Tymochko on 28.08.2017.
 */
public interface UserDAO extends JpaRepository<User, Integer> {
    User findByUsername(String username);

//    User findByEmail(String email);
}
