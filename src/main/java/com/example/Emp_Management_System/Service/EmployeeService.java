package com.example.Emp_Management_System.Service;

import com.example.Emp_Management_System.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee createEmplyee(Employee emp);
    public List<Employee> fetchAllEmployees();
    public Employee fetchEmployeeById(int id);
    public Employee updateEmployee(Employee emp);
    public String deleteEmployee(int id);
}
