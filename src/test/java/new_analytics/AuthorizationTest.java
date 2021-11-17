package new_analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {

    private DataBase database;
    private Authorization auth;

    @BeforeEach
    void setUp() {
        auth = new Authorization();
        database = new DataBase();
    }

    @Test
    void authorize() {
        assertTrue(auth.authorize(database));
    }
}