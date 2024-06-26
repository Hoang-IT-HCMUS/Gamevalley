package dev.Group08.GameValley.Controller;

import dev.Group08.GameValley.Model.UserModel;
import dev.Group08.GameValley.Service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
public class UserPageController {

    private final UserProfileService profileService;

    @Autowired
    public UserPageController(UserProfileService profileService) {
        this.profileService = profileService;
    }

    @RequestMapping("/{userID}")
    @ResponseBody
    public UserModel handleSpecificUser(@PathVariable String userID) {
        return profileService.getByUID(userID);
    }

}
