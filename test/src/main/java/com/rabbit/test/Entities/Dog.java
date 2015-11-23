package com.rabbit.test.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by fjborie on 22-11-15.
 */
@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private long id;
    @JsonProperty
    private int age;
    @JsonProperty
    private String gender;
    @JsonProperty
    private String breed;

    public Dog(){}

    public Dog(int age, String gender, String breed){
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }
}
