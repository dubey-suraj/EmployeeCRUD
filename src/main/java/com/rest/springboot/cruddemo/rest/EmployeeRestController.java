//package com.rest.springboot.cruddemo.rest;
//
//import com.rest.springboot.cruddemo.entity.Employee;
//import com.rest.springboot.cruddemo.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@CrossOrigin(origins = "http://localhost:4200") // Allow cross-origin requests from Angular app
//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {
//
//    private EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeRestController(EmployeeService theEmployeeService) {
//        employeeService = theEmployeeService;
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> findAll(){
//        return  employeeService.findAll();
//    }
//
//    // add mapping for Get /employees/{employeeId}
//    @GetMapping("/employees/{employeeId}")
//    public Employee getEmployee(@PathVariable int employeeId) {
//
//        Employee theEmployee = employeeService.findById(employeeId);
//
//        // if null, throw exception
//        if(theEmployee == null) {
//            throw new RuntimeException("Employee id not found - " + employeeId);
//        }
//
//        return theEmployee;
//    }
//
//    // add mapping for Post /employees - add new employee
//    @PostMapping("/employees")
//    public Employee addEmployee(@RequestBody Employee theEmployee) {
//
//        // also just in case they pass an id in JSON ... set id to 0
//        // this is to force a save of new item ... instead of update
//        theEmployee.setId(0);
//        Employee dbEmployee = employeeService.save(theEmployee);
//        return dbEmployee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee theEmployee) {
//
//        Employee updatedEmployee = employeeService.save(theEmployee);
//        return updatedEmployee;
//    }
//
//    @DeleteMapping("/employees/{employeeId}")
//    public String deleteEmployee(@PathVariable int employeeId) {
//
//        Employee tempEmployee = employeeService.findById(employeeId);
//
//        // throw exception if null
//        if(tempEmployee == null) {
//            throw new RuntimeException("Employee id not found - " + employeeId);
//        }
//
//        employeeService.deleteById(employeeId);
//        return "Deleted employee id - " + employeeId;
//    }
//
//}