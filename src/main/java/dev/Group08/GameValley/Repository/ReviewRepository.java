package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.ReviewModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewModel, String> {
    @Query("{ 'pID': { $regex: ?0 } }")
    public ReviewModel getByProduct(String pID);

    @Query("{ 'uID': { $regex: ?0 } }")
    public ReviewModel getByUser(String uID);
}
