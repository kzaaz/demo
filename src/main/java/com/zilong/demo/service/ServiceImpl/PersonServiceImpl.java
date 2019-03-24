package com.zilong.demo.service.ServiceImpl;

import com.zilong.demo.dataObject.Person;
import com.zilong.demo.repository.PersonRepository;
import com.zilong.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public List<Person> findList() {

        List<Person> list = personRepository.findAll();
        return list;
    }

    @Override
    public Person save(Person person) {
        Person p = personRepository.save(person);
        return p;
    }

    @Override
    public void del(Person person) {
        personRepository.delete(person);

    }

    @Override
    public Person findOne(String id) {
        Person person = personRepository.getOne(id);
        return person;
    }
}
