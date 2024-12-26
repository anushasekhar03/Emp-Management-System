# Employee Management System

## Description
The **Employee Management System** is a web application built using **Spring Boot** that allows users to perform CRUD (Create, Read, Update, Delete) operations on employee records. It uses **MySQL** as the database for storing employee details. This system is designed to provide an easy-to-use interface to manage employee data including personal details like name, salary, age, department, etc. The project is ideal for anyone looking to understand the basics of Spring Boot and JPA with MySQL.

### Key Features:
- **Add Employees**: Create new employee records with details like name, salary, age, and department.
- **View Employees**: Retrieve details of all employees or individual employee records by ID.
- **Update Employee Data**: Modify employee information such as salary, age, or department.
- **Delete Employees**: Remove employee records from the database.
- **RESTful API Endpoints**: Expose APIs for interaction with the frontend or for integration purposes.

## Technologies Used
- **Java 17**: Programming language used for backend development.
- **Spring Boot 3.4.1**: The main framework used for building the backend application.
- **Spring Data JPA**: Used for data persistence and to interact with the MySQL database.
- **Hibernate**: ORM (Object Relational Mapping) tool used in conjunction with Spring Data JPA to handle database operations.
- **MySQL 8.0**: The relational database management system used for storing employee data.
- **Postman**: Used for testing RESTful API endpoints.
- **Maven**: Dependency management and build tool used to handle project dependencies.

## Endpoints
###Test the API using Postman:
Open Postman and test the API endpoints mentioned above. For example:
Create an Employee: POST http://localhost:8080/emp/createEmp
Get All Employees: GET http://localhost:8080/emp/employees
Get Employee by ID: GET http://localhost:8080/emp/employee/{id}
Update an Employee: PUT http://localhost:8080/emp/updateEmp
Delete an Employee: DELETE http://localhost:8080/emp/delEmp/{id}

### Steps to Run the Application:

1. **Clone the repository**:
   Clone the project from GitHub to your local machine using the following command:
   ```bash
   git clone https://github.com/anushasekhar03/Employee-Management-System.git

