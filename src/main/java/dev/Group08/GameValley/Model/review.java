public class review {
    public String postUser; //uID
    public int rating;
    public String comment;
    public int upVote;
    public int downVote;
    public String[] additionContent;

    review(){
        postUser = "";
        rating = 0;
        comment = "";
        upVote = 0;
        downVote = 0;
        additionContent = null;
    }
}
