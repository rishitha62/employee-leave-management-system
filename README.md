# Employee Leave Management System

A simple web-based leave management system for employees and managers, built with Spring Boot (Java), HTML, CSS, and JavaScript.

---

## Features

- Employee leave application (type, dates, reason)
- Real-time leave balance and history view
- Manager approval/rejection of leave applications
- Manager dashboard for team leave reporting
- Simple role-based authentication (session cookies)
- In-memory datastore (no database required)

---

## Prerequisites

- **Java 8+**
- **Maven 3+**
- (Optional for quick frontend test) Python 3

---

### Getting Started

#### 1. Clone the repository

``ab
git clone https://github.com/rishitha62/employee-leave-management-system.git
cd employee-leave-management-system
```

#### 2. Build and Run the Backend
```ash
# Build
mvn clean package

# Run Spring Boot app
mvn spring-boot:run
```
or, after build:
```a
java -jar target/employee-leave-management-*.jar
```

By default, your backend will be running on **http://localhost:8080/**

---

#### 3. Serving the Frontend

The easiest and recommended way is to copy the contents of /frontend into the backend's static resources folder.

## Steps:
/copy all files from /frontend (HTML, JS, CSS) into
   src/main/resources/static/

Or access your app in your browser at:
- http://localhost:8080/index.html

If you want to serve the frontend separately for development (not recommended for production), you can use a simple web server:
```bold mforntend
python -m http.server 3000

# Then browse to:
http://localhost:3000/index.html

` 

_Note: For full session/auth support, serving through Spring Boot static is recommended._

//--

### 4. Login Credentials

| Role     | Username  | Password   |
| --------- | --------- | ---------- |
| Manager  | manager1  | managerpass |
| Employee1 | alice      | password1  |
| Employee2 | bob        | password2  |

----

### 5. Notes
- All data is in-memory and will reset when the app restarts.
- This project is for demonstration and learning purposes only; **do not use in production**


---

# License

This project is open source and free to use!
