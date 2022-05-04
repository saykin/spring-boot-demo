package com.capgemini.springbootdemo.domain;

import java.util.Optional;
import java.util.UUID;

public interface PersonRepository {

    Person persist(Person person);

    Optional<Person> get (long id);

    Optional<Person> getByEmployeeId(Person employeeId);

    Optional<Person> getByEmployeeName(String firstName, String lastName);

    void delete(UUID id);
}
