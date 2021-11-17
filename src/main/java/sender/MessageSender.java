package sender;

import user.User;

import java.util.Date;

public class MessageSender {
    public boolean send(String text, User user, String email) {
        if (!text.equals("") && !email.equals("")) {
            String msg = "A text was sent to " + email + " in " + user.getUserCountry() + ".";
            System.out.println(msg);
            return true;
        }
        System.out.println("Something went wrong. Please, try again.");
        return false;
    }
}
