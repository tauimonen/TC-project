package com.uicode.tcproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Cycling extends Exercise {

    @Column(name = "distance")
    private int distance;

    @Enumerated(EnumType.STRING)
    private RunType runType;

    public Cycling(Long id, int duration, String description, Date date, boolean done, int distance, RunType runType) {
        super(id, duration, description, date, done);
        this.distance = distance;
        this.runType = runType;
    }

    private Cycling() {
    }
}

