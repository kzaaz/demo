package com.zilong.demo.repository;

import com.zilong.demo.dataObject.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,String> {



}
