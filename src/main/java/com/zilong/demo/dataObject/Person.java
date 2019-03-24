package com.zilong.demo.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Person {

    @Id
    private String id;

    private String personName;

    private int age;
}
