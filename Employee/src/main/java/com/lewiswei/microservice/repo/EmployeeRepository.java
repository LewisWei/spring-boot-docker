package com.lewiswei.microservice.repo;


import com.lewiswei.microservice.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
