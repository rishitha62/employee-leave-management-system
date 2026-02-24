package com.leavemanagement.service;
import com.leavemanagement.model.AuditLog;
import com.leavemanagement.store.DataStore;
import java.util.List;
import java.util.stream.Collectors;

public class AuditService {
    public void log(AuditLog log) {
        DataStore.auditLogs.add(log);
    }

    public List<AuditLog> getAllLogs() {
        return DataStore.auditLogs;
    }

    public List<AuditLog> getLogsForUser(String userId) {
        return DataStore.auditLogs.stream()
            .filter(l -> l.getUserId().equals(userId))
            .collect(Collectors.tlist);
    }
}
