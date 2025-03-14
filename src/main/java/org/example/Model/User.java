package org.example.Model;

import org.example.Model.Enums.Fitness_Goal;
import org.example.Model.Enums.Gender;

import java.util.Date;
import java.util.Objects;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Gender gender;
    private Date BirthDay;
    private double height;
    private double weight;
    private Fitness_Goal fitnessGoal;

    // Constructor

    public User(int id, String firstName, String lastName, String email, String password, Gender gender, Date birthDay, double height, double weight, Fitness_Goal goal) {
        this(id, firstName, lastName, email, password);
        setGender(gender);
        setBirthDay(birthDay);
        setHeight(height);
        setWeight(weight);
        setFitnessGoal(goal);
    }

    public User(int id, String firstName, String lastName, String email, String password) {
       setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
    }


    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }


    public Date getBirthDay() {
        return BirthDay;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Fitness_Goal getFitnessGoal() {
        return fitnessGoal;
    }


    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        Objects.requireNonNull(firstName, "Firstname missing.");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        Objects.requireNonNull(lastName, "Lastname missing.");
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        Objects.requireNonNull(email, "Email missing.");
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(Gender gender) {
        // can be null, but in that case
        // todo: add this question in for nutrition advice function to generate advice
        this.gender = gender;
    }


    public void setBirthDay(Date birthDay) {
        // can be null, but in that case
        // todo: add these questions in workout generator and nutrition advice for accurate result
        BirthDay = birthDay;
    }

    public void setHeight(double height) {
        // can be null, but in that case
        // todo: add this question in for nutrition advice function to generate advice
        this.height = height;
    }

    public void setWeight(double weight) {
        // can be null, but in that case
        // todo: add this question in for nutrition advice function to generate advice
        this.weight = weight;
    }

    public void setFitnessGoal(Fitness_Goal fitnessGoal) {
        // can be null, but in that case
        // todo: add these questions in workout generator and nutrition advice for accurate result
        this.fitnessGoal = fitnessGoal;
    }
}
