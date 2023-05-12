package com.example.aaroe.life;

public abstract class Animal extends Life {


    public Animal(String name) {
        super(name);
    }

    public abstract String shareBreed();

    public abstract String shareSpecies();

    public abstract String shareLifeCycle();

    @Override
    public String respire(){
        return "Taking in oxygen, releasing CO2 . . .";
    }

    public String makeSound() {
        return "Animals make many different noises . . .";
    }

}
