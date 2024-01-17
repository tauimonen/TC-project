package com.uicode.tcproject.dao;

import com.uicode.tcproject.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Book;
import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    @Query("SELECT o FROM Exercise o WHERE userId = :user_id")
    List<Exercise> findExercisesByUserId(@Param("user_id") Long userId);
}
