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
    public String growOlder(){
        this.rings++;
        return "Another decade older, another decade wiser.";
    }

    public int getRings() {
        return rings;
    }

    @Override
    public String shareSpecies() {
        return "I am a "+this.species;
    }

    @Override
    public String shareLifeCycle() {
        return "I gestate from a wee little seed in the dirt and then grow tall and mighty . . .";
    }
}
