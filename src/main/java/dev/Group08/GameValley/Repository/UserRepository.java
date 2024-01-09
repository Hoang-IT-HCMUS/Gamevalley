package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserModel, String> {
    public UserModel getByUID(String uID);
    public UserModel getByUsername(String username);

    public List<UserModel> getByReputation(int upvote);
}
