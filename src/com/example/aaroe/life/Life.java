package com.example.aaroe.life;

import java.util.Objects;

public abstract class Life {

    // Everyone has a name!
    private final String name;

    public Life(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // All life must metabolize some energy source
    public String metabolizeEnergySource(){
        return "Feeling more energetic . . .";
    }

    // All life respires in its own unique way
    public abstract String respire();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Life life)) return false;
        return name.equals(life.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
