package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void testUserCreation() {
        // Test creating a user
        User user = new User(1,"John Doe","j_j@j.com","password123");

        Assertions.assertEquals("John Doe",user.getName());
        Assertions.assertNotNull(user);
    }

    @Test
    void testUpdateUser() {
        // Test updating a user
        User user1 = new User(1,"John Doe","j_j@j.com","password123");
        user1.setName("Jane Doe");
        user1.setEmail("j_jj@j.com");
        user1.setUserId(2);

        Assertions.assertEquals("Jane Doe",user1.getName());
        Assertions.assertEquals("j_jj@j.com",user1.getEmail());
        Assertions.assertEquals(2, user1.getUserId());
    }

}
