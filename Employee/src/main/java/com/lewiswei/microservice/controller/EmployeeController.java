package com.lewiswei.microservice.controller;

import com.lewiswei.microservice.repo.EmployeeRepository;
import com.lewiswei.microservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        Employee result = employeeRepository.save(employee);
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> get(@PathVariable String id) {
        Employee employee = employeeRepository.findOne(id);
        return ResponseEntity.ok(employee);
    }

}
