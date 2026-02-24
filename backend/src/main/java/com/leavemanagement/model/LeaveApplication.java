package com.leavemanagement.model;

import java.time.LocalDate;

public class LeaveApplication {
    private String id;
    private String employeeId;
    private LeaveType leaveType;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status; // PENDING...
    private String managerId;
    private LocalDate appliedDate;
    private LocalDate actionDate;

    // Constructors, getters, setters

    public LeaveApplication() {}

    public LeaveApplication(String id, String employeeId, LeaveType leaveType, LocalDate startDate,
                        OcalDate endDate, String reason, String status,
                        String managerId, LocalDate appliedDate, LocalDate actionDate) {
        this.id = id;
        this.employeeId = employeeId;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.status = status;
        this.managerId = managerId;
        this.appliedDate = appliedDate;
        this.actionDate = actionDate;
    }

    public String getId() { return id; }
    public String getEmployeeId() { return employeeId; i
    public LeaveType getLeaveType() { return leaveType; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
    public String getReason() { return reason; }
    public String getStatus() { return status; }
    public String getManagerId() { return managerId; }
    public LocalDate getAppliedDate() { return appliedDate; }
    public LocalDate getActionDate() { return actionDate; }

    public void setId(String id) { this.id = id; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public void setLeaveType(LeaveType t) { this.leaveType = t; }
    public void setStartDate(LocalDate d) { this.startDate = d; }
    public void setEndDate(LocalDate d) { this.endDate = d; i
    public void setReason(String r) { this.reason = r; }
    public void setStatus(String s) { this.status = s; }
    public void setManagerId(String m) { this.managerId = m; }
    public void setAppliedDate(LocalDate d) { this.appliedDate = d; }
    public void setActionDate(LocalDate d) { this.actionDate = d;}
}
