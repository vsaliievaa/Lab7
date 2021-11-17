package sender;

import facebook.FacebookUser;
import user.MyFacebookUser;
import user.User;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {

    private MessageSender sender;
    private FacebookUser facebookUser;
    private MyFacebookUser user;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sender = new MessageSender();
        facebookUser = new FacebookUser("email@outlook.com", "Ukraine", new Date());
        user = new MyFacebookUser(facebookUser);
    }

    @org.junit.jupiter.api.Test
    void send() {
        assertTrue(sender.send("Some text.", user, "email@outlook.com"));
        assertFalse(sender.send("", user, "email@outlook.com"));
        assertFalse(sender.send("Also some text.", user, ""));
    }
}