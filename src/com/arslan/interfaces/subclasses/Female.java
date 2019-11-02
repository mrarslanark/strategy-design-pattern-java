package com.arslan.interfaces.subclasses;

import com.arslan.interfaces.Gender;

public class Female implements Gender {
    @Override
    public String gender() {
        return "Female";
    }
}
