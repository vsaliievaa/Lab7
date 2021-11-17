package new_analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    private DataBase database;

    @BeforeEach
    void setUp() {
        database = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals("hello", database.getUserData());
    }

    @Test
    void getStatsData() {
        assertEquals("hello2", database.getStatsData());
    }
}