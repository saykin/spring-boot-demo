package com.capgemini.springbootdemo.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository {

    Employee persist(Employee employee);

    Optional<Employee> get(UUID id);

    List<Employee> getAll();

    void delete(UUID id);
}
