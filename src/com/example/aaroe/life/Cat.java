package com.example.aaroe.life;

import com.example.aaroe.enums.MyBreeds;
import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.*;

public class Cat implements Animal, Species, Breed, Life {

    private final MyBreeds breed;
    private final MySpecies species;

    private final String name;
    public Cat(String name, MyBreeds breed, MySpecies species) {
        this.name = name;
        this.breed = breed;
        this.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    // All life must metabolize some energy source
    public void metabolizeEnergySource(){
        System.out.println("Feeling more energetic . . .");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
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
