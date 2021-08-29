package semicolonNetwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
    Message message;

    @BeforeEach
    void setUp() {
        message = new Message("My Birthday", "My Birthday is Today, hip hip Hurray");
    }

    @Test
    void testThatMessageHasTitle(){
        message.setTitle();
        assertEquals("My Birthday", message.getTitle());
    }

    @Test
    void testThatMessageHasBody(){
        message.setBody();
        assertEquals("My Birthday is Today, hip hip Hurray", message.getBody());
    }

}