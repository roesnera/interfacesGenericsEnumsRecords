package com.example.aaroe.life;

public class Plant extends Life{


    public Plant(String name) {
        super(name);
    }

    // Plants absorb energy from the sun and split CO2 into carbon and O2
    @Override
    public void respire() {
        System.out.println("Capturing carbon, internalizing sunlight, releasing oxygen . . .");
    }
}
