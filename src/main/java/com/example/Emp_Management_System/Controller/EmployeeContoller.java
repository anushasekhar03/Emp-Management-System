package com.example.Emp_Management_System.Controller;


import com.example.Emp_Management_System.Entity.Employee;
import com.example.Emp_Management_System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeContoller {

    @Autowired
    EmployeeService service;

    @PostMapping("/createEmp")
    public Employee createEmployee(@RequestBody Employee emp){
        return service.createEmplyee(emp);
    }

    @GetMapping("/employees")
    public List<Employee> fetchAllEmployees(){
        return service.fetchAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable int id){
        return service.fetchEmployeeById(id);
    }

    @PutMapping("/updateEmp")
    public Employee updateEmployee(@RequestBody Employee emp){
        return service.updateEmployee(emp);
    }

    @DeleteMapping("/delEmp/{id}")
    public String deleteEmployee(@PathVariable int id){
        return service.deleteEmployee(id);
    }
}
