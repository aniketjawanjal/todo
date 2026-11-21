# ToDo List REST API 📝✅

A task management RESTful web service built with **Spring Boot 3**, **Spring Data JPA**, and **MySQL**, featuring custom enum validation for task priorities and completion statuses.

---

## 🚀 Features

- **Task Management**: Create, update, fetch, and organize tasks.
- **Custom Enum Validation**:
  - `@ValidPriority`: Ensures priorities conform to defined enum constants (`LOW`, `MEDIUM`, `HIGH`).
  - `@ValidStatus`: Ensures task status conforms to valid transitions (`PENDING`, `IN_PROGRESS`, `COMPLETED`).
- **Global Error Handling**: Custom `GlobalExceptionHandler` returning consistent `ErrorDetails`.
- **Relational Persistence**: Spring Data JPA repository backed by MySQL.

---

## 🛠️ Tech Stack

- **Language**: Java 17+ (Java 21 LTS compatible)
- **Framework**: Spring Boot 3
- **Validation**: Jakarta Bean Validation with custom constraints
- **Persistence**: Spring Data JPA / Hibernate
- **Database**: MySQL
- **Build Tool**: Maven

---

## ⚙️ Configuration & Setup

### 1. Database Setup
```sql
CREATE DATABASE ToDoList;
```

### 2. Configure `application.properties`
```properties
spring.application.name=ToDoList
spring.datasource.url=jdbc:mysql://localhost:3306/ToDoList
spring.datasource.username=${DB_USERNAME:root}
spring.datasource.password=${DB_PASSWORD:root}

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build & Run
```bash
# On Linux / macOS
./mvnw clean spring-boot:run

# On Windows PowerShell
.\mvnw.cmd clean spring-boot:run
```

---

## 👤 Author
- **Aniket Jawanjal** - [GitHub Profile](https://github.com/aniketjawanjal)
