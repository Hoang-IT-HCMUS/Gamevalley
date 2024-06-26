package dev.Group08.GameValley.Service;

import dev.Group08.GameValley.Model.UserModel;
import dev.Group08.GameValley.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
    @Autowired
    private UserRepository userRepository;

    public UserModel getByUID(String uID) {
        return userRepository.getByUID(uID);
    }

    public UserModel getByUsername(String username) {
        return userRepository.getByUsername(username);
    }
}
