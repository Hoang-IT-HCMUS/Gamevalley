package dev.Group08.GameValley.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GameProductModel {
    @Id
    private String productID;
    private String productName;
    private String productLink;
    private String productCreator;
    private String productContent;
    private int TagID;
    private float productPrice;
    private int productPopularity;

    GameProductModel() {
        productID = "";
        productName = "";
        productLink = "";
        productCreator = "";
        productContent = "";
        TagID = 0;
        productPrice = 0.0f;
        productPopularity = 0;
    }
}
