package org.example.Model;

import org.example.Model.Enums.WorkoutStyle;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Workout {

    private int userId;
    private String title;
    private Date date;
    private WorkoutStyle workoutStyle;
    private ArrayList<Exercises> exercises;
    private Time estimatedTime;


    // Constructor

    public Workout(int userId, String title, ArrayList<Exercises> exercises, Date date, WorkoutStyle workoutStyle, Time estimatedTime) {
        this(userId, title, exercises);
        setDate(date);
        setWorkoutStyle(workoutStyle);
        setEstimatedTime(estimatedTime);
    }

    public Workout(int userId, String title, ArrayList<Exercises> exercises) {
        setUserId(userId);
        setTitle(title);
        setExercises(exercises);
    }

    // Getters

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public WorkoutStyle getWorkoutStyle() {
        return workoutStyle;
    }

    public ArrayList<Exercises> getExercises() {
        return exercises;
    }

    public Time getEstimatedTime() {
        return estimatedTime;
    }

    // Setters


    public void setUserId(int userId) {
        if (userId == 0 ) throw new NullPointerException("No user id given.");
        this.userId = userId;
    }

    public void setTitle(String title) {
        Objects.requireNonNull(title, "Title missing.");
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWorkoutStyle(WorkoutStyle workoutStyle) {
        this.workoutStyle = workoutStyle;
    }

    public void setExercises(ArrayList<Exercises> exercises) {
        Objects.requireNonNull(exercises, "No exercises added.");
        this.exercises = exercises;
    }

    public void setEstimatedTime(Time estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
}
