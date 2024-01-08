package dev.Group08.GameValley.Repository;

import dev.Group08.GameValley.Model.GameProductModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface GameProductRepository extends MongoRepository<GameProductModel, String> {
    public GameProductModel findByID(String pID);
    public List<GameProductModel> findByTag(int TagID);
}
