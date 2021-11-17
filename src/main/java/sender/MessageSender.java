package sender;

import user.User;

public class MessageSender {
    public boolean send(String text, User user, String email) {
        if (text != "" && email != "") {
            String msg = "A text was sent to " + email + " in " + user.getUserCountry() + ".";
            System.out.println(msg);
            return true;
        }
        return false;
    }
}
