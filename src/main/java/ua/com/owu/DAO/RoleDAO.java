package ua.com.owu.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.Entity.Role;

public interface RoleDAO extends JpaRepository<Role, Integer> {

}
