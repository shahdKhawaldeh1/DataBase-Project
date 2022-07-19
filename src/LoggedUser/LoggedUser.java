package LoggedUser;

import Models.student;

public class LoggedUser {

    private static Object LoggedIn;
    private LoggedUser(){}

    public Object getLoggedUser()
    {
        return LoggedIn;
    }
    public static void setLoggedUser(Object o)
    {
        LoggedIn = o;
    }

}
