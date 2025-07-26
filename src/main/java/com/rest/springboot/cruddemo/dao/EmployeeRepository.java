package com.rest.springboot.cruddemo.dao;

import com.rest.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // No additional methods are needed as JpaRepository provides basic CRUD operations
    // You can define custom query methods here if needed
}
