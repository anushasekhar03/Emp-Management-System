package com.example.Emp_Management_System.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;
    @Column
    String name;
    @Column
    int password;
    @Column
    int salary;
    @Column
    int age;

    public Employee() {
    }

    public Employee(int id, String name, int password, int salary, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
