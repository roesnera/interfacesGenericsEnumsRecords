package com.example.aaroe.life;

public class Animal extends Life {


    public Animal(String name) {
        super(name);
    }

    @Override
    public String respire(){
        return "Taking in oxygen, releasing CO2 . . .";
    }

    public String makeSound() {
        return "Animals make many different noises . . .";
    }
}
