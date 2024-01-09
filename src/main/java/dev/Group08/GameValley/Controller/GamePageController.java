package dev.Group08.GameValley.Controller;

import dev.Group08.GameValley.Model.GameProductModel;
import dev.Group08.GameValley.Service.GameMenuService;
import dev.Group08.GameValley.Service.GameProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RequestMapping(name = "/game")
public class GamePageController {
    @Autowired
    private GameMenuService gameMenuService;

    @RequestMapping(name = "/id/{gameID}")
    @ResponseBody
    public ResponseEntity<?> targetGame(@PathVariable String gameID) {
        GameProductModel model = gameMenuService.getBySpecificID(gameID);
        return ResponseEntity.ok().body(model);
    }

    @RequestMapping(name = "/tags/{tags}")
    @ResponseBody
    public List<GameProductModel> targetGameTags(@PathVariable String tags) {

        /*
            GAME PAGE SERVICE
         */

        return null;
    }

    @RequestMapping(name = "/find/{name}")
    @ResponseBody
    public ResponseEntity<List<GameProductModel>> targetGameName(@PathVariable String name) {
        /*
            Game PAGE SERVICE
         */

        return null;
    }
}
