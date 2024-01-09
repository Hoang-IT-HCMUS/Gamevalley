package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.ReviewModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewModel, String> {
    @Query("{ 'pID': { $regex: ?0 } }")
    public List<ReviewModel> getByProduct(String pID);

    @Query("{ 'uID': { $regex: ?0 } }")
    public List<ReviewModel> getByUser(String uID);
}
