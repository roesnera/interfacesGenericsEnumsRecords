package com.example.aaroe.life;

import com.example.aaroe.enums.MyBreeds;
import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.Breed;
import com.example.aaroe.interfaces.Species;

public class Dog extends Animal implements Species, Breed {

    private final MyBreeds breed;
    private final MySpecies species;
    public Dog(String name, MyBreeds breed, MySpecies species) {
        super(name);
        this.breed = breed;
        this.species = species;
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public String shareBreed() {
        return "I am a "+this.breed;
    }

    @Override
    public String shareSpecies() {
        return "I am a "+this.species;
    }

    @Override
    public String shareLifeCycle() {
        return "I am born in a litter with my siblings!";
    }
}
