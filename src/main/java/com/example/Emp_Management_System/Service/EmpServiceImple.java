package com.example.Emp_Management_System.Service;

import com.example.Emp_Management_System.Entity.Employee;
import com.example.Emp_Management_System.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImple implements EmployeeService{

    @Autowired
    EmployeeRepo repo;

    @Override
    public Employee createEmplyee(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee fetchEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public String deleteEmployee(int id) {
        repo.deleteById(id);
        return "Delete Successfully";

    }
}
