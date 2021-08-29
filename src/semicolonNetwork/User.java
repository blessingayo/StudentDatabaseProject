package semicolonNetwork;

import java.util.ArrayList;
import java.util.List;

public class User {

    Address address;
    List<Message> messages;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String userName;
    private int password;

    public User(String firstName, String lastName, String phoneNumber, String email, String userName, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    List<User> sentRequests = new ArrayList<User>();
    List<User> receivedRequests = new ArrayList<>();
    List<User> friends = new ArrayList<>();

    public User() {

    }

    public void setFirstName() {
        firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName() {
        lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber() {
        phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail() {
        email = email;
    }

    public String getEmail() {
        return email;
    }

    public void sendMessage(){

    }

    public void recieveMessage(){

    }
    public void addFriend(int request){
        FriendMatcher.accept(this, receivedRequests.get(request));

    }

    public void logIn(){

    }

    public void LogOut(){

    }

    public void setUserName() {
        userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }
    public void sendFriendRequest(User receiver){
        FriendRequest request = new FriendRequest(this, receiver);
        FriendMatcher.match(request);
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public int numOfSentRequests() {
        System.out.println(sentRequests);
        return this.sentRequests.size();
    }

    public int numOfReceivedRequests() {
        return this.receivedRequests.size();
    }

    public List<User> getReceivedRequests() {
        return receivedRequests;
    }

    public List<User> getSentRequests() {
        return sentRequests;
    }

    public int numOfFriends() {
        return friends.size();
    }
}
