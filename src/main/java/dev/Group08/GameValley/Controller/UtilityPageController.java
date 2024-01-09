package dev.Group08.GameValley.Controller;

import dev.Group08.GameValley.Model.GameProductModel;
import dev.Group08.GameValley.Service.GameMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@RequestMapping("/util")
public class UtilityPageController {
    @Autowired
    private GameMenuService gameMenuService;

    @RequestMapping("/add")
    public ResponseEntity<?> addGame(GameProductModel product) {
        gameMenuService.addProduct(product);
        return ResponseEntity.ok("Product added");
    }
    @RequestMapping("/remove/{pID}")
    public ResponseEntity<?> removeGame(@PathVariable String pID) {
        if (gameMenuService.removeSpecificID(pID)) {
            return ResponseEntity.ok("Remove success");
        }
        return ResponseEntity.ok("Unable to remove the product");

    }


}
