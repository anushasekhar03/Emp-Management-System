package com.example.Emp_Management_System.Repository;

import com.example.Emp_Management_System.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
