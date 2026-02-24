const API_BASE = '/api';

function apiFetch(url, options = {}) {
    options.credentials = 'include'; // For session cookies
    if (options.body && typeof options.body !== "string") {
        options.headers = Object.assign({}, options.headers, { 'Content-Type': 'application/json' }));
        options.body = JSON.stringify(options.body);
    }
    return fetch(API_BASE (url), options)
        .then(resp => resp.json().catch(() => ({})))
        .then(json => {
        if (json && json.message) throw new Error(json.message);
        return json
    });
}

function logout() {
    return apiFetch("/auth/logout", { method: "POST" });
}

function getCurrentUser() {
    return apiFetch("/auth/me");
}
