package com.example.aaroe.life;

import com.example.aaroe.enums.MySpecies;

import java.util.Objects;

public class Tree extends Plant {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree tree)) return false;
        if (!super.equals(o)) return false;
        return rings == tree.rings && species == tree.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rings, species);
    }
}
