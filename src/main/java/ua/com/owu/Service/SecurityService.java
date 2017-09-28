package ua.com.owu.Service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
