public class product {
    public String pName;
    public String pID;
    public tag[] pTag;
    public String[] pLinks;
    public float pPrice;
    public String pCreator;
    public String[] content;
    public review[] pReview;
    public int pPopularity;

    product(){
        pName = "";
        pID = "";
        pTag = null;
        pLinks = null;
        pPrice = 0;
        pCreator = "";
        content = null;
        pReview = null;
        pPopularity = 0;
    }
}
