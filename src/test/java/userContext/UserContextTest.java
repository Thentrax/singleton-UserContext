package userContext;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserContextTest {

    @Test
    public void mustReturnUsername(){
        UserContext.getInstance().setUsername("Thiago");
        assertEquals("Thiago", UserContext.getInstance().getUsername());
    }

    @Test
    public  void mustReturnAuthToken(){
        UserContext.getInstance().setAuthToken("abc123");
        assertEquals("abc123", UserContext.getInstance().getAuthToken());
    }

    @Test
    public  void mustReturnUserType(){
        UserContext.getInstance().setUserType("Administrador");
        assertEquals("Administrador", UserContext.getInstance().getUserType());
    }


}