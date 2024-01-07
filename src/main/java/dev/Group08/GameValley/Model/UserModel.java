package dev.Group08.GameValley.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserModel {
    @Id
    private String uid;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private int upvote;
    private int downvote;
}
