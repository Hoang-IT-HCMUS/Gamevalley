package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
    public UserModel getByUID(String uID);
    public UserModel getByUsername(String username);

    public List<UserModel> getByReputation(int upvote);
}
