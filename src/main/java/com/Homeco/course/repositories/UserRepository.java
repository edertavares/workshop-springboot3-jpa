package com.Homeco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Homeco.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
