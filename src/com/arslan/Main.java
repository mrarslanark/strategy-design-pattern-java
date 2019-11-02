package com.arslan;

import com.arslan.model.Person;
import com.arslan.sample.ElonMusk;
import com.arslan.sample.TaylorSwift;

public class Main {

    public static void main(String[] args) {

        // Elon Musk - Test
        Person elonMusk = new ElonMusk();
        System.out.println(elonMusk.display());

        System.out.println();

        // Taylor Swift - Test
        Person taylorSwift = new TaylorSwift();
        System.out.println(taylorSwift.display());

    }
}
