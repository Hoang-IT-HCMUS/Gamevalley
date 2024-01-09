package dev.Group08.GameValley.Service;

import dev.Group08.GameValley.Model.UserModel;
import dev.Group08.GameValley.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class UserRatingService {
    @Autowired
    private UserRepository userRepository;

    public void upvoteUser(String username) {
        UserModel targetUser = userRepository.getByUsername(username);

        if (targetUser == null) {
            return;
        }
        userRepository.delete(targetUser);
        targetUser.setUpvote(targetUser.getUpvote() + 1);
        userRepository.save(targetUser);
    }

    public void downvoteUser(String username) {
        UserModel targetUser = userRepository.getByUsername(username);

        if (targetUser == null) {
            return;
        }
        userRepository.delete(targetUser);
        targetUser.setDownvote(targetUser.getDownvote() + 1);
        userRepository.save(targetUser);
    }
}
