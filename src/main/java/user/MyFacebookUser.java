package user;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getEmail() {
        return facebookUser.getEmail();
    }

    public String getUserCountry() {
        return facebookUser.getUserCountry();
    }

    public Date getUserActiveTime() {
        return facebookUser.getUserActiveTime();
    }

}
