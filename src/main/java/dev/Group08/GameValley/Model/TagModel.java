package dev.Group08.GameValley.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("tag")
public class TagModel {
    private String tagName;
    private byte tID;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public byte gettID() {
        return tID;
    }

    public void settID(byte tID) {
        this.tID = tID;
    }
}
