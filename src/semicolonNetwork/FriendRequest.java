package semicolonNetwork;

public class FriendRequest {

    private User sender;
    private User receiver;

    public FriendRequest(User user, User receiver) {
        this.sender = user;
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }
}


