package com.example.aaroe;

import com.example.aaroe.enums.MyBreeds;
import com.example.aaroe.enums.MySpecies;
import com.example.aaroe.interfaces.Breed;
import com.example.aaroe.interfaces.Species;
import com.example.aaroe.life.*;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Class-based arraylists
        ArrayList<Life> livingThings = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Plant> plants = new ArrayList<>();
        ArrayList<Fungus> fungi = new ArrayList<>();

        // Interface-based arraylists
        ArrayList<Breed> catsNDogs = new ArrayList<>();
        ArrayList<Species> species = new ArrayList<>();


        // Instances of all non-abstract classes
        Animal firstAnimal = new Animal("Original Animal");
        Plant oldPlant = new Plant("Real old plant");
        Fungus spaceShroom = new Fungus("Mushroom from space!");
        Dog fido = new Dog("Fido", MyBreeds.TERRIER, MySpecies.CANINE);
        // TODO: Cat, Flower, Tree

        // Section for adding all appropriate instances to their respective arraylists
        livingThings.add(firstAnimal);
        livingThings.add(oldPlant);
        livingThings.add(spaceShroom);
        livingThings.add(fido);


        // Section for calling all available methods on instances in arraylists
        for(Life thing: livingThings){
            thing.metabolizeEnergySource();
            thing.respire();
        }

    }
}
