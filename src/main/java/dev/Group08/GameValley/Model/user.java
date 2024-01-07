public class user {
    private String email;
    private String password;
    public String username;
    private String phone;
    public String uID;
    public int upVote;
    public int downVote;
    public user(){
        email = "";
        password = "";
        username = "";
        phone = "";
        uID = "";
        upVote = 0;
        downVote = 0;

    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getPhone(){
        return phone;
    }

    public void setEmail(String temp){
        this.email = temp;
    }

    public void setPassword(String temp) {
        this.password = temp;
    }

    public void setPhone(String temp){
        this.phone = temp;
    }
}
