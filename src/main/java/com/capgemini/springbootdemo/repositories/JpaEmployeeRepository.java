package com.capgemini.springbootdemo.repositories;

import com.capgemini.springbootdemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaEmployeeRepository extends JpaRepository<Employee, UUID> {
}
