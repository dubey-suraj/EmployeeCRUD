package com.rest.springboot.cruddemo.rest;

import com.rest.springboot.cruddemo.dao.EmployeeDAO;
import com.rest.springboot.cruddemo.entity.Employee;
import com.rest.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200") // Allow cross-origin requests from Angular app
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return  employeeService.findAll();
    }

    // add mapping for Get /employees/{employeeId}
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {

        Employee theEmployee = employeeService.findById(employeeId);

        // if null, throw exception
        if(theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        return theEmployee; 
    }
}
