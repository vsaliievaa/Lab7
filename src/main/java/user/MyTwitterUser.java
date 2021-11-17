package user;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    public String getEmail() {
        return twitterUser.getEmail();
    }

    public String getUserCountry() {
        return twitterUser.getUserCountry();
    }

    public Date getUserActiveTime() {
        return twitterUser.getUserActiveTime();
    }
}
