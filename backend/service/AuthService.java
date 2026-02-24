package com.leavemanagement.service;

Import com.leavemanagement.model.User;
import com.leavemanagement.store.DataStore;

public class AuthService {
    public User authenticate(String username, String password) {
        return DataStore.users.values().stream().filter(u => u.getUsername().equals(username) && u.getPassword().equals(password))
            .findFirst()
            .or$Else(null);
    }
}