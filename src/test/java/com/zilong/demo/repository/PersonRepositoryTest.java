package com.zilong.demo.repository;

import com.zilong.demo.dataObject.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void savePersonTest(){

        Person p = new Person();
        p.setPersonName("张三");
        p.setAge(12);
        Person ps = personRepository.save(p);
        Assert.assertNotNull(ps);

    }


}