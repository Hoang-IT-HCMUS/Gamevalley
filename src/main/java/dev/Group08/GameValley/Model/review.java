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

    review(String user, int rate, String comm, int up, int down, String[] add){
        postUser = user;
        rating = rate;
        comment = comm;
        upVote = up;
        downVote = down;
        additionContent = new String[add.length];
        for(int i = 0; i < add.length; i++){
            additionContent[i] = add[i];
        }
    }

    review(review r){
        this.postUser = r.postUser;
        this.rating = r.rating;
        this.comment = r.comment;
        this.upVote = r.upVote;
        this.downVote = r.downVote;
        this.additionContent = new String[r.additionContent.length];
        for(int i = 0; i < r.additionContent.length; i++){
            this.additionContent[i] = r.additionContent[i];
        }
    }
}
