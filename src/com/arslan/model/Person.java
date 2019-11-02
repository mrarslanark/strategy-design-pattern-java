package com.arslan.model;

import com.arslan.interfaces.Gender;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public abstract class Person {

    // Properties
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationality;

    // Interface
    private Gender gender;

    // Abstract Methods
    public abstract int age();

    // Parameterized Constructor
    @Contract(pure = true)
    public Person(String firstName, String middleName, String lastName, String nationality, Gender gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.gender = gender;
    }

    // region Class Methods

    // Returns full name
    @NotNull
    private String fullName() {
        if (this.getMiddleName().isBlank() || this.getMiddleName().isEmpty()) {
            return this.getFirstName() + " " + this.getLastName();
        } else {
            return this.getFirstName() + " "  + this.getMiddleName() + " " + this.getLastName();
        }
    }

    // Show gender
    private String showGender() {
        return gender.gender();
    }

    // Display Details
    public String display() {
        return "Full Name: " + this.fullName() + "\n" +
                "Nationality(ies): " + this.getNationality() + "\n" +
                "Gender: " + this.showGender() + "\n" +
                "Age: " + this.age();
    }

    // endregion

    // region Getters and Setters

    @Contract(pure = true)
    private String getFirstName() {
        return firstName;
    }


    @Contract(pure = true)
    private String getMiddleName() {
        return middleName;
    }

    @Contract(pure = true)
    private String getLastName() {
        return lastName;
    }


    @Contract(pure = true)
    private String getNationality() {
        return nationality;
    }

    // endregion
}
