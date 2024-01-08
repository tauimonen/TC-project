package com.uicode.tcproject.dao;

import com.uicode.tcproject.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    // find exercises by userId, return List<Exercise>

}
