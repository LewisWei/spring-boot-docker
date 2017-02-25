package com.lewiswei.microservice.controller;

import com.lewiswei.microservice.repo.EmployeeRepository;
import com.lewiswei.microservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        Employee created = employeeRepository.save(employee);
        return ResponseEntity.ok(created);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> get(@PathVariable String id) {
        Employee employee = employeeRepository.findOne(id);
        return ResponseEntity.ok(employee);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> employees = employeeRepository.findAll();
        return ResponseEntity.ok(employees);
    }

}
