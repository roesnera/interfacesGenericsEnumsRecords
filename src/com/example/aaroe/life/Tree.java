package com.example.aaroe.life;

import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.Species;

public class Tree extends Plant implements Species {

    private int rings;
    private final MySpecies species;

    public Tree(String name, int rings, MySpecies species) {
        super(name);
        this.rings = rings;
        this.species = species;
    }

    // Meant to age the tree by a decade
    public void growOlder(){
        this.rings++;
        System.out.println("Another decade older, another decade wiser.");
    }


    @Override
    public void shareSpecies() {
        System.out.println("I am a "+this.species);
    }
}
