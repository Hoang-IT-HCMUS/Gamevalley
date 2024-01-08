package dev.Group08.GameValley.Model;

public class TagModel {
    private String tagName;
    private byte tID;

    TagModel() {
        tagName = "";
        tID = 0;
    }

    TagModel(String tagName, byte tID) {
        this.tagName = tagName;
        this.tID = tID;
    }
}
