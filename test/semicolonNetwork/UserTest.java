package semicolonNetwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("Blessing", "Asuelimen", "08023344536",
                "blessing123@gmail.com", "bless111", 987);
    }

    @Test
    void testThatUserHasFirstName() {
        user.setFirstName();
        assertEquals("Blessing", user.getFirstName());
    }

    @Test
    void testThatUserHasLastName() {
        user.setLastName();
        assertEquals("Asuelimen", user.getLastName());
    }

    @Test
    void testThatUserHasPhoneNumber() {
        user.setPhoneNumber();
        assertEquals("08023344536", user.getPhoneNumber());
    }

    @Test
    void testThatUserHasEmail() {
        user.setEmail();
        assertEquals("blessing123@gmail.com", user.getEmail());
    }

    @Test
    void testThatUserHasUserName() {
        user.setUserName();
        assertEquals("bless111", user.getUserName());
    }

    @Test
    void testThatUserHasPassword() {
        user.setPassword(987);
        assertEquals(987, user.getPassword());
    }

    @Test
    void userCanSendRequest() {
        User myUser = new User("Kola", "janet", "09087446362", "kolaJanet@yahoo.com", "babe100", 1234);
        user.sendFriendRequest(myUser);
        assertEquals(1, user.numOfSentRequests());
        User hisUser = new User();
        hisUser.sendFriendRequest(myUser);
        assertEquals(1, hisUser.numOfSentRequests());
        myUser.sendFriendRequest(hisUser);
        assertEquals(1, myUser.numOfSentRequests());
    }

    @Test
    void userCanReceiveRequest() {
        User myUser = new User("Kola", "janet", "09087446362", "kolaJanet@yahoo.com", "babe100", 1234);
        user.sendFriendRequest(myUser);
        assertEquals(1, myUser.numOfReceivedRequests());
        User hisUser = new User();
        hisUser.sendFriendRequest(myUser);
        assertEquals(2, myUser.numOfReceivedRequests());
        myUser.sendFriendRequest(hisUser);
        assertEquals(1, hisUser.numOfReceivedRequests());
    }
    @Test
    void userViewReceivedRequest(){
        User user1 = new User();
        user.sendFriendRequest(user1);
        assertNotNull(user1.getReceivedRequests());
    }

    @Test
    void userViewSentRequest(){
        User user1 = new User();
        user.sendFriendRequest(user1);
        assertNotNull(user.getSentRequests());
    }


    @Test
    void userCanAddFriend(){
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user2.sendFriendRequest(user1);
        user3.sendFriendRequest(user1);
        assertEquals(2,user1.numOfReceivedRequests());
        int request = 0;
        user1.addFriend(request);
        assertEquals(1, user1.numOfFriends());
        assertEquals(1, user1.numOfReceivedRequests());
        assertEquals(1, user2.numOfFriends());



    }
}