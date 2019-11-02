package com.arslan.sample;

import com.arslan.interfaces.Gender;
import com.arslan.interfaces.subclasses.Female;
import com.arslan.model.Person;

public class TaylorSwift extends Person {

    public TaylorSwift() {
        super(
                "Taylor",
                "Alison",
                "Swift",
                "American",
                new Female());
    }

    @Override
    public int age() {
        return 29;
    }
}
