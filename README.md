# StudentRecord-Management-System

A simple Student Record Management System built with Java and Spring Boot. This project allows you to manage student records including adding, updating, viewing, and deleting student information.

## Features

- **User Authentication:** Basic login/logout system (Spring Security, in-memory user).
- **CRUD Operations for Students:**
  - Add new students with name, age, and email.
  - View all students in a tabular format.
  - Update existing student records.
  - Delete student records.
- **RESTful API Endpoints** for integration or extension.
- **Simple Web Interface:** HTML pages for login, adding, updating, and viewing students.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Security (in-memory authentication)
- **MySQL Database**
- Thymeleaf/HTML

## Endpoints

- `/loginpage` — Login screen
- `/indexs` — Main dashboard showing all students
- `/addstudent` — Form to add new student
- `/updateform/{id}` — Form to update a student with the given ID

### API Endpoints

- `GET /getallstudents` — Returns JSON list of all students
- `GET /getstudent/{id}` — Returns a student by ID
- `POST /addstudentdb` — Adds a new student (expects JSON)
- `PUT /update/{id}` — Updates an existing student (expects JSON)
- `DELETE /deletee/{id}` — Deletes a student by ID

## Default Credentials

- **Username:** `user`
- **Password:** `user123`

## Setup & Installation

1. Clone the repository:
   ```
   git clone https://github.com/saiteja70136/StudentRecord-Management-System.git
   ```
2. Navigate to the project directory:
   ```
   cd StudentRecord-Management-System
   ```
3. Configure your MySQL database settings in `src/main/resources/application.properties`:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
   spring.datasource.username=your_mysql_username
   spring.datasource.password=your_mysql_password
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Build and run the application using Maven or your preferred IDE:
   ```
   ./mvnw spring-boot:run
   ```
5. Access the application at [http://localhost:8080/loginpage](http://localhost:8080/loginpage)  
   or [http://localhost:8082/loginpage](http://localhost:8082/loginpage)  
   (use port 8082 if port 8080 is already in use on your machine).

> **Note:**  
> By default, Spring Boot runs on port 8080.  
> To run the application on port 8082, start it with the following command:
> ```
> ./mvnw spring-boot:run -Dspring-boot.run.arguments="--server.port=8082"
> ```
> Or, if using an IDE, set the `server.port` property to `8082` in your run configuration or in `src/main/resources/application.properties`:
> ```
> server.port=8082
> ```

> The application uses MySQL as the database. Ensure your MySQL server is running and the database credentials are correct.

## License

This project is for educational purposes.
