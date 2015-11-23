package com.rabbit.test.Controllers;

import com.rabbit.test.Entities.Dog;
import com.rabbit.test.Services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fjborie on 23-11-15.
 */

@RestController
@RequestMapping("/")
public class DogController {

    @Autowired
    private DogService dogService;

    @RequestMapping(value="dogs", method = RequestMethod.GET)
    public Iterable<Dog> getAllDogs(){
        return dogService.getAll();
    }

    @RequestMapping(value="add_dog", method = RequestMethod.POST)
    public void addDog(){
        Dog dog = new Dog(5,"macho","cocker");
        dogService.save(dog);
    }
}
