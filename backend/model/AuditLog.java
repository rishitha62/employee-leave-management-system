package com.leavemanagement.model;

import java.time.LocalDateTime;

public class AuditLog {
    private LocalDateTime timestamp;
    private String action; // e.g., "LLEAVE_APPLIED","LLEAVE_APPROVED", etc.
    private String userId;
    private String details;

    // Constructors, getters, setters
    public AuditLog() {}

    public AuditLog(LocalDateTime timestamp, String action, String userId, String details) {
        this.timestamp = timestamp;
        this.action = action;
        this.userId = userId;
        this.details = details;
    }

    public LocalDateTime getTimestamp() { return timestamp; }
    public String getAction() { return action; }
    public String getUserId() { return userId; }
    public String getDetails() { return details; }

    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public void setAction(String action) { this.action = action; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setDetails(String details) { this.details = details; }
}