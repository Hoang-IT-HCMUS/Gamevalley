package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
    @Query("{uID:'?0'}")
    public UserModel getByUID(String uID);

    @Query("{username:'?0'}")
    public UserModel getByUsername(String username);
}
