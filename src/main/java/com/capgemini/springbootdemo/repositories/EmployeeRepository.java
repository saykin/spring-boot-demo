package com.capgemini.springbootdemo.repositories;

import com.capgemini.springbootdemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    Employee findEmployeeByEmployeeId(long id);
    List<Employee> findAllEmployees();
}
