package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Kennel {
    /**
     * all elements are references to Pet objects
     */
    private ArrayList<Pet> petList;

    public Kennel(Pet... pets) {
        this.petList = new ArrayList<Pet>(Arrays.asList(pets));
    }

    /**
     * postcondition: for each Pet in the kennel, its name followed
     *                by the result of a call to its speak method
     *                has been printed, one line per Pet
     */
    public void allSpeak() {
        for (Pet p : petList)
            System.out.println(p.getName() + ": " + p.speak());
    }
}