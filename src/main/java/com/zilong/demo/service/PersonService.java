package com.zilong.demo.service;

import com.zilong.demo.dataObject.Person;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonService {

    List<Person> findList();

    Person save(Person person);

    void del(Person person);

    Person findOne(String id);
}
