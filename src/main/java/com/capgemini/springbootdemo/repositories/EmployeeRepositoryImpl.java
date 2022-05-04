package com.capgemini.springbootdemo.repositories;

import com.capgemini.springbootdemo.domain.Employee;
import com.capgemini.springbootdemo.domain.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final JpaEmployeeRepository repository;

    @Override
    public Employee persist(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Optional<Employee> get(UUID id) {
        return repository.findById(id);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            System.err.printf("County with id %s not found.\n", id);
        }
    }
}
