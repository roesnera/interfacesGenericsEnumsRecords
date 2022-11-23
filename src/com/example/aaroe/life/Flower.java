package com.example.aaroe.life;

import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.Species;

public class Flower extends Plant implements Species {

    private final MySpecies species;

    public Flower(String name, MySpecies species) {
        super(name);
        this.species = species;
    }

    public String attractBees() {
        return "Come here you cute lil buggers!";
    }

    @Override
    public String shareSpecies() {
        return "I am a "+this.species;
    }

    @Override
    public String shareLifeCycle() {
        return "I gestate from a wee little seed in the dirt . . .";
    }
}
