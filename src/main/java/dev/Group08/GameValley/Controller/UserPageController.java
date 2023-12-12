package dev.Group08.GameValley.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserPageController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String handleCurrentUser(@RequestBody String body) {
        System.out.println(body);
        return "ehe";
    }
}
