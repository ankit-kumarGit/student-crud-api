# Student CRUD REST API

A simple Spring Boot REST API project for managing students using in-memory storage (`List<Student>`).  
This project was built to practice Spring Boot fundamentals like REST APIs, Dependency Injection, layered architecture, and CRUD operations.

---

## Features

- Add a student
- Get all students
- Get student by ID
- Delete student
- Search student by name
- Dependency Injection using Constructor Injection
- `@Primary` and `@Qualifier` practice
- In-memory data storage using Java List

---

## Tech Stack

- Java 21
- Spring Boot
- Gradle
- Postman
- Git & GitHub

---

##Project Structure

```text
src/main/java/com/ankit/studentapi
│
├── controller
│   ├── StudentController
│   └── NotificationController
│
├── service
│   └── StudentService
│
├── model
│   └── Student
│
├── notification
│   ├── NotificationService
│   ├── EmailNotification
│   └── SmsNotification
│
└── StudentapiApplication

```
---
## API Endpoints
1. Get All Students
``` GET /students ```
2. Get Student By ID
``` GET /students/{id} ```

Example:

``` GET /students/1 ```
3. Add Student
``` POST /students ```

Request Body:
```
{
  "id": 1,
  "name": "Ankit",
  "course": "CSE"
}
```
4. Delete Student
``` DELETE /students/{id} ```

Example:

``` DELETE /students/1 ```
5. Search Student By Name
``` GET /students/search?name=Ankit ```
6. Notification API
``` GET /notify ```

Used to practice:

@Primary
@Qualifier
Interface-based Dependency Injection
---
Running The Project

Clone repository:

``` git clone https://github.com/ankit-kumarGit/student-crud-api.git ```

Go inside project folder:

``` cd student-crud-api ```

Run project:

``` ./gradlew bootRun ```

Server runs on:

``` http://localhost:8080 ```
