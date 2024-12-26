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

### 1. **Create Employee**
- **URL**: `/emp/createEmp`
- **Method**: `POST`
- **Request Body**: 
  ```json
  {
    "name": "John Doe",
    "password": 12345,
    "salary": 50000,
    "age": 30
  }

### 2. **Get All Employees**
- **URL**:` /emp/employees`
-**Method**:` GET`
-**Response Body**:
````json
  {
    "id": 1,
    "name": "John Doe",
    "password": 12345,
    "salary": 50000,
    "age": 30
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "password": 67890,
    "salary": 60000,
    "age": 25
  }
}

### 3. **Get Employee By ID**
- **URL**: `/emp/employee/{id}`
- **Method**: `GET`
- **Request Parameter**: `id` (The ID of the employee you want to retrieve)
- **Response Body**: 
  ```json
  {
    "id": 1,
    "name": "John Doe",
    "password": 12345,
    "salary": 50000,
    "age": 30
  }

### 4. **Update Employee**
- **URL**: `/emp/updateEmp`
- **Method**: `PUT`
- **Request Body**:
  ```json
  {
    "id": 1,
    "name": "John Doe",
    "password": 12345,
    "salary": 55000,
    "age": 31
  }

###5. **Delete Employee**
-**URL**:` /emp/delEmp/{id}`
-**Method**: `DELETE`
Request Parameter:
id (The ID of the employee to be deleted)

### Steps to Run the Application:

1. **Clone the repository**:
   Clone the project from GitHub to your local machine using the following command:
   ```bash
   git clone https://github.com/anushasekhar03/Employee-Management-System.git

