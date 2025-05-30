package com.keyin;

import java.util.ArrayList;
import java.util.List;
//
//private long userId;
//private String name;
//private String email;
//private String password;

public class LoginSystem {
    // This class is a placeholder for the login system functionality.
    List<User> users = new ArrayList<User>();

    public void registerUser(Long userId, String name, String email, String password) {
        User user = new User(userId, name, email, password);
        users.add(user);
    }
    public boolean login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public List<User> getAllUsers() {
        return users;
    }

}
