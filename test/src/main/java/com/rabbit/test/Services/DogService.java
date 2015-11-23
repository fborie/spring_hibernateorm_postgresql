package com.rabbit.test.Services;

import com.rabbit.test.Entities.Dog;
import com.rabbit.test.Repositories.DogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fjborie on 23-11-15.
 */

@Service
public class DogService {

    @Autowired
    private DogDao dogDao;

    public void save(Dog dog){
        dogDao.save(dog);
    }

    public Iterable<Dog> getAll(){
        return dogDao.findAll();
    }

    public Dog getById(Long id){
        return dogDao.findOne(id);
    }

}
