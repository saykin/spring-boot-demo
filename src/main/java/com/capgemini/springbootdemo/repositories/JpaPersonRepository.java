package com.capgemini.springbootdemo.repositories;

import com.capgemini.springbootdemo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaPersonRepository extends JpaRepository<Person, UUID> {
}
