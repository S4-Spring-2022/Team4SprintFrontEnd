package com.keyin.controller;


import com.keyin.entity.Health;
import com.keyin.repository.HealthRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class HealthController {
    private final HealthRepository repository;

    HealthController(HealthRepository repository){
        this.repository = repository;
    }

    @GetMapping("/health")
    List<Health> all(){
        return repository.findAll();
    }

    @PostMapping("/health")
    Health newHealth(@RequestBody Health newHealth){
        return repository.save(newHealth);
    }

    @GetMapping("/Health/{id}")
    Optional<Health> one(@PathVariable long id){
        return repository.findById(id);

    }

    @PutMapping("/Health/{id}")
    Health replaceHealth(@RequestBody Health newHealth, @PathVariable Long id) {

        return repository.findById(id)
                .map(health -> {
                    health.setHeight(newHealth.getHeight());
                    health.setWeight(newHealth.getWeight());
                    return repository.save(health);
                })
                .orElseGet(() -> {
                    newHealth.setId(id);
                    return repository.save(newHealth);
                });
    }

    @DeleteMapping("/Health/{id}")
    void deleteHealth(@PathVariable long id){
        repository.deleteById(id);
    }

}
