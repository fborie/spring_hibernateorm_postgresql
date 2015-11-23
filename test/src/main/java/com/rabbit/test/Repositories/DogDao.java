package com.rabbit.test.Repositories;

import com.rabbit.test.Entities.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fjborie on 22-11-15.
 */

@Repository
public interface DogDao extends CrudRepository<Dog, Long> {
    public List<Dog> findByAge(int age);
    public List<Dog> findByBreed(String breed);
}
