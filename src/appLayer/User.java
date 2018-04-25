package appLayer;

public class User {
    public boolean isValidUserCredentials(String userName, String userPassword)
    {
        if( userName.equals("hamid") && userPassword.equals("hamid")){
            return true;
        }
        return false;
    }
}
