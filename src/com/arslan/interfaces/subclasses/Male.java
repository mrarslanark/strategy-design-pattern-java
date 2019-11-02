package com.arslan.interfaces.subclasses;

import com.arslan.interfaces.Gender;

public class Male implements Gender {
    @Override
    public String gender() {
        return "Male";
    }
}
