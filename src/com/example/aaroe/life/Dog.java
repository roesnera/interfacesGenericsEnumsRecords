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
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void shareBreed() {
        System.out.println("I am a "+this.breed);
    }

    @Override
    public void shareSpecies() {
        System.out.println("I am a "+this.species);
    }
}
