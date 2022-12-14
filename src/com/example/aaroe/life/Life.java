package com.example.aaroe.life;

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
    public void metabolizeEnergySource(){
        System.out.println("Feeling more energetic . . .");
    }

    // All life respires in its own unique way
    public abstract void respire();
}
