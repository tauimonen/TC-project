package com.uicode.tcproject.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "duration")
    private int duration;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Date date;

    @Column(name = "done")
    private boolean isDone;

    @Column(name = "exercise_type")
    private ExerciseType exerciseType;

    @Column(name = "distance")
    private int distance;

    @Enumerated(EnumType.STRING)
    private IntensityType intensityType;

    protected Exercise() {
    }

    public Exercise(Long id, int duration, String description, Date date, boolean isDone) {
        this.id = id;
        this.duration = duration;
        this.description = description;
        this.date = date;
        this.isDone = isDone;
    }

    // Getter and Setter methods
}
