package dev.Group08.GameValley.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("game")
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

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductCreator() {
        return productCreator;
    }

    public void setProductCreator(String productCreator) {
        this.productCreator = productCreator;
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent;
    }

    public int getTagID() {
        return TagID;
    }

    public void setTagID(int tagID) {
        TagID = tagID;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductPopularity() {
        return productPopularity;
    }

    public void setProductPopularity(int productPopularity) {
        this.productPopularity = productPopularity;
    }
}
