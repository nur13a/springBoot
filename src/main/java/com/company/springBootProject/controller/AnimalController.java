package kg.itAcademy.springBootProject.controller;

import kg.itAcademy.springBootProject.entity.Animal;
import kg.itAcademy.springBootProject.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAll(){
        return animalService.getAllAnimals();
    }

    @PostMapping
    public Animal create(@RequestBody Animal animal){
        return animalService.add(animal);
    }

}
