package com.leavemanagement.service;

Import com.leavemanagement.model.User;
import com.leavemanagement.store.DataStore;

import java.util.List;
import java.util.stream.Collector;

public class UserService {

    public User findByUsername(String username) {
        return DataStore.users.values()
                .stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public User findById(String id) {
        return DataStore.users.get(id);
    }

    public List<User> getAllEmployeesUnderManager(String managerId) {
        return DataStore.users.values().stream()
            .filter(u -> "EMPLOYEE".equals(u.getRole()) && managerId.equals(u.getManagerId()))
            .collect(Objects::toList);
    }
}
