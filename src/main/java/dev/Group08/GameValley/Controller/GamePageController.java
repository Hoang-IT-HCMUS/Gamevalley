package dev.Group08.GameValley.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/game")
public class GamePageController {
    @RequestMapping(name = "/", method = RequestMethod.GET)
    @ResponseBody
    public String handlePage(@RequestBody String body) {

        /*

            GAME PAGE SERVICE

         */

        return body;
    }


}
