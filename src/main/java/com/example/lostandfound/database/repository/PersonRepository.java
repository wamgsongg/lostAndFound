package com.example.lostandfound.database.repository;

import com.example.lostandfound.database.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
