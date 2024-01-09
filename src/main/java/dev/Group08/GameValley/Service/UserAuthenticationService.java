package dev.Group08.GameValley.Service;

import dev.Group08.GameValley.Model.UserModel;
import dev.Group08.GameValley.Repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public void register(UserModel user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }


    public boolean isPasswordMatch(String password,UserModel user) {
        return passwordEncoder.matches(passwordEncoder.encode(password), user.getPassword());
    }

    public Authentication autoLogin(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    void loginFailed(HttpServletRequest request, HttpServletResponse response) {

    }

    void loginSuccess(HttpServletRequest request, HttpServletResponse response, Authentication successAuthentication) {

    }

}
