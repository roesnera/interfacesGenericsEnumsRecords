package com.example.aaroe.life;

import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.Species;

public class Flower extends Plant implements Species {

    private final MySpecies species;

    public Flower(String name, MySpecies species) {
        super(name);
        this.species = species;
    }

    public void attractBees() {
        System.out.println("Come here you cute lil buggers!");
    }

    @Override
    public void shareSpecies() {
        System.out.println("I am a "+this.species);
    }
}
