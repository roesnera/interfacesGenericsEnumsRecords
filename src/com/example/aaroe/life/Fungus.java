package com.example.aaroe.life;

public class Fungus extends Life{


    public Fungus(String name) {
        super(name);
    }

    // Mushrooms do their mushroom thing!
    @Override
    public String respire() {
        return "I don't really know what mushrooms do to breathe but I assume it's pretty cool . . .";
    }


}
