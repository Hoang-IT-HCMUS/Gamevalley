package dev.Group08.GameValley.Controller;

import dev.Group08.GameValley.Model.UserModel;
import dev.Group08.GameValley.Service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MainPageController {
    @Autowired
    private UserAuthenticationService authenticationService;
    @Autowired
    private AuthenticationManager authenticationManager;


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
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        UserModel user = authenticationService.getByUsername(username);

        if (user == null) {
            return ResponseEntity.badRequest().body("Username or password incorrect");
        }
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(authenticationToken);

        if (authentication.isAuthenticated())
            return ResponseEntity.ok("Login successfully");
        else
            return ResponseEntity.badRequest().body("Username or password incorrect");
    }
}
