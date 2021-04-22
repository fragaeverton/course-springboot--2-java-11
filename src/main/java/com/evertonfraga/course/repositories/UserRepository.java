package com.evertonfraga.course.repositories;

import com.evertonfraga.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
