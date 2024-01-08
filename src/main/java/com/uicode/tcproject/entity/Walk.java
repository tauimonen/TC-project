package com.uicode.tcproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Walk extends Exercise {

    @Column(name = "distance")
    private int distance;

    private Walk() {
    }

    public Walk(Long id, int duration, String description, Date date, boolean done, int distance) {
        super(id, duration, description, date, done);
        this.distance = distance;
    }
}
