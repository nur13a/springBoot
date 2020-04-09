package kg.itAcademy.springBootProject.service;

import kg.itAcademy.springBootProject.entity.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal>getAllAnimals();

    Animal getById(Long id);

    Animal add(Animal animal);

    void deleteById(Long id);

    Animal update(Animal animal);
}
