package dev.Group08.GameValley.Controller;

import dev.Group08.GameValley.Model.GameProductModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/game")
public class GamePageController {
    @RequestMapping(name = "/id/{gameID}", method = RequestMethod.GET)
    @ResponseBody
    public GameProductModel targetGame(@PathVariable String gameID) {

        /*

            GAME PAGE SERVICE

         */

        return null;
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
    public List<GameProductModel> targetGameName(@PathVariable String name) {
        /*
            Game PAGE SERVICE
         */

        return null;
    }
}
