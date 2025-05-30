package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginSystemTest {


    LoginSystem loginSystem;
    long userId = 1;
    String name = "John Doe";
    String email = "j_j@j.com";
    String password = "password123";


    @BeforeEach
    void setUp() {
        loginSystem = new LoginSystem();
        long userId = 1;
        name = "John Doe";
        email = "j_j@j.com";
        password = "password123";
        loginSystem.registerUser(userId, name, email, password);
    }
    @Test
    void testRegistration() {
        Assertions.assertEquals(1, loginSystem.users.size());
        Assertions.assertFalse(loginSystem.users.isEmpty());

    }

    @Test
    void testLogin() {
        Assertions.assertTrue(loginSystem.login(email, password));
        Assertions.assertFalse(loginSystem.login(email, "wrongpassword"));
    }

    @Test
    void testGetAllUsers() {
        Assertions.assertEquals(1, loginSystem.users.size());
    }

}
