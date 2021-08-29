package semicolonNetwork;

import java.util.ArrayList;
import java.util.List;

public class FriendMatcher {
    public static void match(FriendRequest request) {
        User sender =  request.getSender();
        User receiver = request.getReceiver();
        sender.sentRequests.add(receiver);
        receiver.receivedRequests.add(sender);

    }

    public static void accept(User user1, User user) {
        user1.friends.add(user);
        user.friends.add(user1);
        user.sentRequests.remove(user1);
        user1.receivedRequests.remove(user);
    }
}
