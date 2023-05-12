package com.example.aaroe.life;

import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.Plant;
import com.example.aaroe.interfaces.Species;
import com.example.aaroe.interfaces.Life;

public class Flower implements Life, Species, Plant {

    private final MySpecies species;

    private final String name;

    public Flower(String name, MySpecies species) {
        this.name = name;
        this.species = species;
    }

    // All life must metabolize some energy source
    public void metabolizeEnergySource(){
        System.out.println("Feeling more energetic . . .");
    }

    @Override
    public String getName() {
        return name;
    }

    public void attractBees() {
        System.out.println("Come here you cute lil buggers!");
    }

    @Override
    public void shareSpecies() {
        System.out.println("I am a "+this.species);
    }

    @Override
    public void respire() {
        System.out.println("Capturing carbon, internalizing sunlight, releasing oxygen . . .");
    }
}
