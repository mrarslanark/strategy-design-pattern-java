package com.arslan;

import com.arslan.interfaces.subclasses.Male;
import com.arslan.model.Person;

public class Main {

    public static void main(String[] args) {

        Person elonMusk = new ElonMusk();
        System.out.println(elonMusk.display());

    }
}
