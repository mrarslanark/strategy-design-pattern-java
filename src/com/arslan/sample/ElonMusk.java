package com.arslan.sample;

import com.arslan.interfaces.Gender;
import com.arslan.interfaces.subclasses.Male;
import com.arslan.model.Person;

public class ElonMusk extends Person {

    public ElonMusk() {
        super(
                "Elon",
                "",
                "Musk",
                "American, South African, Canadian",
                new Male());
    }

    @Override
    public int age() {
        return 48;
    }
}
