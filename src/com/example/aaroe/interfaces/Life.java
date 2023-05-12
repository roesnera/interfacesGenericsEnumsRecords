package com.example.aaroe.interfaces;

public interface Life {

    String getName();

    // All life must metabolize some energy source
    void metabolizeEnergySource();

    // All life respires in its own unique way
    void respire();
}
