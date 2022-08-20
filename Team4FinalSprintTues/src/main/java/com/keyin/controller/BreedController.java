package com.keyin.controller;

import com.keyin.entity.Breed;
import com.keyin.repository.BreedRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class BreedController {
    private final BreedRepository repository;

    BreedController(BreedRepository repository){
        this.repository = repository;
    }

    @GetMapping("/breeds")
    List<Breed> all(){
        return repository.findAll();
    }

    @PostMapping("/breeds")
    Breed newBreed(@RequestBody Breed newBreed){
        return repository.save(newBreed);
    }

    @GetMapping("/breeds/{id}")
    Optional<Breed> one(@PathVariable long id){
        return repository.findById(id);
    }

    @DeleteMapping("/breeds/{id}")
    void deleteBreed(@PathVariable long id){
        repository.deleteById(id);
    }
}
