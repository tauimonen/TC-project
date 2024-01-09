package com.uicode.tcproject.dao;

import com.uicode.tcproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
