package com.uicode.tcproject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "exercise")
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "duration")
    private int duration;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Date date;

    @Column(name = "is_done")
    private boolean isDone;

    @Enumerated(EnumType.STRING)
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

}
