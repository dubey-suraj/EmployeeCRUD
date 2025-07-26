//package com.rest.springboot.cruddemo.dao;
//
//import com.rest.springboot.cruddemo.entity.Employee;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class EmployeeDAOJpaImpl implements EmployeeDAO{
//
//    // define field for entity manager
//
//    private EntityManager entityManager;
//
//    // setup constructor injection
//
//    @Autowired
//    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
//        entityManager = theEntityManager;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//
//        // create a query
//        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
//
//        // excute query and get result list
//        List<Employee> employees = theQuery.getResultList();
//
//        // return the results
//        return employees ;
//    }
//
//    @Override
//    public Employee findById(int theId) {
//
//        // get the employee
//        Employee theEmployee = entityManager.find(Employee.class, theId);
//
//        // return employee
//        return theEmployee;
//    }
//
//    @Override
//    public Employee save(Employee theEmployee) {
//        // save employee
//        Employee dbEmployee = entityManager.merge(theEmployee);
//
//        // return the saved employee
//        return dbEmployee;
//    }
//
//    @Override
//    public void deleteById(int theId) {
//
//        // find the employee
//        Employee theEmployee = entityManager.find(Employee.class, theId);
//
//        // delete the employee
//        entityManager.remove(theEmployee);
//
//    }
//}
