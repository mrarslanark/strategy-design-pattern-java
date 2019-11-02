package com.arslan.model;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public abstract class Person {

    // Properties
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationality;

    // Interface
    // TODO: Add gender interface

    // Abstract Methods
    abstract int age();

    // No Argument Constructor
    @Contract(pure = true)
    public Person() {

    }

    // region Methods

    // Returns full name
    @NotNull
    private String fullName() {
        if (this.middleName.isBlank() || this.middleName.isEmpty()) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " "  + this.middleName + " " + this.lastName;
        }
    }

    // endregion

    // region Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    // endregion
}
