package dev.Group08.GameValley.Controller;

import dev.Group08.GameValley.Model.UserModel;
import dev.Group08.GameValley.Service.UserAuthenticationService;
import dev.Group08.GameValley.Service.UserProfileService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MainPageController {
    @Autowired
    private UserAuthenticationService authenticationService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserProfileService profileService;
//    @Autowired
//    private PersistentTokenBasedRememberMeServices rememberMeServices;

    @RequestMapping("/")
    public ResponseEntity<?> get() {
        return ResponseEntity.noContent().build();
    }

    @RequestMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserModel user) {
        try {
            authenticationService.register(user);
            return ResponseEntity.ok("Registered successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @RequestMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginRequest, HttpServletResponse response) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        UserModel user = profileService.getByUsername(username);

        if (user == null) {
            return ResponseEntity.badRequest().body("Username or password incorrect");
        }

        if (!authenticationService.isPasswordMatch(password, user)) {
            return ResponseEntity.badRequest().body("Username or password incorrect");
        }

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(authenticationToken);

        if (authentication.isAuthenticated()) {
            if (loginRequest.containsKey("remember-me")) {

//                response.addCookie(new Cookie("remember-me", rememberMeToken));
            }
            return ResponseEntity.ok("Login successfully");
        }
        else
            return ResponseEntity.badRequest().body("Username or password incorrect");
    }
}
