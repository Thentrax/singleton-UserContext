package userContext;

public class UserContext {

    private UserContext() {}
    private static final UserContext instance = new UserContext();
    public static UserContext getInstance(){
        return instance;
    }

    private String username;
    private String authToken;
    private String userType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
