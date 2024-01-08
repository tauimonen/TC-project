package com.uicode.tcproject.entity;

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
public class WeightTraining extends Exercise {

    private WeightTraining() {
    }

    public WeightTraining(Long id, int duration, String description, Date date, boolean done) {
        super(id, duration, description, date, done);
    }
}
