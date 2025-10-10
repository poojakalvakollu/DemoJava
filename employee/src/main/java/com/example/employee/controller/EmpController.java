package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.employee.entity.Employee;
import com.example.employee.service.EmpService;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmpService service;

    // POST
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee e) {
        return service.addEmployee(e);
    }

    // GET all
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    // GET by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee e) {
        return service.updateEmployee(e);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}

