package twitter;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String email;
    private String userCountry;
    private Date userActiveTime;
}
