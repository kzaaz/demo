package com.zilong.demo.controller;

import com.zilong.demo.dataObject.Person;
import com.zilong.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public ModelAndView list(Map<String,Object> map){
        List<Person> list =  personService.findList();
        map.put("list",list);

        return new ModelAndView("person/list",map);
    }

    @GetMapping("/del")
    public ModelAndView del(@RequestParam("id") String id,
                    Map<String,Object> map){
        Person p = personService.findOne(id);
        personService.del(p);
        List<Person> list =  personService.findList();
        map.put("list",list);
        return new ModelAndView("person/list",map);
    }

    @GetMapping("/update")
    public ModelAndView update(@RequestParam(value ="id",required = false) String id,
                               Map<String,Object> map){
        if(!StringUtils.isEmpty(id)){
            Person person = personService.findOne(id);
            map.put("person",person);
        }
        return new ModelAndView("person/add",map);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Person person,
                             Map<String,Object> map){
        Random random = new Random();
        Integer number = random.nextInt(90000);
        String str = String.valueOf(number);
        if(StringUtils.isEmpty(person.getId())){
            person.setId(str);
        }
        personService.save(person);
        List<Person> list = personService.findList();
        map.put("list",list);
        return new ModelAndView("person/list",map);
    }
}
