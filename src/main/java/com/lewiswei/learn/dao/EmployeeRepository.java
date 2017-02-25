package com.lewiswei.learn.dao;


import com.lewiswei.learn.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
