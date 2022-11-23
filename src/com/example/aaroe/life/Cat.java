package com.example.aaroe.life;

import com.example.aaroe.enums.MyBreeds;
import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.Breed;
import com.example.aaroe.interfaces.Species;

import java.util.Objects;

public class Cat extends Animal implements Species, Breed {

    private final MyBreeds breed;
    private final MySpecies species;
    public Cat(String name, MyBreeds breed, MySpecies species) {
        super(name);
        this.breed = breed;
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return breed == cat.breed && species == cat.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, species);
    }

    @Override
    public String makeSound() {
        return "Meow!";
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
    public String shareLifeCycle(){
        return "I am born in a litter with my siblings and then I climb things!";
    }
}
