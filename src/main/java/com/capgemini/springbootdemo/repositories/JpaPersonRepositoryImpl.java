package com.capgemini.springbootdemo.repositories;

import com.capgemini.springbootdemo.domain.Person;
import com.capgemini.springbootdemo.domain.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class JpaPersonRepositoryImpl implements PersonRepository {

    private final JpaPersonRepository jpaPersonRepository;

    @Override
    public Person persist(Person person) {
        return jpaPersonRepository.save(person);
    }

    @Override
    public Optional<Person> get(long id) {
        return jpaPersonRepository.findById(id);
    }

    @Override
    public Optional<Person> getByEmployeeId(Person employeeId) {
        return jpaPersonRepository.findBy(employeeId.getEmployeeId());
    }

    @Override
    public Optional<Person> getByEmployeeName(String firstName, String lastName) {
        return Optional.empty();
    }

    @Override
    public void delete(UUID id) {

    }
}
