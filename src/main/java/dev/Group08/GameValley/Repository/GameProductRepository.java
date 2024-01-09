package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.GameProductModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameProductRepository extends MongoRepository<GameProductModel, String> {
    public GameProductModel findByID(String pID);
    public List<GameProductModel> findByName(String productName);
    public List<GameProductModel> findByTag(int TagID);
    public List<GameProductModel> findALl();
}
