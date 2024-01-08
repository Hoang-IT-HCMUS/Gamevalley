package dev.Group08.GameValley.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ReviewModel {
    @Id
    private String rID;
    private String uID;
    private String pID;
    private String content;
    private int upvote;
    private int downvote;

    ReviewModel() {
        rID = "";
        uID = "";
        pID = "";
        content = "";
        upvote = 0;
        downvote = 0;
    }
}
