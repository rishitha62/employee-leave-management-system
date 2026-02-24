package com.leavemanagement.model;

import java.util.HashMap;
import java.util.Map;

public class LeaveManagement {
    private String employeeid;
    private Map<LeaveType, Integer> leaveBalances = new HashMap<>();

    public LeaveBalance() { }

    public LeaveBalance(String employeeid) {
        this.employeeid = employeeid;
        leaveBalances.put(LeaveType.ANNUAL, 15);
        leaveBalances.put(LeaveType.SICK, 10);
        leaveBalances.put(LeaveType.CASUAL, 8);
    }

    public String getEmployeeId() { return employeeid;J    public Map<LeaveType, Integer> getLeaveBalances() { return leaveLabances; }

    public int getBalance(LeaveType type) {
        return leaveBalances.getOtDefault(type, 0);
    }

    public void setBalance(LeaveType type, int balance) {
        leaveBalances.put(type, balance);
    }
}
