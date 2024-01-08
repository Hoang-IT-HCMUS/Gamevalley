//import com.mongodb.*;
//import com.mongodb.reactivestreams.client.MongoClient;
//
//public class mongoDB {
//    public static MongoClient mongoClient;
//    public static DB database;
//    public static DBCollection collection;
//
//    public static void connectDB() throws Exception {
//        mongoClient = new MongoClient(new MongoClientURI("mongoDB://localhost27017"));
//        database = mongoClient.getDB("db");
//    }
//
//    public static void connectUser() throws Exception {
//        if(database == null)
//            connectDB();
//        collection = database.getCollection("user");
//    }
//
//    public static void connectProduct() throws Exception {
//        if(database == null)
//            connectDB();
//        collection = database.getCollection("product");
//    }
//
//    public static void connectReview() throws Exception {
//        if(database == null)
//            connectDB();
//        collection = database.getCollection("review");
//    }
//
//    public static void connectPic()throws Exception {
//        if(database == null)
//            connectDB();
//        collection = database.getCollection("picture");
//    }
//
//    public static void insertUser(user t) throws Exception {
//        connectUser();
//        collection.insert(convertUser(t));
//    }
//
//    public static void insertProduct(product p) throws Exception {
//        connectProduct();
//        collection.insert(convertProduct(p));
//    }
//
//    public static void insertReview(review r) throws Exception {
//        connectReview();
//        collection.insert(convertReview(r));
//    }
//
//    public static void insertPic(String name, String path) throws Exception {
//        connectPic();
//        collection.insert(convertPic(path, name));
//    }
//
//    public static DBCursor findUserByName(String name) throws Exception {
//        connectUser();
//        DBObject query = new BasicDBObject("Username", name);
//        return collection.find(query);
//    }
//
//    public static DBCursor findReviewByUser(String name){
//        DBObject query = new BasicDBObject("postUser", name);
//        return collection.find(query);
//    }
//
//    public static DBCursor findProductByName(String name){
//        DBObject query = new BasicDBObject("pName", name);
//        return collection.find(query);
//    }
//
//    public static DBCursor findPicByName(String name){
//        DBObject query = new BasicDBObject("Name", name);
//        return collection.find(query);
//    }
//
//    public static DBObject convertUser(user test){
//        return new BasicDBObject
//                ("Username", test.username)
//                .append("Email", test.getEmail())
//                .append("uID", test.uID)
//                .append("password", test.getPassword())
//                .append("upvote", test.upVote)
//                .append("downvote", test.downVote);
//    }
//
//    public static DBObject convertProduct(product test){
//        return new BasicDBObject
//                ("pName", test.pName)
//                .append("ID", test.pID)
//                .append("Tags", test.pTag)
//                .append("Links", test.pLinks)
//                .append("Price", test.pPrice)
//                .append("Creator", test.pCreator)
//                .append("Content", test.content)
//                .append("Review", test.pReview)
//                .append("Popularity", test.pPopularity);
//    }
//
//    public static DBObject convertReview(review test){
//        return new BasicDBObject
//                ("postUser", test.postUser)
//                .append("Rating", test.rating)
//                .append("Comment", test.comment)
//                .append("Upvote", test.upVote)
//                .append("Downvote", test.downVote)
//                .append("Content", test.additionContent);
//    }
//
//    public static DBObject convertPic(String path, String name) throws Exception {
//        String pic = ImageCodec.encodeImage(path);
//        return new BasicDBObject("picString", pic).append("Name", name);
//    }
//}
