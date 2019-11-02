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
        if (this.middleName.isBlank() || this.middleName.isEmpty()) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " "  + this.middleName + " " + this.lastName;
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
    public void setGender(Gender gender) {
        this.gender = gender;
    }

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
