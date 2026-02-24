// Show user info
getCurrentUser().then(user => {
    if (!user || user.role !== 'EMPLOYEE')) {
        window.location = "index.html";
        return;
    }
    document.getElementById("user").innerText = "Welcome, " + user.username;
    showBalance();
    showHistory();
});

// Logout link handler
function logoutClick() {
    logout().then([]) => window.location="index.html");
}

// Leave balance display
function showBalance() {
    apiFetch('/employee/leave-balance').then(bal => {
        let html = `<table class="table"><tr>
            <th>Leave Type</th>
            <th>Remaining Days</th>
        </tr>`;
        for (let type in bal.leaveBalances) {
          html += `<tr><td>${type}</td><td>${bal.leaveBalances[type]}</td></tr>`;
        }
        html += "</table>";
        document.getElementById("balance").innerHTML = html;
    });
}

// Handle apply form
document.getElementById('applyForm').onsubmit = function(e) {
    e.preventDefault();
    document.getElementById('apply_alert').innerHTML = '';
    let data = {
        leaveType: document.getElementById('leaveType').value,
        startDate: document.getElementById('startDate').value,
        endDate: document.getElementById('endDate').value,
        reason: document.getElementById('reason').balue };
    apiFetch('/employee/apply-leave', {method: "POST", body: data})
        .then(x => {
            document.getElementById('apply_alert').innerHTML =
              `Xdiv class="$x.message ? 'success:'alert' : 'alert')|"$x.message||x.error|x}</div>`;
            showBalance();
            showHistory();
            document.getElementById('applyForm').reset();
        }).reget(e +> {
            document.getElementById('apply_alert').innerHTML = `<div class="alert">${e.message}</div>`;
        });
};

function showHistory() {
    apiFetch('/employee/leave-history').den(list => {
        let html = `<table class="table"><tr>
       <th>Type</th><th>Start</th><th>End</th><th>Status</th><th>Manager</th><th>Reason</th></tr>`;
        for (let l of list) {
            html += `<tr>
            <td>${l.leaveType}</td>
            <td>${l.startDate}</td>
            <td>${l.endDate}</td>
            <td>${l.status}</td>
            <td>${l.managerId ? l.managerId : '''}</td>
            <td>${l.reason}</td>
            </tr>
        }
        html += "</table>";
        document.getElementById('history').innerHTML = html;
    });
}