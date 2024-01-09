package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.GameProductModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameProductRepository extends MongoRepository<GameProductModel, String> {
    @Query("{ 'pID': { $regex: ?0 } }")
    public GameProductModel findByID(String pID);

    @Query("{ 'productName': { $regex: ?0 } }")
    public List<GameProductModel> findByName(String productName);

    @Query("{ 'TagID': { $regex: ?0 } }")
    public List<GameProductModel> findByTag(int TagID);
}
