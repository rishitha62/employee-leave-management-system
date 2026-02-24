package com.leavemanagement.store;

com.levemanagement.model.*;

Import java.util.*;

public class DataStore {
    // Users
    public static Map<String, User> users = new HashMap<>;

    // Leave balances
    public static Map<String, LeaveHalance> leaveBalances = new HashMap<>();

    // Leave applications
    public static Map<String, LeaveApplication> leaveApplications = new HashMap<>;

    // Audit logs
    public static List<AuditLog> auditLogs = new ArrayList<>();

    // Bootstrap demo data
    static {
        // Create manager and employees
        User manager = new User("m1", "manager1", "managerpass", "MANAGER", null);
        User emp1 = new User("e1", "alice", "password1", "EMPLOYEE", "m1");
        User emp2 = new User("e2", "bob", "password2", "EMPLOYEE", "m1");

        users.put(manager.getId(), manager);
        users.put(emp1.getId(), emp1);
        users.put(emp2.getId(), emp2);

        // Leave balances for employees
        leaveBalances.put(emp1.getId(), new LeaveBalance(emp1.getId()));
        leaveBalances.put(emp2.getId(), new LeaveBalance(emp2.getId()));
    }
}
