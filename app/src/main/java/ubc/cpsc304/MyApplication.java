package ubc.cpsc304;

import android.app.Application;

public class MyApplication extends Application {
    private String username;
    private UserType userType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType.name();
    }

    public void setUserType(String string) {
        this.userType = UserType.valueOf(string);
    }

    private enum UserType {
        REGULAR, ADMIN, DEVELOPER
    }
}
