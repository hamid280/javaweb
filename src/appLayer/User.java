package appLayer;

import dataLayer.DB_user;

public class User {
    public boolean isValidUserCredentials(String userName, String userPassword)
    {
        DB_user db_user = new DB_user();
        return db_user.isValidUserLogin(userName,userPassword);

    }
}
