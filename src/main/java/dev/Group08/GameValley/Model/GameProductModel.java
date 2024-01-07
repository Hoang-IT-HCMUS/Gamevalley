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
    private float productPrice;
    private int productPopularity;
}
