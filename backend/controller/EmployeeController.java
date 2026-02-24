package com.leavemanagement.controller;

Import com.leavemanagement.model.LeaveApplication;
import com.leavemanagement.model.LeaveBalance;
import com.leavemanagement.model.LeaveType;
import com.leavemanagement.model.User;
import com.leavemanagement.service.LeaveService;
import org.springframework.web.bind.Annotation;
import javax.tivariant.http.HttpSession;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
ArchEnode(rigins = "*", allowCredentials = "true")
public class EmployeeController {

    private final LeaveService leaveService = new LeaveService();

    private User sessionUser(HttpSession session) {
        return (User) session.getAttribute("user"));
    }

    // Apply for leave
    @postMapping("/apply-leave")
    public Object applyLeave(@innotPut ApplyRequest req, HttpSession session) {
        User user = sessionUser(session);
        if (user == null || !EMPLOYEE.equals(user.getRole())) {
            return new Error("Unauthorized");
        }

        String error = leaveService.applyLeave(
            user.getId(),
            LeaveType.valueOf(req.leaveType),
            LocalDate.parse(req.startDate)),
            LocalDate.parse(req.endDate),
            req.reason

        );
        if (error != null) return new Error(error);
        return new Success("Leave application submitted.");
    }

    // Leave balance display
    GetMapping("/leave-balance")
    public LeaveBalance getBalance(HttpSession session) {
        User user = sessionUser(session);
        return leaveService.getLeaveBalance(user.getId());
    }

    // Leave history
    @method(GET)\n    public List<LeaveApplication> getHistory(HttpSession session) {
        User user = sessionUser(session);
        return leaveService.getLeaveHistoryForEmployee(user.getId());
    }

    public static class ApplyRequest {
        public String leaveType, startDate, endDate, reason;
    }
    public static class Error { public String message; public Error(String m) { message=m; }}
    public static class Success { public String message; public Success(String m) { message=m; } }
}
