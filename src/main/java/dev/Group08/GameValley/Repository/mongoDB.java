import com.mongodb.*;
public class mongoDB {
    public static MongoClient mongoClient;
    public static DB database;
    public static DBCollection test;

    public static void main(String[] args) throws Exception {
        mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        database = mongoClient.getDB("mongoTutorial");
        test = database.getCollection("testing");
        user t = new user();
        t.setEmail("abc");
        t.setPhone("0123456789");
        t.setPassword("HaoTanker");
        test.insert(convert(t));
        DBObject query = new BasicDBObject("XP", 11);
        DBCursor cursor = test.find(query);
        System.out.println(cursor.one());

        System.out.println(jpgToBin.encodeImage("C:\\Users\\LENOVO\\Downloads\\komi.jpg",
                                                "C:\\Users\\LENOVO\\Downloads\\img.txt"));
    }

    public static DBObject convert(user test){
        return new BasicDBObject("XP", test.getEmail()).append("Timer", test.getPassword()).append("memberID", test.getPhone());
    }
}
