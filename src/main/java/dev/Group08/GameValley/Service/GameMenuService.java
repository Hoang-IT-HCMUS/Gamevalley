package dev.Group08.GameValley.Service;

import dev.Group08.GameValley.Model.GameProductModel;
import dev.Group08.GameValley.Repository.GameProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameMenuService {
    @Autowired
    private GameProductRepository productRepository;

    public List<GameProductModel> getAllGameProduct() {
        return productRepository.findAll();
    }

    public List<GameProductModel> getAllGameByTags(int tags) {
        return productRepository.findByTag(tags);
    }

    public List<GameProductModel> getAllGameByNames(String productName) {
        return productRepository.findByName(productName);
    }

    public GameProductModel getBySpecificID(String pID) {
        return productRepository.findByID(pID);
    }

    public boolean removeSpecificID(String pID) {
        if (!productRepository.existsById(pID)) return false;
        productRepository.deleteById(pID);

        return true;
    }

    public boolean addProduct(GameProductModel product) {
        productRepository.insert(product);
        return true;
    }
}
