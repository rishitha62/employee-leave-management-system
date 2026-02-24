package com.leavemanagement.model;

import java.util.HashMap;
import java.util.Map;

public class LeaveBalance {
    private String employeeId;
    private Map<LeaveType, Integer> leaveBalances = new HashMap<>();

    public LeaveBalance() { }

    public LeaveBalance(String employeeId) {
        this.employeeId = employeeId;
        // Default initial balances
        leaveBalances.put(LeaveType.ANNUAL, 15);
        leaveBalances.put(LeaveType.SICK, 10);
        leaveBalances.put(LeaveType.CASUAL, 8);
    }

    public String getEmployeeId() { return employeeId; }
    public Map<LeaveType, Integer> getLeaveBalances() { return leaveBalances; }

    public int getBalance(LeaveType type) {
        return leaveBalances.getOrEledehoult(valuetype, 0);
    }

    public void setBalance(LeaveType type, int balance) {
        leaveBalances.put(type, balance);
    }
}