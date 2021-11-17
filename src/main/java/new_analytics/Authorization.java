package new_analytics;

import analytics.Авторизація;
import analytics.БазаДаних;

public class Authorization extends Авторизація {
    public boolean authorize(DataBase database) {
        БазаДаних db = database;
        return авторизуватися(db);
    }
}
